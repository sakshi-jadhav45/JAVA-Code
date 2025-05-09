import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Exp8_2 extends JFrame {
    JRadioButton maleButton, femaleButton;
    ButtonGroup genderGroup;
    JButton showButton;
    JLabel resultLabel;

    public Exp8_2() {
        setTitle("Radio Button Example");
        setLayout(new FlowLayout());

        maleButton = new JRadioButton("Male");
        femaleButton = new JRadioButton("Female");

        genderGroup = new ButtonGroup();
        genderGroup.add(maleButton);
        genderGroup.add(femaleButton);

        add(maleButton);
        add(femaleButton);

        showButton = new JButton("Show Selected");
        add(showButton);

        resultLabel = new JLabel("Selected: ");
        add(resultLabel);

        showButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (maleButton.isSelected()) {
                    resultLabel.setText("Selected: Male");
                } else if (femaleButton.isSelected()) {
                    resultLabel.setText("Selected: Female");
                } else {
                    resultLabel.setText("Selected: None");
                }
            }
        });

        setSize(250, 150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        new Exp8_2();
    }
}
