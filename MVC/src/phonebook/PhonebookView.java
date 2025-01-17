package phonebook;

import java.awt.event.ActionListener;
import javax.swing.*;

public class PhonebookView extends JFrame {

    private JTextField searchField = new JTextField(20);
    private JTextField nameField = new JTextField(20);
    private JTextField numberField = new JTextField(20);
    private JButton searchButton = new JButton("Search");
    private JButton addButton = new JButton("Add");
    private JLabel resultLabel = new JLabel();

    PhonebookView() {
    	
        JPanel panel = new JPanel();
        panel.add(new JLabel("Devam Joshi|22BCP319"));
        panel.add(new JLabel("Search Name in the contact:"));
        panel.add(searchField);
        panel.add(searchButton);
        panel.add(new JLabel("Add name in the contact:"));
        panel.add(nameField);
        panel.add(new JLabel("Add Number in the contact:"));
        panel.add(numberField);
        panel.add(addButton);
        panel.add(resultLabel);

        this.add(panel);
        this.setTitle("Phonebook MVC Example");
        this.setSize(400, 200);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public String getSearchName() {
        return searchField.getText();
    }

    public String getNewName() {
        return nameField.getText();
    }

    public String getNewNumber() {
        return numberField.getText();
    }

    public void displayContact(String name, String number) {
        resultLabel.setText("Contact Found: " + name + " - " + number);
    }

    public void displayErrorMessage(String errorMessage) {
        JOptionPane.showMessageDialog(this, errorMessage);
    }

    public void displayMessage(String message) {
        JOptionPane.showMessageDialog(this, message);
    }

    public void addSearchListener(ActionListener listener) {
        searchButton.addActionListener(listener);
    }

    public void addAddContactListener(ActionListener listener) {
        addButton.addActionListener(listener);
    }
}
