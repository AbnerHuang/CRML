package com.antlr.util;

import javafx.scene.layout.Pane;

public class SetUI {
    public static void setPaneSize(Pane pane,int Width,int Height){
        pane.setPrefHeight(Height);
        pane.setMaxHeight(Height);
        pane.setMinHeight(Height);

        pane.setPrefWidth(Width);
        pane.setMinWidth(Width);
        pane.setMaxWidth(Width);
    }
}
