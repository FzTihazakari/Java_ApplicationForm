import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class ApplicationForms extends JFrame {
    private JLabel firstNameLabel, lastNameLabel, genderLabel, addressLabel1, addressLabel2, cityLabel, countryLabel;
    private JTextField firstNameField, lastNameField, addressField1, addressField2, cityField;
    private JRadioButton maleRadioButton, femaleRadioButton;
    private JComboBox countryComboBox;
    private JButton okButton, cancelButton, registerButton;

    public ApplicationForms() {

        setTitle("Application Form");
        setSize(500, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JPanel panel = new JPanel(null);

        firstNameLabel = new JLabel("First Name:");
        lastNameLabel = new JLabel("Last Name:");
        genderLabel = new JLabel("Gender:");
        addressLabel1 = new JLabel("Address 1:");
        addressLabel2 = new JLabel("Address 2:");
        cityLabel = new JLabel("City:");
        countryLabel = new JLabel("Country:");

        firstNameField = new JTextField();
        lastNameField = new JTextField();
        addressField1 = new JTextField();
        addressField2 = new JTextField();
        cityField = new JTextField();

        maleRadioButton = new JRadioButton("Male");
        femaleRadioButton = new JRadioButton("Female");

        countryComboBox = new JComboBox(new String[]{"Option", "Malaysia", "Indonesia", "Singapore", "Korea", "China"});

        okButton = new JButton("OK");
        cancelButton = new JButton("Cancel");
        registerButton = new JButton("Register");

        firstNameLabel.setBounds(10, 10, 80, 25);
        firstNameField.setBounds(100, 10, 300, 25);
        firstNameLabel.setHorizontalAlignment(SwingConstants.LEFT);

        lastNameLabel.setBounds(10, 40, 80, 25);
        lastNameField.setBounds(100, 40, 300, 25);
        lastNameLabel.setHorizontalAlignment(SwingConstants.LEFT);

        genderLabel.setBounds(10, 70, 80, 25);
        maleRadioButton.setBounds(100, 70, 80, 25);
        femaleRadioButton.setBounds(180, 70, 80, 25);
        genderLabel.setHorizontalAlignment(SwingConstants.LEFT);

        addressLabel1.setBounds(10, 100, 80, 25);
        addressField1.setBounds(100, 100, 300, 25);
        addressLabel1.setHorizontalAlignment(SwingConstants.LEFT);

        addressLabel2.setBounds(10, 130, 80, 25);
        addressField2.setBounds(100, 130, 300, 25);
        addressLabel2.setHorizontalAlignment(SwingConstants.LEFT);

        cityLabel.setBounds(10, 160, 80, 25);
        cityField.setBounds(100, 160, 300, 25);
        cityLabel.setHorizontalAlignment(SwingConstants.LEFT);

        countryLabel.setBounds(10, 190, 80, 25);
        countryComboBox.setBounds(100, 190, 300, 25);
        countryLabel.setHorizontalAlignment(SwingConstants.LEFT);

        okButton.setBounds(100, 220, 100, 25);
        cancelButton.setBounds(210, 220, 100, 25);
        registerButton.setBounds(320, 220, 100, 25);

        panel.add(firstNameLabel);
        panel.add(firstNameField);
        panel.add(lastNameLabel);
        panel.add(lastNameField);
        panel.add(genderLabel);
        panel.add(maleRadioButton);
        panel.add(new JLabel());
        panel.add(femaleRadioButton);
        panel.add(addressLabel1);
        panel.add(addressField1);
        panel.add(addressLabel2);
        panel.add(addressField2);
        panel.add(cityLabel);
        panel.add(cityField);
        panel.add(countryLabel);
        panel.add(countryComboBox);
        panel.add(okButton);
        panel.add(cancelButton);
        panel.add(registerButton);

        add(panel);

        cancelButton.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                dispose();
            }
        });

        okButton.addActionListener(new ActionListener() {

             public void actionPerformed(ActionEvent e) {
                saveFormDetails();
            }
        });

        registerButton.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                saveFormDetails();
            }
        });
    }

    private void saveFormDetails() {
        String firstName = firstNameField.getText();
        String lastName = lastNameField.getText();
        String gender = maleRadioButton.isSelected() ? "Male" : "Female";
        String address1 = addressField1.getText();
        String address2 = addressField2.getText();
        String city = cityField.getText();
        String country = (String)countryComboBox.getSelectedItem();

        try {

            FileWriter fileWriter = new FileWriter("D://ApplicationFormRecord.txt", true);
            PrintWriter printWriter = new PrintWriter(fileWriter);

            printWriter.println("First Name: " + firstName);
            printWriter.println("Last Name: " + lastName);
            printWriter.println("Gender: " + gender);
            printWriter.println("Address 1: " + address1);
            printWriter.println("Address 2: " + address2);
            printWriter.println("City: " + city);
            printWriter.println("Country: " + country);
            printWriter.println();

            printWriter.close();
            JOptionPane.showMessageDialog(this, "Saved successfully!");
        } catch (IOException e) {
            JOptionPane.showMessageDialog(this, "Error saving form details!", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new ApplicationForms().setVisible(true);
            }
        });
    }
}