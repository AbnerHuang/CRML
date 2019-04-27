package com.antlr.ui.panel;

import com.antlr.ui.AppMainWindow;
import com.antlr.ui.ConstantUI;
import com.antlr.ui.IconButton;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;

public class ToolBarPane extends Pane {

    private VBox toolBar;

    private IconButton mainButton;


    private IconButton neoButton;
    private IconButton simButton;

    public ToolBarPane(){
        initialize();
        addListener();
    }

    /**
     * 初始化界面相关组件,设置界面属性
     */
    private void initialize(){


        this.getStylesheets().addAll(ConstantUI.CSS_DIR+"/toolBarPane.css",
                ConstantUI.CSS_DIR+"/iconButton.css");
        this.setStyle("-fx-background-color: #161C29");
//        this.setMaxHeight(1600);
//        this.setMinHeight(1600);

        toolBar = new VBox();
        toolBar.setPrefHeight(1600);
        toolBar.setMaxHeight(1600);
        toolBar.setMinHeight(1600);


        mainButton = new IconButton(ConstantUI.MAIN_ENABLED,ConstantUI.MAIN_DISABLED,
                "主界面");
        neoButton = new IconButton(ConstantUI.NEO_ENABLED,ConstantUI.NEO_DISABLED,
                "连接数据库");
        simButton = new IconButton(ConstantUI.SIM_ENABLED,ConstantUI.SIM_DISABLED,
                "进行模拟");


        toolBar.setStyle("-fx-spacing: 10");
        toolBar.getChildren().addAll(mainButton,neoButton,simButton);

        this.getChildren().add(toolBar);
    }

    private void addListener(){
        mainButton.addEventHandler(MouseEvent.MOUSE_CLICKED,(MouseEvent event)->{
            AppMainWindow.getMainPane().getChildren().clear();
            AppMainWindow.getMainPane().getChildren().add(AppMainWindow.getGrammarPane());
        });

        neoButton.addEventHandler(MouseEvent.MOUSE_CLICKED,(MouseEvent event)->{
            AppMainWindow.getMainPane().getChildren().clear();

            AppMainWindow.getMainPane().getChildren().add(AppMainWindow.getNeoPane());
        });

        simButton.addEventHandler(MouseEvent.MOUSE_CLICKED,(MouseEvent event)->{
            AppMainWindow.getMainPane().getChildren().clear();
            AppMainWindow.getMainPane().getChildren().add(AppMainWindow.getSimPane());
        });
    }
}
