import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Exp8_1 extends JFrame {
    JTextField inputField, resultField;
    JButton reverseButton;

    public Exp8_1() {
        setTitle("Reverse Number");
        setLayout(new FlowLayout());

        add(new JLabel("Enter Number:"));
        inputField = new JTextField(10);
        add(inputField);

        reverseButton = new JButton("Find Reverse");
        add(reverseButton);

        add(new JLabel("Reversed:"));
        resultField = new JTextField(10);
        resultField.setEditable(false);
        add(resultField);

        reverseButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    int num = Integer.parseInt(inputField.getText());
                    int reversed = 0;
                    while (num != 0) {
                        reversed = reversed * 10 + num % 10;
                        num /= 10;
                    }
                    resultField.setText(Integer.toString(reversed));
                } catch (NumberFormatException ex) {
                    resultField.setText("Invalid");
                }
            }
        });

        setSize(250, 150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        new Exp8_1();
    }
}
