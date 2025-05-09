import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Exp10_1 extends JFrame {

    JLabel coordinatesLabel;

    public Exp10_1() {
        setTitle("Mouse Coordinates");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        coordinatesLabel = new JLabel("Move the mouse...");
        coordinatesLabel.setFont(new Font("Arial", Font.BOLD, 16));
        add(coordinatesLabel);

        // Add mouse motion listener to the frame
        addMouseMotionListener(new MouseMotionAdapter() {
            public void mouseMoved(MouseEvent e) {
                int x = e.getX();
                int y = e.getY();
                coordinatesLabel.setText("Mouse Coordinates: X = " + x + ", Y = " + y);
            }
        });

        setVisible(true);
    }

    public static void main(String[] args) {
        new Exp10_1();
    }
}
