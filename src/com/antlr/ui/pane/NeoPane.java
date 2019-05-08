package com.antlr.ui.pane;

import javafx.scene.control.Label;
import javafx.scene.layout.Pane;

public class NeoPane extends Pane {
    public NeoPane(){
        this.getChildren().add(new Label("NeoPane"));
    }
}
