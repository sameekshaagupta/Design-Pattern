package phone;

public class PhoneContactList implements ContactList {
    private Contact[] contacts;
    private int size;

    public PhoneContactList(int capacity) {
        contacts = new Contact[capacity];
        size = 0;
    }

    public void addContact(Contact contact) {
        if (size < contacts.length) {
            contacts[size++] = contact;
        } else {
            System.out.println("Contact list is full.");
        }
    }

    @Override
    public Iterator getIterator() {
        return new ContactIterator();
    }

    private class ContactIterator implements Iterator {
        private int index;

        @Override
        public boolean hasNext() {
            return index < size;
        }

        @Override
        public Contact next() {
            if (this.hasNext()) {
                return contacts[index++];
            }
            return null;
        }
    }
}
