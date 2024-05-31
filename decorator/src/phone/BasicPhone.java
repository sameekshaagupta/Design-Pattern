package phone;

class BasicPhone implements Phone {
    @Override
    public String getDescription() {
        return "Basic Phone with audio call functionality";
    }

    @Override
    public double getPrice() {
        return 100.0;
    }
}