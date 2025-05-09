import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Calculator extends JFrame implements ActionListener {

    JTextField display;
    double num1 = 0, num2 = 0, result = 0;
    String operator = "";

    public Calculator() {
        setTitle("Calculator");
        setSize(400, 500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        // Display field
        display = new JTextField();
        display.setEditable(false);
        display.setFont(new Font("Arial", Font.BOLD, 24));
        add(display, BorderLayout.NORTH);

        // Panel for buttons
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(5, 4, 10, 10));

        // Button labels
        String[] buttons = {
            "7", "8", "9", "/",
            "4", "5", "6", "*",
            "1", "2", "3", "-",
            "0", "C", "=", "+",
            "%", "√", "x²", "x³"
        };

        for (String text : buttons) {
            JButton button = new JButton(text);
            button.setFont(new Font("Arial", Font.BOLD, 20));
            button.addActionListener(this);
            panel.add(button);
        }

        add(panel, BorderLayout.CENTER);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        String input = e.getActionCommand();

        if (input.matches("[0-9]")) {
            display.setText(display.getText() + input);
        } else if (input.equals("C")) {
            display.setText("");
            num1 = num2 = result = 0;
            operator = "";
        } else if (input.equals("+") || input.equals("-") || input.equals("*") || input.equals("/") || input.equals("%")) {
            num1 = Double.parseDouble(display.getText());
            operator = input;
            display.setText("");
        } else if (input.equals("=")) {
            num2 = Double.parseDouble(display.getText());
            switch (operator) {
                case "+": result = num1 + num2; break;
                case "-": result = num1 - num2; break;
                case "*": result = num1 * num2; break;
                case "/": 
                    if (num2 != 0) result = num1 / num2;
                    else {
                        display.setText("Error");
                        return;
                    }
                    break;
                case "%": result = num1 % num2; break;
            }
            display.setText(String.valueOf(result));
            operator = "";
        } else if (input.equals("√")) {
            try {
                double value = Double.parseDouble(display.getText());
                result = Math.sqrt(value);
                display.setText(String.valueOf(result));
            } catch (NumberFormatException ex) {
                display.setText("Error");
            }
        } else if (input.equals("x²")) {
            try {
                double value = Double.parseDouble(display.getText());
                result = value * value;
                display.setText(String.valueOf(result));
            } catch (NumberFormatException ex) {
                display.setText("Error");
            }
        } else if (input.equals("x³")) {
            try {
                double value = Double.parseDouble(display.getText());
                result = value * value * value;
                display.setText(String.valueOf(result));
            } catch (NumberFormatException ex) {
                display.setText("Error");
            }
        }
    }

    public static void main(String[] args) {
        new Calculator();
    }
}
