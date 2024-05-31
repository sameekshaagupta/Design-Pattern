package phone;

public class SilentState implements PhoneState {
    public void handleButtonPress(Phone phone) {
        System.out.println("Switching to Vibrate mode.");
        phone.setState(new VibrateState());
    }

    public String toString() {
        return "Silent State";
    }
}

