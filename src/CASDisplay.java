/**
 * Created by Varuna on 27/01/2015.
 */

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class CASDisplay extends JFrame
{
    public CASDisplay()
    {
        setTitle("Collision Avoidance System");
        Container pane = getContentPane();
        pane.setLayout(new GridLayout(4, 2));

        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        pane.add(new ATCGrid(screenSize.width, screenSize.height));
        System.out.println(screenSize.width + "  " + screenSize.height);
        setBounds(0, 0, screenSize.width, screenSize.height);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    
    public static void main(String[] args)
    {
        CASDisplay diplay = new CASDisplay();
    }

}


