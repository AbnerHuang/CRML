package com.antlr.ui.pane;


import javafx.geometry.Insets;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;

public class GrammarPane extends GridPane {

    /**
     * 界面定义
     */
    private static InputPane inputPane;
    private static TreeResultPane treeResultPane;




    public GrammarPane(){
        initialize();
        addListener();
    }


    private void initialize(){

        inputPane = new InputPane();
        treeResultPane = new TreeResultPane();

        this.add(inputPane,0,0);
        this.add(treeResultPane,1,0);
        this.setPadding(new Insets(10,30,10,30));
        this.setVgap(20);
        this.setHgap(20);
        this.autosize();
    }

    private void addListener(){


    }
}
