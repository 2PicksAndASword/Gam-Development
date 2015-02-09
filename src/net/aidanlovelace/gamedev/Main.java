package net.aidanlovelace.gamedev;

import javax.swing.*;
import java.awt.*;
import static net.aidanlovelace.gamedev.reference.References.*;
/**
 * Created by aidanlovelace on 2/8/15.
 */
public class Main {

    public static void main(String[]args){
        // Makes sure the GUI updates correctly
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Main();
            }
        });

    }

    public Main(){
        //Game Object
        GAME = new Game();
        //GAME.screen = new Screen();
        //GAME.screen.start();

        //You can customize the screen size under References

        Toolkit toolkit = Toolkit.getDefaultToolkit();
        if(SCREEN_WIDTH == 0)
            SCREEN_WIDTH = toolkit.getScreenSize().width;
        if(SCREEN_HEIGHT == 0)
            SCREEN_HEIGHT = toolkit.getScreenSize().height;


        // Creates a Window
        JFrame frame = new JFrame(TITLE);
        frame.setSize(SCREEN_WIDTH, SCREEN_HEIGHT);
        frame.setUndecorated(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);

        //TODO: Custom Icon
        //TODO: Custom Cursor
        frame.add(new Screen(frame));
        //Makes the window visible
        frame.setVisible(true);
    }

}
