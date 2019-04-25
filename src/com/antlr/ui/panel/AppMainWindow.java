package com.antlr.ui.panel;

import com.antlr.ui.ConstantUI;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class AppMainWindow extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("/com/antlr/ui/AppMainWindow.fxml"));
        Scene scene = new Scene(root, ConstantUI.MAINWINDOW_WIDTH,ConstantUI.MAINWINDOW_HEIGHT);

        primaryStage.setScene(scene);
        primaryStage.setTitle(ConstantUI.App_Name);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
