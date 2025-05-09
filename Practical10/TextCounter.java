import javax.swing.*;
import java.awt.event.*;

public class TextCounter extends JFrame {
    JTextArea textArea;
    JLabel countLabel;

    public TextCounter() {
        setTitle("Live Word & Char Count");
        setSize(400, 300);
        setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        textArea = new JTextArea();
        textArea.setBounds(20, 20, 350, 180);
        add(textArea);

        countLabel = new JLabel("Chars: 0 | Words: 0");
        countLabel.setBounds(20, 210, 300, 30);
        add(countLabel);

        textArea.addKeyListener(new KeyAdapter() {
            public void keyReleased(KeyEvent e) {
                String text = textArea.getText();
                int charCount = text.length();
                int wordCount = text.trim().isEmpty() ? 0 : text.trim().split("\\s+").length;
                countLabel.setText("Chars: " + charCount + " | Words: " + wordCount);
            }
        });

        setVisible(true);
    }

    public static void main(String[] args) {
        new TextCounter();
    }
}
 