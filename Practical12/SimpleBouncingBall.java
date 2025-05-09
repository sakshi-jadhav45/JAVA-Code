import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SimpleBouncingBall {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Simple Bouncing Ball");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 400);

        BallPanel panel = new BallPanel();
        frame.add(panel);

        frame.setVisible(true);
    }
}

class BallPanel extends JPanel implements MouseListener {
    int x = 50, y = 50;         // Ball position
    int dx = 2, dy = 2;         // Ball speed
    int radius = 20;            // Ball radius
    boolean isMoving = false;   // Animation flag

    public BallPanel() {
        addMouseListener(this);
        setBackground(Color.WHITE);
    }

    public void startMoving() {
        if (isMoving) return;
        isMoving = true;

        Runnable run = () -> {
            while (true) {
                x += dx;
                y += dy;

                // Bounce logic
                if (x <= 0 || x + radius >= getWidth()) {
                    dx = -dx;
                }
                if (y <= 0 || y + radius >= getHeight()) {
                    dy = -dy;
                }

                repaint();

                try {
                    Thread.sleep(10);  // Smooth animation
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };

        new Thread(run).start();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.BLUE);
        g.fillOval(x, y, radius * 2, radius * 2);
    }

    @Override
    public void mousePressed(MouseEvent e) {
        startMoving();
    }

    // Other mouse events not used
    public void mouseReleased(MouseEvent e) {}
    public void mouseClicked(MouseEvent e) {}
    public void mouseEntered(MouseEvent e) {}
    public void mouseExited(MouseEvent e) {}
}
