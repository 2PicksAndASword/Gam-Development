package net.aidanlovelace.gamedev;

import javax.swing.*;

/**
 * Created by aidanlovelace on 2/9/15.
 */
public class Screen extends JPanel implements Runnable{

    Thread thread;

    public Screen(JFrame frame){
        thread = new Thread();
        thread.start();
    }

    @Override
    public void run() {
    }
}
