package net.aidanlovelace.gamedev.reference;

import net.aidanlovelace.gamedev.Game;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by aidanlovelace on 2/8/15.
 */
public class References {
    //MAIN
    public static final String TITLE = "Game Dev -by Aidan Lovelace";
    public static int SCREEN_WIDTH = 200;
    public static int SCREEN_HEIGHT = 200;

    //SCREEN
    public static int PIXEL_SIZE = 3;
    public static int TILE_SIZE = 16;

    //GAME THREAD
    public static int UPDATES_PER_SECOND = 50;
    public static int FRAMES_PER_SECOND = 100;
    public static long MAX_FRAMESKIP = 5;

    //Game
    public static Game GAME;

    //LISTENER
    public static List<Integer> PRESSED_KEYS = new ArrayList();
    public static int MOUSE_X;
    public static int MOUSE_Y;
}
