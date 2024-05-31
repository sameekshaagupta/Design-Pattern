package phone;

public class SoundState implements PhoneState {
    public void handleButtonPress(Phone phone) {
        System.out.println("Switching to Silent mode.");
        phone.setState(new SilentState());
    }

    public String toString() {
        return "Sound State";
    }
}
