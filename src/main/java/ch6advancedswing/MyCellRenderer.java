package ch6advancedswing;

import javax.swing.*;
import java.awt.*;

public class MyCellRenderer extends JComponent implements ListCellRenderer {
    public Component getListCellRendererComponent(JList list, Object
            value, int index, boolean isSelected, boolean cellHasFocus) {
        // stash away information that is needed for painting and size
        // measurement
        return this;
    }

    public void paintComponent(Graphics g) {
        // paint code goes here
    }

    public Dimension getPreferredSize() {
        // size measurement code goes here
        return null;
    }
    // instance fields
}

