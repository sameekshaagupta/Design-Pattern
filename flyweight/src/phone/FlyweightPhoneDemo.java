package phone;

public class FlyweightPhoneDemo {
    public static void main(String[] args) {
    	System.out.print("Sameeksha Gupta\n22BCP343\n");
        addContact("John", "1234567890");
        addContact("Jane", "9876543210");
        addContact("John", "1234567890"); // Existing contact, should not create new instance

        // Display contacts
        displayContactInfo("John", "1234567890");
        displayContactInfo("Jane", "9876543210");
    }

    public static void addContact(String name, String phoneNumber) {
        PhoneContact contact = PhoneContactFactory.getPhoneContact(name, phoneNumber);
    }

    public static void displayContactInfo(String name, String phoneNumber) {
        PhoneContact contact = PhoneContactFactory.getPhoneContact(name, phoneNumber);
        contact.displayContactInfo();
    }
}