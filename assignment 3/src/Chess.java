/**
 * @(#)Applet_App.java
 *
 * Applet_App Applet application
 *
 * @author
 * @version 1.00 2023/3/26
 */

import java.awt.*;
import java.applet.*;

/****************************************************************************************
 * This program draws a chess board
 ****************************************************************************************/

public class Chess extends Applet {
    // Initialization method that will be called after the applet is loaded into the browser and  can neglect the init method.
    public void init() {
        // TODO start asynchronous download of heavy resources
    }
    // This method is called by the browser or applet viewer to inform this Applet that it should start its execution.

    /**
     * @param g : Graphics object to draw on the screen (canvas) in the applet window (frame) .
     */
    public void paint(Graphics g) {
        int x = 0;
        int y = 0;
        int width = 20;
        int height = 20;
        for (int i = 0; i <= 10; i++)
        {
            for (int j = 0; j <= 10; j++)
            {
                if ((i + j) % 2 == 0)
                {
                    g.setColor(Color.BLACK);
                }
                else
                {
                    g.setColor(Color.WHITE);
                }
                g.fillRect(x, y, width, height);
                x += width;
            }

            x = 0;
            y += height;

        }
    }
}
