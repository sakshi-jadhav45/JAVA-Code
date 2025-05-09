import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class BackgroundChanger extends JFrame {
    JComboBox<String> colorBox;
    String[] colors = {"Red", "Green", "Blue", "Yellow", "White"};

    public BackgroundChanger() {
        setTitle("Background Color Changer");
        setSize(300, 200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        colorBox = new JComboBox<>(colors);
        add(colorBox);

        colorBox.addActionListener(e -> {
            String selected = (String) colorBox.getSelectedItem();
            switch (selected) {
                case "Red": getContentPane().setBackground(Color.RED); break;
                case "Green": getContentPane().setBackground(Color.GREEN); break;
                case "Blue": getContentPane().setBackground(Color.BLUE); break;
                case "Yellow": getContentPane().setBackground(Color.YELLOW); break;
                case "White": getContentPane().setBackground(Color.WHITE); break;
            }
        });

        setVisible(true);
    }

    public static void main(String[] args) {
        new BackgroundChanger();
    }
}
