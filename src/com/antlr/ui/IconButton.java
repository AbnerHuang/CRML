package com.antlr.ui;

import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Border;

public class IconButton extends Button {

    private  Image enabledImage,disabledImage;
    private String tip;

    /**
     * 构造
     *
     * @param enabledImage  激活图标
     * @param disabledImage 失效图标
     * @param tip           提示
     */

    public IconButton(Image enabledImage, Image disabledImage, String tip){
        this.enabledImage = enabledImage;
        this.disabledImage= disabledImage;
        this.tip = tip;

        setUp();
    }

    private void initialize(){

    }

    private void setUp(){
        this.getStylesheets().add("com/antlr/resources/css/iconButton.css");

        this.setGraphic(new ImageView(disabledImage));
        this.setText(tip);

        this.addEventHandler(MouseEvent.MOUSE_ENTERED,(MouseEvent event)->{
            this.setGraphic(new ImageView(enabledImage));
        });

        this.addEventHandler(MouseEvent.MOUSE_EXITED,(MouseEvent event)->{
            this.setGraphic(new ImageView(disabledImage));
        });


    }
}
