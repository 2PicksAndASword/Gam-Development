package net.aidanlovelace.gamedev;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import static net.aidanlovelace.gamedev.reference.References.*;
//import static net.aidanlovelace.gamedev.reference.ImageLibrary.*;
import net.aidanlovelace.gamedev.GameThread;

public class Game {
    //public Screen screen;

    //public Map map;
    public GameThread thread;

    public int FPS;
    public int UPS;

    public Game() {

        //Starts the game thread
        thread = new GameThread();
    }

    public void update(){

    }
    public void tick(){

    }
}
