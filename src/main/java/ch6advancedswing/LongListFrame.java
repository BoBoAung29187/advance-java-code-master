package ch6advancedswing;

import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import java.awt.*;

public class LongListFrame extends JFrame
{
    public LongListFrame()
    {
        setTitle("LongListTest");
        setSize(DEFAULT_WIDTH, DEFAULT_HEIGHT);
        wordList = new JList(new WordListModel(3));

        wordList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        wordList.setPrototypeCellValue("www");
        JScrollPane scrollPane = new JScrollPane(wordList);
        JPanel p = new JPanel();
        p.add(scrollPane);
        wordList.addListSelectionListener(new ListSelectionListener()
        {
            public void valueChanged(ListSelectionEvent evt)
            {
                StringBuilder word = (StringBuilder)
                        wordList.getSelectedValue();
                setSubject(word.toString());
            }
        });
        Container contentPane = getContentPane();
        contentPane.add(p, BorderLayout.NORTH);
        label = new JLabel(prefix + suffix);
        contentPane.add(label, BorderLayout.CENTER);
        setSubject("fox");
    }
    /**
     * Sets the subject in the label.
     * @param word the new subject that jumps over the lazy dog
     */
    public void setSubject(String word)
    {
        StringBuilder text = new StringBuilder(prefix);
        text.append(word);
        text.append(suffix);
        label.setText(text.toString());
    }
    private static final int DEFAULT_WIDTH = 400;
    private static final int DEFAULT_HEIGHT = 300;
    private JList wordList;
    private JLabel label;
    private String prefix = "The quick brown ";
    private String suffix = " jumps over the lazy dog.";
}
