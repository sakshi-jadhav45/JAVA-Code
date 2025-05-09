import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ImageComboBox extends JFrame {
    JLabel imageLabel;
    JComboBox<String> imageBox;
    String[] images = {"img1.jpg", "img2.png", "img3.png"}; // Place these in your project folder

    public ImageComboBox() {
        setTitle("Image Viewer");
        setSize(400, 400);
        setLayout(new BorderLayout());
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        imageBox = new JComboBox<>(images);
        add(imageBox, BorderLayout.NORTH);

        imageLabel = new JLabel();
        imageLabel.setHorizontalAlignment(JLabel.CENTER);
        add(imageLabel, BorderLayout.CENTER);

        imageBox.addItemListener(e -> {
            if (e.getStateChange() == ItemEvent.SELECTED) {
                String selected = (String) e.getItem();
                ImageIcon icon = new ImageIcon(selected);
                imageLabel.setIcon(icon);
            }
        });

        setVisible(true);
    }

    public static void main(String[] args) {
        new ImageComboBox();
    }
}
