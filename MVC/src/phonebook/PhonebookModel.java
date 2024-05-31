package phonebook;

import java.util.HashMap;

public class PhonebookModel {

    private HashMap<String, String> contacts;

    public PhonebookModel() {
        contacts = new HashMap<>();
    }

    public String searchContact(String name) {
        return contacts.get(name);
    }

    public void addContact(String name, String number) {
        contacts.put(name, number);
    }
}
