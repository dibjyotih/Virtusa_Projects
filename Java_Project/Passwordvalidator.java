import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Passwordvalidator {

    public static void main(String[] args) {


        JFrame frame = new JFrame("SafeLog Password Validator");
        frame.setSize(400, 250);
        
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);

        JPanel panel = new JPanel();
        panel.setLayout(null);

        JLabel title = new JLabel("SafeLog Password Validator");
        title.setFont(new Font("Arial", Font.BOLD, 16));
        title.setBounds(80, 10, 250, 30);
        panel.add(title);

        JLabel label = new JLabel("Enter Password:");
        label.setBounds(30, 60, 120, 25);
        panel.add(label);

        JPasswordField passwordField = new JPasswordField();
        passwordField.setBounds(150, 60, 180, 25);
        panel.add(passwordField);

        JButton validateButton = new JButton("Validate");
        validateButton.setBounds(130, 100, 120, 30);
        panel.add(validateButton);

        JLabel resultLabel = new JLabel("");
        resultLabel.setBounds(30, 150, 320, 40);
        panel.add(resultLabel);

        validateButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                String password = new String(passwordField.getPassword());

                boolean hasUppercase = false;
                boolean hasDigit = false;

                StringBuilder feedback = new StringBuilder();

                if (password.length() < 8) {
                    feedback.append("Too short. ");
                }

                for (int i = 0; i < password.length(); i++) {
                    char ch = password.charAt(i);

                    if (Character.isUpperCase(ch)) {
                        hasUppercase = true;
                    }

                    if (Character.isDigit(ch)) {
                        hasDigit = true;
                    }
                }

                if (!hasUppercase) {
                    feedback.append("Missing uppercase. ");
                }

                if (!hasDigit) {
                    feedback.append("Missing digit. ");
                }

                if (password.length() >= 8 && hasUppercase && hasDigit) {
                    resultLabel.setForeground(Color.GREEN);
                    resultLabel.setText("Strong Password ");
                } else {
                    resultLabel.setForeground(Color.RED);
                    resultLabel.setText(feedback.toString());
                }
            }
        });

        frame.add(panel);
        frame.setVisible(true);
    }
}   
