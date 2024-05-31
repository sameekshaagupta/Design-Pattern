package hos;

import java.awt.event.ActionListener;
import javax.swing.*;
import java.awt.*;

public class HospitalView extends JFrame {
    private JTextField nameField = new JTextField(20);
    private JTextField ageField = new JTextField(5);
    private JTextField conditionField = new JTextField(20);
    private JButton addButton = new JButton("Add Patient");
    private JTextArea displayArea = new JTextArea(10, 30);
    
    HospitalView() {
        JPanel inputPanel = new JPanel();
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(400, 300);
        inputPanel.add(new JLabel("Devam Joshi | 22BCP319"));
        inputPanel.add(new JLabel("Name:"));
        inputPanel.add(nameField);
        inputPanel.add(new JLabel("Age:"));
        inputPanel.add(ageField);
        inputPanel.add(new JLabel("Condition:"));
        inputPanel.add(conditionField);
        inputPanel.add(addButton);
        
        JScrollPane scrollPane = new JScrollPane(displayArea);
        JPanel displayPanel = new JPanel();
        displayPanel.add(scrollPane);
        
        this.add(inputPanel, BorderLayout.NORTH);
        this.add(displayPanel, BorderLayout.CENTER);
        this.setTitle("Hospital Management System");
    }
    
    public String getPatientName() {
        return nameField.getText();
    }
    
    public int getPatientAge() {
        return Integer.parseInt(ageField.getText());
    }
    
    public String getPatientCondition() {
        return conditionField.getText();
    }
    
    public void addPatientData(String data) {
        displayArea.append(data + "\n");
    }
    
    void addPatientButtonListener(ActionListener listenerForAddButton) {
        addButton.addActionListener(listenerForAddButton);
    }
    
    void displayErrorMessage(String errorMessage) {
        JOptionPane.showMessageDialog(this, errorMessage);
    }
}
