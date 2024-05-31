package hospital;

import java.awt.event.ActionListener;
import javax.swing.*;
import java.awt.*;

public class AppointmentView extends JFrame {
    private JTextField patientNameField = new JTextField(20);
    private JTextField doctorNameField = new JTextField(20);
    private JButton scheduleButton = new JButton("Schedule Appointment");
    private JTextArea displayArea = new JTextArea(10, 30);
    
    
    AppointmentView() {
        JPanel inputPanel = new JPanel();
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(400, 300);
        
        inputPanel.add(new JLabel("Patient Name:"));
        inputPanel.add(patientNameField);
        inputPanel.add(new JLabel("Doctor Name:"));
        inputPanel.add(doctorNameField);
        inputPanel.add(scheduleButton);
        
        JScrollPane scrollPane = new JScrollPane(displayArea);
        JPanel displayPanel = new JPanel();
        displayPanel.add(scrollPane);
        
        this.add(inputPanel, BorderLayout.NORTH);
        this.add(displayPanel, BorderLayout.CENTER);
        this.setTitle("Appointment Management System");
    }
    
    public String getPatientName() {
        return patientNameField.getText();
    }
    
    public String getDoctorName() {
        return doctorNameField.getText();
    }
    
    public void addAppointmentData(String data) {
        displayArea.append(data + "\n");
    }
    
    void addScheduleButtonListener(ActionListener listenerForScheduleButton) {
        scheduleButton.addActionListener(listenerForScheduleButton);
    }
    
    void displayErrorMessage(String errorMessage) {
        JOptionPane.showMessageDialog(this, errorMessage);
    }
}
