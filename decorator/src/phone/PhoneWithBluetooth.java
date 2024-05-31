package phone;

class PhoneWithBluetooth extends PhoneDecorator {
    public PhoneWithBluetooth(Phone decoratedPhone) {
        super(decoratedPhone);
    }

    public String getDescription() {
        return decoratedPhone.getDescription() + ", with Bluetooth and connectivity";
    }

    public double getPrice() {
        return decoratedPhone.getPrice() + 20.0;
    }
}