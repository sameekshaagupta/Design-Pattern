package phone;

class PhoneWithGPS extends PhoneDecorator {
    public PhoneWithGPS(Phone decoratedPhone) {
        super(decoratedPhone);
    }

    public String getDescription() {
        return decoratedPhone.getDescription() + ", with GPS and location share functionality";
    }

    public double getPrice() {
        return decoratedPhone.getPrice() + 30.0;
    }
}