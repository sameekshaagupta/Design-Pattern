package phone;

public class VibrateState implements PhoneState {
    public void handleButtonPress(Phone phone) {
        System.out.println("Switching to Sound mode.");
        phone.setState(new SoundState());
    }

    public String toString() {
        return "Vibrate State";
    }
}
