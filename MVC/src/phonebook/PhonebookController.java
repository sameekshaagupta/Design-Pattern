package phonebook;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PhonebookController {

    private PhonebookView theView;
    private PhonebookModel theModel;

    public PhonebookController(PhonebookView theView, PhonebookModel theModel) {
        this.theView = theView;
        this.theModel = theModel;

        this.theView.addSearchListener(new SearchListener());
        this.theView.addAddContactListener(new AddContactListener());
    }

    class SearchListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            String name = theView.getSearchName();
            String number = theModel.searchContact(name);
            if (number != null) {
                theView.displayContact(name, number);
            } else {
                theView.displayErrorMessage("Contact not found");
            }
        }
    }

    class AddContactListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            String name = theView.getNewName();
            String number = theView.getNewNumber();
            theModel.addContact(name, number);
            theView.displayMessage("Contact added successfully");
        }
    }
}
