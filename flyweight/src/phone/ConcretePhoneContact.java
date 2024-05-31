package phone;

class ConcretePhoneContact implements PhoneContact {
    private String name;
    private String phoneNumber;

    public ConcretePhoneContact(String name, String phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    @Override
    public void displayContactInfo() {
        System.out.println("Name: " + name + ", Phone Number: " + phoneNumber);
    }
}