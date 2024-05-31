package phone;

class SignalStrengthObserver implements PhoneObserver {
    public void update(Phone phone) {
        System.out.println("Signal Strength: " + phone.getSignalStrength() + " dBm");
    }
}