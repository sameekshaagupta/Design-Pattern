package phone;

public class PhoneContactListDemo {
    public static void main(String[] args) {
        PhoneContactList contactList = new PhoneContactList(5);
        System.out.println("Sameeksha Gupta 22BCP343");
        contactList.addContact(new Contact("Alice", "1234567890"));
        contactList.addContact(new Contact("Bob", "9876543210"));
        contactList.addContact(new Contact("Charlie", "5555555555"));

        Iterator iterator = contactList.getIterator();
        while (iterator.hasNext()) {
            Contact contact = (Contact) iterator.next();
            System.out.println("Name: " + contact.getName() + ", Phone Number: " + contact.getPhoneNumber());
        }
    }
}
