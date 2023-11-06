import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class EventDriven extends JFrame {
    private JTextField firstNameField, lastNameField, middleNameField, mobileNumberField, emailAddressField;
    private JButton submitButton, clearAllButton;

    public EventDriven() {
        setTitle("INPUT");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 300);
        setLocationRelativeTo(null);

        JPanel inputPanel = new JPanel(new GridLayout(6, 2));

        firstNameField = new JTextField();
        lastNameField = new JTextField();
        middleNameField = new JTextField();
        mobileNumberField = new JTextField();
        emailAddressField = new JTextField();

        inputPanel.add(new JLabel("First Name:"));
        inputPanel.add(firstNameField);
        inputPanel.add(new JLabel("Last Name:"));
        inputPanel.add(lastNameField);
        inputPanel.add(new JLabel("Middle Name:"));
        inputPanel.add(middleNameField);
        inputPanel.add(new JLabel("Mobile Number:"));
        inputPanel.add(mobileNumberField);
        inputPanel.add(new JLabel("E-mail Address:"));
        inputPanel.add(emailAddressField);

        submitButton = new JButton("Submit");
        clearAllButton = new JButton("Clear All");

        inputPanel.add(submitButton);
        inputPanel.add(clearAllButton);

        add(inputPanel);
        setVisible(true);

        submitButton.addActionListener(new btnSubmit());
        clearAllButton.addActionListener(new btnClearAll());
    }

    class btnSubmit implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String firstName = firstNameField.getText();
            String lastName = lastNameField.getText();
            String middleName = middleNameField.getText();
            String mobileNumber = mobileNumberField.getText();
            String emailAddress = emailAddressField.getText();

            OutputFrame outputFrame = new OutputFrame(firstName, lastName, middleName, mobileNumber, emailAddress);
            submitButton.setEnabled(false);
        }
    }

    class btnClearAll implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            firstNameField.setText("");
            lastNameField.setText("");
            middleNameField.setText("");
            mobileNumberField.setText("");
            emailAddressField.setText("");
            submitButton.setEnabled(true);
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new EventDriven();
            }
        });
    }
}

class OutputFrame extends JFrame {
    public OutputFrame(String firstName, String lastName, String middleName, String mobileNumber, String emailAddress) {
        setTitle("OUTPUT");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 300);
        setLocationRelativeTo(null);

        JPanel outputPanel = new JPanel(new GridLayout(6, 2));

        outputPanel.add(new JLabel("First Name:"));
        outputPanel.add(new JLabel(firstName));

        outputPanel.add(new JLabel("Last Name:"));
        outputPanel.add(new JLabel(lastName));

        outputPanel.add(new JLabel("Middle Name:"));
        outputPanel.add(new JLabel(middleName));

        outputPanel.add(new JLabel("Mobile Number:"));
        outputPanel.add(new JLabel(mobileNumber));

        outputPanel.add(new JLabel("E-mail Address:"));
        outputPanel.add(new JLabel(emailAddress));

        JButton okayButton = new JButton("Okay");
        outputPanel.add(okayButton);

        add(outputPanel);
        setVisible(true);

        okayButton.addActionListener(new btnOkay());
    }

    class btnOkay implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            dispose();
        }
    }
}
