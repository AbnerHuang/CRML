package com.antlr.ui;

import com.antlr.parse.ParsingResult;
import com.antlr.ui.pane.*;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class AppMainWindow extends Application {

    private BorderPane appPane;
    private CRONMenuBar cronMenuBar;
    private ToolBarPane toolBarPane;

    private static Pane mainPane;
    private static GrammarPane grammarPane;
    private static NeoPane neoPane;
    private static SimPane simPane;

    private static ParsingResult parsingResult;


    @Override
    public void start(Stage primaryStage) throws Exception {

        initialize();

        Scene scene = new Scene(appPane, ConstantUI.MAINWINDOW_WIDTH,ConstantUI.MAINWINDOW_HEIGHT);

        primaryStage.setScene(scene);
        primaryStage.setTitle(ConstantUI.App_Name);
        primaryStage.getIcons().add(new Image("com/antlr/resources/images/APP_ICON.png"));
        primaryStage.show();
    }

    private void initialize(){

        appPane = new BorderPane();

        cronMenuBar = new CRONMenuBar();
        toolBarPane = new ToolBarPane();
        mainPane = new Pane();

        initializeMainPane();

        appPane.setTop(cronMenuBar);
        appPane.setLeft(toolBarPane);
        appPane.setCenter(mainPane);

    }

    private void initializeMainPane(){
        grammarPane = new GrammarPane();
        neoPane = new NeoPane();
        simPane = new SimPane();

        mainPane.getChildren().add(grammarPane);
    }

    public static Pane getMainPane(){
        return mainPane;
    }

    public static GrammarPane getGrammarPane(){
        return grammarPane;
    }

    public static NeoPane getNeoPane(){
        return neoPane;
    }

    public static SimPane getSimPane(){
        return simPane;
    }

    public static ParsingResult getParsingResult(){
        return parsingResult;
    }

    public static void setParsingResult(ParsingResult parseResult){
        parsingResult = parseResult;
    }

    public static void main(String[] args) {
        launch(args);
    }
}
