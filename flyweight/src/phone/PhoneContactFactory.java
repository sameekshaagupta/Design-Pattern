package phone;
import java.util.*;
class PhoneContactFactory {
    private static final HashMap<String, PhoneContact> contactsMap = new HashMap<>();

    public static PhoneContact getPhoneContact(String name, String phoneNumber) {
        String key = name + "_" + phoneNumber;
        PhoneContact contact = contactsMap.get(key);

        if (contact == null) {
            contact = new ConcretePhoneContact(name, phoneNumber);
            contactsMap.put(key, contact);
            System.out.println("Creating contact for " + name);
        }
        return contact;
    }
}
