package com.antlr.ui.pane;


import com.antlr.ui.ConstantUI;
import javafx.embed.swing.SwingNode;
import javafx.event.ActionEvent;
import javafx.scene.control.*;
import javafx.scene.control.MenuItem;
import javafx.scene.control.ScrollPane;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseButton;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.BorderPane;
import javafx.stage.FileChooser;
import org.antlr.v4.gui.TreeTextProvider;
import org.antlr.v4.gui.TreeViewer;
import org.antlr.v4.runtime.Parser;
import org.antlr.v4.runtime.tree.TerminalNode;
import org.antlr.v4.runtime.tree.Tree;
import org.apache.batik.dom.GenericDOMImplementation;
import org.apache.batik.svggen.SVGGraphics2D;
import org.w3c.dom.DOMImplementation;
import org.w3c.dom.Document;


import java.awt.*;
import java.io.File;
import java.util.Arrays;

public class TreeResultPane extends TabPane {

    /**
     * 输出界面定义
     */
    private Tab graphTab;
    private Tab treeTab;

    /**
     * Swing界面 TreeViewer
     */
    private BorderPane parseTreePanel;
    private static ScrollPane parseScrollPane;
    private static TreeViewer parseTreeViewer;
    private Slider scaleSlider;
    private static SwingNode parseTreeNode;

    /**
     * ContextMenu
     */
    private ContextMenu saveTreeMenu;
    private MenuItem saveAsPNG;
    private MenuItem saveAsSVG;

    /**
     * Hierarchy Viewer
     */
    private static TreeItem<String> cronItem;
    private static TreeView<String> parseHierachy;
    private static TreeTextProvider treeTextProvider;


    public TreeResultPane(){
        initializeParseTreePanel();
        initialize();
        addListener();
    }

    private void initialize(){
        graphTab = new Tab();
        graphTab.setText("解析树");
        graphTab.setClosable(false);


        graphTab.setContent(parseTreePanel);

        treeTab = new Tab();
        treeTab.setText("层次结构");
        treeTab.setClosable(false);

        cronItem  = new TreeItem<>("cron",new ImageView(ConstantUI.PARSER));
        parseHierachy = new TreeView<>(cronItem);
        treeTab.setContent(parseHierachy);

        this.getTabs().addAll(graphTab,treeTab);
        this.getStylesheets().addAll(ConstantUI.CSS_DIR+"/treeResultPane.css");
        this.setPrefSize(600,400);
    }

    private void initializeParseTreePanel(){

        parseTreePanel = new BorderPane();

        parseTreeNode = new SwingNode();
        parseTreeViewer = new TreeViewer(null,null);
        parseTreeViewer.setBackground(Color.white);
        parseTreeViewer.setFont(new Font("Times New Roman",0,12));
        parseTreeNode.setContent(parseTreeViewer);

        parseScrollPane = new ScrollPane(parseTreeNode);
        parseScrollPane.setVbarPolicy(ScrollPane.ScrollBarPolicy.ALWAYS);
        parseScrollPane.setHbarPolicy(ScrollPane.ScrollBarPolicy.ALWAYS);

        saveTreeMenu = new ContextMenu();
        saveAsPNG = new MenuItem("Save as PNG");
        saveAsPNG.setStyle("-fx-font-family:Monospaced");
        saveAsSVG = new MenuItem("Save as SVG");
        saveAsSVG.setStyle("-fx-font-family:Monospaced");
        saveTreeMenu.getItems().addAll(saveAsPNG,saveAsSVG);

        scaleSlider = new Slider();
        scaleSlider.setValue((int)(ConstantUI.SCALE_DEFAULT/ConstantUI.SCALE_FACTOR));
        scaleSlider.setMax(ConstantUI.SCALE_MAX);
        scaleSlider.setMin(ConstantUI.SCALE_MIN);


        parseTreePanel.setCenter(parseScrollPane);
        parseTreePanel.setBottom(scaleSlider);
    }

    private void addListener(){

        scaleSlider.valueChangingProperty().addListener((observable, oldValue, newValue) -> {
            double scaleValue = (double)scaleSlider.getValue()*ConstantUI.SCALE_FACTOR;
            if(parseTreeViewer != null) {
                parseTreeViewer.setScale(scaleValue);
            }
        });

        parseTreeNode.addEventHandler(MouseEvent.MOUSE_CLICKED,(MouseEvent event)->{
            if(event.getButton() == MouseButton.SECONDARY)
                saveTreeMenu.show(parseTreeNode,event.getScreenX(),event.getScreenY());
        });

        saveAsPNG.setOnAction((ActionEvent event)->{
            FileChooser saveChooser = new FileChooser();
            saveChooser.getExtensionFilters().add(
                    new FileChooser.ExtensionFilter("PNG","*.png")
            );
            saveChooser.setTitle("Sava Image");
            File file = saveChooser.showSaveDialog(this.getScene().getWindow());
            if(file!=null){
                String filename = file.getName();
                System.out.println(filename);
                try{
                    parseTreeViewer.save(filename);
                }catch (Exception exception){
                    exception.printStackTrace();
                }
            }
        });

        saveAsSVG.setOnAction((ActionEvent event)->{
            FileChooser saveChooser = new FileChooser();
            saveChooser.getExtensionFilters().add(
                    new FileChooser.ExtensionFilter("SVG","*.svg")
            );
            saveChooser.setTitle("Sava Image");
            File file = saveChooser.showSaveDialog(this.getScene().getWindow());
            if(file!=null){
                DOMImplementation domImpl = GenericDOMImplementation.getDOMImplementation();
                Document document = domImpl.createDocument("http://www.w3.org/2000/svg",
                        "svg",null);
                SVGGraphics2D svgGenerator = new SVGGraphics2D(document);
                parseTreeViewer.paint(svgGenerator);
                try{
                    svgGenerator.stream(file.getAbsolutePath(),true);
                }catch (Exception exception){
                    exception.printStackTrace();
                }
            }
        });
    }

    public static void  setParseTreeViewer(Parser parser,Tree tree){
        parseTreeViewer.setTree(tree);
        parseTreeViewer.setRuleNames(Arrays.asList(parser.getRuleNames()));
        parseTreeNode.setContent(parseTreeViewer);
    }

    public static void  setParseHierachy(Parser parser,Tree tree){
        treeTextProvider = new TreeViewer.DefaultTreeTextProvider(
                Arrays.asList(parser.getRuleNames()));

        parseHierachy.setRoot(displayHierarchy(tree));

    }

    private static TreeItem<String> displayHierarchy(Tree tree){
        if(tree == null)
            return null;
        if(tree instanceof TerminalNode){
            TreeItem<String> terminalItem = new TreeItem<>(treeTextProvider.getText(tree),
                    new ImageView(ConstantUI.LEXER));
            return terminalItem;
        }else {
            TreeItem<String> parserItem = new TreeItem<>(treeTextProvider.getText(tree),
                    new ImageView(ConstantUI.PARSER));
            for (int i = 0; i < tree.getChildCount(); i++) {
                parserItem.getChildren().add(displayHierarchy(tree.getChild(i)));
            }
            return parserItem;
        }
    }
}
