package phone;

class PhoneWithCamera extends PhoneDecorator {
    public PhoneWithCamera(Phone decoratedPhone) {
        super(decoratedPhone);
    }

    public String getDescription() {
        return decoratedPhone.getDescription() + ", with Camera and video call funtionality";
    }

    public double getPrice() {
        return decoratedPhone.getPrice() + 50.0;
    }
}