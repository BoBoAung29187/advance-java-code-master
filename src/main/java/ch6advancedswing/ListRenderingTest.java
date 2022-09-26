package ch6advancedswing;

import java.util.*;
import java.awt.*;

import javax.swing.*;
import javax.swing.event.*;

/**
 * This program demonstrates the use of cell renderers in a list
 box.
 * @version 1.23 2007-08-01
 * @author Cay Horstmann
 */
public class ListRenderingTest
{
    public static void main(String[] args)
    {
        EventQueue.invokeLater(new Runnable()
        {
            public void run()
            {
                JFrame frame = new ListRenderingFrame();
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.setVisible(true);
            }
        });
    }
}
