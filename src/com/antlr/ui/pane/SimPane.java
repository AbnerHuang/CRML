package com.antlr.ui.pane;

import com.antlr.ui.ConstantUI;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.Pane;

public class SimPane extends Pane {
    public SimPane(){


        Button testButton = new Button("测试");
        testButton.getStylesheets().add(ConstantUI.CSS_DIR+"/textButton.css");
        this.getChildren().add(testButton);
    }
}
