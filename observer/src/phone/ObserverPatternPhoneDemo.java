package phone;

public class ObserverPatternPhoneDemo {
    public static void main(String[] args) {
        Phone phone = new Phone();

        BatteryLevelObserver batteryObserver = new BatteryLevelObserver();
        SignalStrengthObserver signalObserver = new SignalStrengthObserver();
        ScreenDisplayObserver displayObserver = new ScreenDisplayObserver();
        System.out.println("Sameeksha Gupta\n22BCP343");
        phone.attach(batteryObserver);
        phone.attach(signalObserver);
        phone.attach(displayObserver);

        // Simulate changes
        phone.setBatteryLevel(80);
        phone.setSignalStrength(-75);
        phone.setScreenDisplay("Home Screen");

        // Simulate more changes
        phone.setBatteryLevel(50);
        phone.setSignalStrength(-90);
        phone.setScreenDisplay("Notification Center");
    }
}