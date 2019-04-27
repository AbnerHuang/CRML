package com.antlr.ui.panel;

import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.paint.Color;

public class CRONMenuBar extends MenuBar {

    public CRONMenuBar(){
        initialize();
    }



    private void initialize(){
        Menu fileMenu = new Menu("File");
        Menu editMenu = new Menu("Edit");
        Menu viewMenu = new Menu("View");

        this.getMenus().addAll(fileMenu,editMenu,viewMenu);
        this.getStylesheets().add("com/antlr/resources/css/cronMenuBar.css");

    }
}
