package com.antlr.ui.pane;

import com.antlr.parse.ParsingUtil;
import com.antlr.ui.AppMainWindow;
import com.antlr.ui.ConstantUI;
import com.antlr.ui.IconButton;
import com.antlr.util.FileProcess;
import com.antlr.util.SetUI;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.scene.control.*;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.stage.FileChooser;
import org.antlr.v4.gui.TreeTextProvider;
import org.antlr.v4.gui.TreeViewer;
import org.antlr.v4.runtime.Parser;
import org.antlr.v4.runtime.tree.TerminalNode;
import org.antlr.v4.runtime.tree.Tree;

import java.io.File;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class InputPane extends BorderPane {

    /**
     * 输入界面    */

    private TextArea inputArea;
    private ScrollPane inputScrollPane;
    private ToggleGroup inputToggle;
    private RadioButton inputButton;
    private RadioButton fileButton;
    private TextField fileText;
    private IconButton fileIconButton;
    private HBox chooseHBox;

    public InputPane(){
        initialize();
        addListener();

    }

    private void initialize(){
        chooseHBox = new HBox();
        chooseHBox.setSpacing(10);
        inputToggle = new ToggleGroup();

        inputButton = new RadioButton("输入");
        inputButton.setToggleGroup(inputToggle);
        fileButton = new RadioButton("文件");
        fileButton.setToggleGroup(inputToggle);



        fileText = new TextField();
        fileIconButton = new IconButton(ConstantUI.FILE_ENABLED,ConstantUI.FILE_DISABLED,
                null);
        fileIconButton.setId("fileIconButton");

        chooseHBox.getChildren().addAll(inputButton,fileButton,fileText,fileIconButton);

        this.setTop(chooseHBox);


        /**
         * 输入面板中部输入界面设置
         */

        inputArea = new TextArea();
        inputScrollPane = new ScrollPane(inputArea);
        inputScrollPane.setFitToHeight(true);
        inputScrollPane.setFitToWidth(true);
        this.setCenter(inputScrollPane);
        this.getStylesheets().addAll(ConstantUI.CSS_DIR+"/inputPane.css");
        SetUI.setPaneSize(this,600,400);
    }

    private void addListener() {
        inputButton.selectedProperty().addListener(new ChangeListener<Boolean>() {
            @Override
            public void changed(ObservableValue<? extends Boolean> observable, Boolean oldValue, Boolean newValue) {
                if (newValue) {
                    inputArea.setEditable(true);
                    inputArea.getStylesheets().clear();
                    inputArea.getStylesheets().add(ConstantUI.CSS_DIR + "/inputPane.css");
                    fileText.setEditable(false);
                    fileText.setStyle("-fx-background-color: #efefef;-fx-cursor: mouse");
                    fileIconButton.setDisable(true);
                }
            }
        });

        fileButton.selectedProperty().addListener(new ChangeListener<Boolean>() {
            @Override
            public void changed(ObservableValue<? extends Boolean> observable, Boolean oldValue, Boolean newValue) {
                if (newValue) {
                    inputArea.setEditable(false);
                    inputArea.getStylesheets().add(ConstantUI.CSS_DIR + "/uneditable.css");
                    fileText.setEditable(true);
                    fileText.setStyle("-fx-background-color: #ffffff");
                    fileIconButton.setDisable(false);
                }
            }
        });

        fileIconButton.setOnAction((ActionEvent event) -> {
            FileChooser fileChooser = new FileChooser();
            fileChooser.getExtensionFilters().addAll(
                    new FileChooser.ExtensionFilter("CRON", "*.cron"),
                    new FileChooser.ExtensionFilter("TXT", "*.txt"),
                    new FileChooser.ExtensionFilter("JSON", "*.json")
            );
            File file = fileChooser.showOpenDialog(this.getScene().getWindow());
            if (file != null) {
                fileText.setText(file.getAbsolutePath());
                inputArea.appendText(FileProcess.fileToString(file));
            }

        });

        inputArea.textProperty().addListener(new ChangeListener<String>() {
            @Override
            public void changed(ObservableValue<? extends String> observable, String oldValue, String newValue) {
                AppMainWindow.setParsingResult(ParsingUtil.parseCRONGrammar(newValue));
//                Tree tree = AppMainWindow.getParsingResult().parseTree;
                TreeResultPane.setParseTreeViewer(AppMainWindow.getParsingResult().parser,
                        AppMainWindow.getParsingResult().parseTree);
                TreeResultPane.setParseHierachy(AppMainWindow.getParsingResult().parser,
                        AppMainWindow.getParsingResult().parseTree);
            }
        });
    }
}
