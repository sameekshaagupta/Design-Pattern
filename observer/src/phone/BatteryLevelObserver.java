package phone;

class BatteryLevelObserver implements PhoneObserver {
    public void update(Phone phone) {
        System.out.println("Battery Level: " + phone.getBatteryLevel() + "%");
    }
}
