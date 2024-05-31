package phone;

abstract class PhoneDecorator implements Phone {
    protected Phone decoratedPhone;

    public PhoneDecorator(Phone decoratedPhone) {
        this.decoratedPhone = decoratedPhone;
    }

    public String getDescription() {
        return decoratedPhone.getDescription();
    }

    public double getPrice() {
        return decoratedPhone.getPrice();
    }
}