package com.antlr.ui;

import javafx.scene.image.Image;
import javafx.scene.paint.Color;


public class ConstantUI {
    /**
     * 软件名称
     */
    public final static String App_Name = "CRON";

    /**
     * 主窗口大小
     */

    public final static int MAINWINDOW_WIDTH = 1500;

    public final static int MAINWINDOW_HEIGHT = 900;

    /**
     * 滑动调整
     */
    public final static int SCALE_MAX = 30;

    public final static int SCALE_MIN = 0;

    public final static double SCALE_FACTOR = 0.1;

    public final static double SCALE_DEFAULT = 1.5;
    /**
     * 颜色
     */
    public final static Color MAIN_BACKGROUND_COLOR = Color.WHITE;

    public final static Color TOOL_BAR_COLOR = Color.web("#71CBD3");

    public final static Color SELECTED_COLOR = Color.web("#161C29");

    public final static java.awt.Color AWT_BAR_COLOR = new java.awt.Color(22,28,41);

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

    public final static Image FILE_ENABLED = new Image(IMAGES_DIR+"/fileEnabled.png");

    public final static Image FILE_DISABLED = FILE_ENABLED ;

    public final static Image PARSER = new Image(IMAGES_DIR+"/lexer.png");

    public final static Image LEXER = new Image(IMAGES_DIR+"/parser.png");

}
