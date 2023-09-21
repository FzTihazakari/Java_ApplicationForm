import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Forms extends JFrame {
    private JLabel firstNameLabel, lastNameLabel, genderLabel, religionLabel, addressLabel1, addressLabel2, postcodeLabel, cityLabel, statesLabel, dobLabel, icLabel, statusLabel;
    private JLabel experienceLabel, eduLevelLabel, positionLabel, salaryLabel, emailLabel, contNumLabel;
    private JLabel beautyConLabel, accountLabel, salesPersonLabel, clerkLabel, contentCreatorLabel;
    private JTextField firstNameField, lastNameField, addressField1, addressField2,postcodeField, cityField, icField;
    private JTextField experienceField, salaryField, emailField, contNumField;
    private JRadioButton maleRadioButton, femaleRadioButton;
    private JComboBox religionComboBox, statusComboBox, stateComboBox, dateComboBox, monthComboBox, yearComboBox, eduLevelComboBox;
    private JButton okButton, cancelButton, submitButton;
    private JCheckBox beautyConCheckBox, accountCheckBox, salesPersonCheckBox, clerkCheckBox, contentCreatorCheckBox;

    public Forms() {

        setTitle("Application Form");
        setSize(700, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JPanel panel = new JPanel(null);

        firstNameLabel = new JLabel("First Name :");
        lastNameLabel = new JLabel("Last Name :");
        genderLabel = new JLabel("Gender :");
        icLabel = new JLabel("IC No. :");
        statusLabel = new JLabel("Status :");
        religionLabel = new JLabel("Religion :");
        dobLabel = new JLabel("Date of Birth :");
        addressLabel1 = new JLabel("Address 1 :");
        addressLabel2 = new JLabel("Address 2 :");
        postcodeLabel = new JLabel("Postcode :");
        cityLabel = new JLabel("City :");
        statesLabel = new JLabel("States :");

        experienceLabel = new JLabel("Experience :");
        eduLevelLabel = new JLabel("Edu. Level :");
        positionLabel = new JLabel("Position :");
        salaryLabel = new JLabel("Exp. Salary :");
        emailLabel = new JLabel("Email Address :");
        contNumLabel = new JLabel("Tel No. :");

        beautyConLabel = new JLabel("Beauty Consultant");
        accountLabel = new JLabel("Accountant");
        salesPersonLabel = new JLabel("Sales Person");
        clerkLabel = new JLabel("Clerk");
        contentCreatorLabel = new JLabel("Content Creator");


        firstNameField = new JTextField();
        lastNameField = new JTextField();
        icField = new JTextField();
        addressField1 = new JTextField();
        addressField2 = new JTextField();
        postcodeField = new JTextField();
        cityField = new JTextField();

        experienceField = new JTextField();
        salaryField = new JTextField();
        emailField = new JTextField();
        contNumField = new JTextField();

        maleRadioButton = new JRadioButton("Male");
        femaleRadioButton = new JRadioButton("Female");

        religionComboBox = new JComboBox(new String[]{"Please Choose", "Islam", "Hindu", "Buddha", "Christian"});

        statusComboBox = new JComboBox(new String[]{"Please Choose", "Single", "Married", "Divorced"});

        stateComboBox = new JComboBox(new String[]{"Please Choose", "Johor", "Kedah", "Kelantan", "Melaka", "Negeri Sembilan","Pahang","Penang",
                                                   "Perlis", "Selangor", "Terenggau", "Sabah", "Sarawak",
                                                     "Kuala Lumpur","Labuan", "Putrajaya"});

        dateComboBox = new JComboBox(new String[]{ "Day", "1", "2", "3", "4", "5","6", "7", "8", "9", "10",
                                                   "11", "12", "13", "14", "15","16", "17", "18", "19", "20",
                                                   "21", "22", "23", "24", "25","26", "27", "28", "29", "30",
                                                   "31"});

        monthComboBox = new JComboBox(new String[] { "Month", "January", "February", "March", "April",
                                                     "May", "June", "July", "August", "September",
                                                     "October", "November", "December"});

        yearComboBox = new JComboBox(new String[] { "Year", "1985", "1986", "1986", "1987", "1988", "1989",
        	                                        "1990", "1991", "1992", "1993","1994",
                                                    "1995", "1996", "1997", "1998",
                                                    "1999", "2000", "2001", "2002",
                                                    "2003", "2004", "2005", "2006",
                                                    "2007", "2008", "2009", "2010",
                                                    "2011", "2012", "2013", "2014",
                                                    "2015", "2016", "2017", "2018",
                                                    "2019","2020", "2021", "2022", "2023"});

        eduLevelComboBox = new JComboBox(new String[] { "Please Choose", "SPM", "STPM", "CERTIFICATE", "MATRICULATION",
        	                                            "BACHELOR'S DEGREE", "MASTER DEGREE", "PHD"});
        beautyConCheckBox = new JCheckBox();
        accountCheckBox = new JCheckBox();
        salesPersonCheckBox = new JCheckBox();
        clerkCheckBox = new JCheckBox();
        contentCreatorCheckBox = new JCheckBox();

        okButton = new JButton("OK");
        cancelButton = new JButton("CANCEL");
        submitButton = new JButton("SUBMIT");

        firstNameLabel.setBounds(10, 10, 200, 25);
        firstNameField.setBounds(100, 10, 200, 25);
        firstNameLabel.setHorizontalAlignment(SwingConstants.LEFT);

        lastNameLabel.setBounds(350, 10, 200, 25);
        lastNameField.setBounds(440, 10, 200, 25);
        lastNameLabel.setHorizontalAlignment(SwingConstants.LEFT);

        genderLabel.setBounds(10, 40, 80, 25);
        maleRadioButton.setBounds(100, 40, 80, 25);
        femaleRadioButton.setBounds(180, 40, 80, 25);
        genderLabel.setHorizontalAlignment(SwingConstants.LEFT);

        religionLabel.setBounds(350, 40, 200, 25);
        religionComboBox.setBounds(440, 40, 200, 25);
        religionLabel.setHorizontalAlignment(SwingConstants.LEFT);

        icLabel.setBounds(10, 70, 100, 25);
        icField.setBounds(100, 70, 200, 25);
        icLabel.setHorizontalAlignment(SwingConstants.LEFT);

        statusLabel.setBounds(350, 70, 200, 25);
        statusComboBox.setBounds(440, 70, 200, 25);
        statusLabel.setHorizontalAlignment(SwingConstants.LEFT);

        dobLabel.setBounds(10, 100, 80, 25);
        dateComboBox.setBounds(100, 100, 100, 25);
        monthComboBox.setBounds(220, 100, 100, 25);
        yearComboBox.setBounds(340, 100, 100, 25);
        dobLabel.setHorizontalAlignment(SwingConstants.LEFT);

        addressLabel1.setBounds(10, 130, 80, 25);
        addressField1.setBounds(100, 130, 300, 25);
        addressLabel1.setHorizontalAlignment(SwingConstants.LEFT);

        addressLabel2.setBounds(10, 160, 80, 25);
        addressField2.setBounds(100, 160, 300, 25);
        addressLabel2.setHorizontalAlignment(SwingConstants.LEFT);

        postcodeLabel.setBounds(10, 190, 80, 25);
        postcodeField.setBounds(100, 190, 200, 25);
        postcodeLabel.setHorizontalAlignment(SwingConstants.LEFT);

        cityLabel.setBounds(350, 190, 200, 25);
        cityField.setBounds(440, 190, 200, 25);
        cityLabel.setHorizontalAlignment(SwingConstants.LEFT);

        statesLabel.setBounds(10, 220, 80, 25);
        stateComboBox.setBounds(100, 220, 200, 25);
        statesLabel.setHorizontalAlignment(SwingConstants.LEFT);

        experienceLabel.setBounds(10, 250, 80, 25);
        experienceField.setBounds(100, 250, 300, 25);
        experienceLabel.setHorizontalAlignment(SwingConstants.LEFT);

        eduLevelLabel.setBounds(10, 280, 200, 25);
        eduLevelComboBox.setBounds(100, 280, 200, 25);
        eduLevelLabel.setHorizontalAlignment(SwingConstants.LEFT);

        positionLabel.setBounds(10, 310, 80, 25);
        beautyConLabel.setBounds(120, 310, 200, 25);
        beautyConCheckBox.setBounds(100, 310, 200, 25);

        accountLabel.setBounds(120, 330, 200, 25);
        accountCheckBox.setBounds(100, 330, 200, 25);

        salesPersonLabel.setBounds(120, 350, 200, 25);
        salesPersonCheckBox.setBounds(100, 350, 200, 25);

        clerkLabel.setBounds(120, 370, 200, 25);
        clerkCheckBox.setBounds(100, 370, 200, 20);

        contentCreatorLabel.setBounds(120, 390, 200, 25);
        contentCreatorCheckBox.setBounds(100, 390, 200, 25);

        salaryLabel.setBounds(10, 420, 200, 25);
        salaryField.setBounds(100, 420, 200, 25);
        salaryLabel.setHorizontalAlignment(SwingConstants.LEFT);

        emailLabel.setBounds(10, 450, 200, 25);
        emailField.setBounds(100, 450, 200, 25);
        emailLabel.setHorizontalAlignment(SwingConstants.LEFT);

        contNumLabel.setBounds(350, 450, 80, 25);
        contNumField.setBounds(440, 450, 200, 25);
        contNumLabel.setHorizontalAlignment(SwingConstants.LEFT);

        okButton.setBounds(150, 500, 100, 25);
        cancelButton.setBounds(270, 500, 100, 25);
        submitButton.setBounds(390, 500, 100, 25);

        panel.add(firstNameLabel);
        panel.add(firstNameField);
        panel.add(lastNameLabel);
        panel.add(lastNameField);
        panel.add(genderLabel);
        panel.add(icLabel);
        panel.add(icField);
        panel.add(statusLabel);
        panel.add(statusComboBox);
        panel.add(religionLabel);
        panel.add(religionComboBox);
        panel.add(maleRadioButton);
        panel.add(new JLabel());
        panel.add(femaleRadioButton);
        panel.add(dobLabel);
        panel.add(dateComboBox);
        panel.add(monthComboBox);
        panel.add(yearComboBox);
        panel.add(addressLabel1);
        panel.add(addressField1);
        panel.add(addressLabel2);
        panel.add(addressField2);
        panel.add(postcodeLabel);
        panel.add(postcodeField);
        panel.add(cityLabel);
        panel.add(cityField);
        panel.add(statesLabel);
        panel.add(stateComboBox);
        panel.add(experienceLabel);
        panel.add(experienceField);
        panel.add(eduLevelLabel);
        panel.add(positionLabel);
        panel.add(beautyConLabel);
        panel.add(beautyConCheckBox);
        panel.add(accountLabel);
        panel.add(accountCheckBox);
        panel.add(salesPersonLabel);
        panel.add(salesPersonCheckBox);
        panel.add(clerkLabel);
        panel.add(clerkCheckBox);
        panel.add(contentCreatorLabel);
        panel.add(contentCreatorCheckBox);
        panel.add(eduLevelComboBox);
        panel.add(salaryLabel);
        panel.add(salaryField);
        panel.add(emailLabel);
        panel.add(emailField);
        panel.add(contNumLabel);
        panel.add(contNumField);

        panel.add(okButton);
        panel.add(cancelButton);
        panel.add(submitButton);
        add(panel);

        cancelButton.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                dispose();
            }
        });

        okButton.addActionListener(new ActionListener() {

             public void actionPerformed(ActionEvent e) {
                dispose();
            }
        });

        submitButton.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                saveFormDetails();
            }
        });
    }

    private void saveFormDetails() {
        String firstName = firstNameField.getText();
        String lastName = lastNameField.getText();
        String gender = maleRadioButton.isSelected() ? "Male" : "Female";
        String religion =(String)religionComboBox.getSelectedItem();
        String ic = icField.getText();
        String status =(String)statusComboBox.getSelectedItem();
        String date = (String)dateComboBox.getSelectedItem();
        String month = (String)monthComboBox.getSelectedItem();
        String year = (String)yearComboBox.getSelectedItem();
        String address1 = addressField1.getText();
        String address2 = addressField2.getText();
        String postcode = postcodeField.getText();
        String city = cityField.getText();
        String state = (String)stateComboBox.getSelectedItem();
        String experience = experienceField.getText();
        String eduLevel = (String)eduLevelComboBox.getSelectedItem();
        String salary = salaryField.getText();
        String email = emailField.getText();
        String contNum = contNumField.getText();

        StringBuilder selectedPositions = new StringBuilder("Applied Positions: ");
        if (beautyConCheckBox.isSelected()) {
            selectedPositions.append("Beauty Consultant, ");
        }
        if (accountCheckBox.isSelected()) {
            selectedPositions.append("Accountant, ");
        }
        if (salesPersonCheckBox.isSelected()) {
            selectedPositions.append("Sales Person, ");
        }
        if (clerkCheckBox.isSelected()) {
            selectedPositions.append("Office Clerk, ");
        }
        if (contentCreatorCheckBox.isSelected()) {
            selectedPositions.append("Content Creator, ");
        }

        selectedPositions.delete(selectedPositions.length() - 2, selectedPositions.length());


        try {

            FileWriter fileWriter = new FileWriter("D://ApplicationFormRecord.txt", true);
            PrintWriter printWriter = new PrintWriter(fileWriter);

            printWriter.println("First Name: " + firstName);
            printWriter.println("Last Name: " + lastName);
            printWriter.println("Gender: " + gender);
            printWriter.println("Religion: " + religion);
            printWriter.println("IC No: " + ic);
            printWriter.println("Maritial Status: " + status);
            printWriter.println("Date of Birth: " + date + "/" + month + "/" + year );
            printWriter.println("Address 1: " + address1);
            printWriter.println("Address 2: " + address2);
            printWriter.println("Postcode: " + postcode);
            printWriter.println("City: " + city);
            printWriter.println("State: " + state);
            printWriter.println("Experience: " + experience);
            printWriter.println("Education Level: " + eduLevel);
            printWriter.println(selectedPositions.toString());
            printWriter.println("Expected Salary: " + salary);
            printWriter.println("Email Address: " + email);
            printWriter.println("No. Tel: " + contNum);
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
                new Forms().setVisible(true);
            }
        });
    }
}