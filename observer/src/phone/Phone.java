package phone;

import java.util.ArrayList;
import java.util.List;

// Subject
class Phone {
    private List<PhoneObserver> observers = new ArrayList<>();
    private int batteryLevel;
    private int signalStrength;
    private String screenDisplay;

    public void setBatteryLevel(int batteryLevel) {
        this.batteryLevel = batteryLevel;
        notifyObservers();
    }

    public void setSignalStrength(int signalStrength) {
        this.signalStrength = signalStrength;
        notifyObservers();
    }

    public void setScreenDisplay(String screenDisplay) {
        this.screenDisplay = screenDisplay;
        notifyObservers();
    }

    public void attach(PhoneObserver observer) {
        observers.add(observer);
    }

    public void notifyObservers() {
        for (PhoneObserver observer : observers) {
            observer.update(this);
        }
    }

    public int getBatteryLevel() {
        return batteryLevel;
    }

    public int getSignalStrength() {
        return signalStrength;
    }

    public String getScreenDisplay() {
        return screenDisplay;
    }
}