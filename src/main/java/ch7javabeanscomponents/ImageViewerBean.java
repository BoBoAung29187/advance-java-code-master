package ch7javabeanscomponents;

import java.awt.*;
import java.io.*;
import javax.imageio.*;
import javax.swing.*;

/**
 * A bean for viewing an image.
 *
 * @author Cay Horstmann
 * @version 1.21 2001-08-15
 */

public class ImageViewerBean extends JLabel {
    public ImageViewerBean() {
        setBorder(BorderFactory.createEtchedBorder());
    }

    /**
     * Sets the fileName property.
     *
     * @param fileName the image file name
     */
    public void setFileName(String fileName) {
        try {
            file = new File(fileName);
            setIcon(new ImageIcon(ImageIO.read(file)));
        } catch (IOException e) {
            file = null;
            setIcon(null);
        }
    }

    /**
     * Gets the fileName property.
     *
     * @return the image file name
     */
    public String getFileName() {
        if (file == null) return "";
        else return file.getPath();
    }

    public Dimension getPreferredSize() {
        return new Dimension(XPREFSIZE, YPREFSIZE);
    }

    private File file = null;
    private static final int XPREFSIZE = 200;
    private static final int YPREFSIZE = 200;
}




