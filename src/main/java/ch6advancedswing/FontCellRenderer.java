package ch6advancedswing;

import javax.swing.*;
import java.awt.*;

class FontCellRenderer extends JLabel implements ListCellRenderer {
    public Component getListCellRendererComponent(JList list, Object
            value, int index, boolean isSelected, boolean cellHasFocus) {
        JLabel label = new JLabel();
        Font font = (Font) value;
        setText(font.getFamily());
        setFont(font);
        setOpaque(true);
        setBackground(isSelected ? list.getSelectionBackground() :
                list.getBackground());
        setForeground(isSelected ? list.getSelectionForeground() :
                list.getForeground());
        return this;
    }
}

