import javax.swing.*;
import java.awt.event.*;

public class SimpleTimer extends JFrame {
    JLabel timeLabel;
    JButton startButton, stopButton;
    Timer timer;
    int seconds = 0;

    public SimpleTimer() {
        setTitle("Simple Timer");
        setSize(300, 150);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(null);

        timeLabel = new JLabel("Time: 0 sec");
        timeLabel.setBounds(100, 20, 150, 30);
        add(timeLabel);

        startButton = new JButton("Start");
        startButton.setBounds(50, 70, 80, 30);
        add(startButton);

        stopButton = new JButton("Stop");
        stopButton.setBounds(150, 70, 80, 30);
        add(stopButton);

        timer = new Timer(1000, e -> {
            seconds++;
            timeLabel.setText("Time: " + seconds + " sec");
        });

        startButton.addActionListener(e -> timer.start());
        stopButton.addActionListener(e -> timer.stop());

        setVisible(true);
    }

    public static void main(String[] args) {
        new SimpleTimer();
    }
}
