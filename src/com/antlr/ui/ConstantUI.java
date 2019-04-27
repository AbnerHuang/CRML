package com.antlr.ui;

import javafx.scene.control.RadioMenuItem;
import javafx.scene.image.Image;
import javafx.scene.paint.Color;

import java.awt.*;

public class ConstantUI {
    /**
     * 软件名称
     */
    public final static String App_Name = "CRON";

    /**
     * 主窗口大小
     */

    public final static int MAINWINDOW_WIDTH = 1080;

    public final static int MAINWINDOW_HEIGHT = 900;

    /**
     * 颜色
     */
    public final static Color MAIN_BACKGROUND_COLOR = Color.WHITE;

    public final static Color TOOL_BAR_COLOR = Color.web("#71CBD3");

    /**
     * Resource Directory
     */
    public final static String RESOURCE_DIR = "com/antlr/resources";

    public final static String IMAGES_DIR = RESOURCE_DIR+"/images";

    public final static String CSS_DIR = RESOURCE_DIR+"/css";

    /**
     *  Images
     */
    public final static Image MAIN_ENABLED = new Image(IMAGES_DIR+"/mainEnabled.png");

    public final static Image MAIN_DISABLED = new Image(IMAGES_DIR+"/mainDisabled.png");

    public final static Image NEO_ENABLED = new Image(IMAGES_DIR+"/neoEnabled.png");

    public final static Image NEO_DISABLED = new Image(IMAGES_DIR+"/neoDisabled.png");

    public final static Image SIM_ENABLED = new Image(IMAGES_DIR+"/simEnabled.png");

    public final static Image SIM_DISABLED = new Image(IMAGES_DIR+"/simDisabled.png");

}
