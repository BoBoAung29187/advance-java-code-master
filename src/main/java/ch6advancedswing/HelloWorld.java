package ch6advancedswing;

import javax.swing.JFrame;
import javax.swing.JLabel;
public final class HelloWorld extends JFrame {
    private HelloWorld() {
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        getContentPane().add(new JLabel("Hello, World!"));
        pack();
        setLocationRelativeTo(null);
    }
    public static void main(String[] args) {
        new HelloWorld().setVisible(true);
    }
}

