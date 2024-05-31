package phone;

public class Phone {
    private PhoneState state;

    public Phone() {
        state = new SilentState(); // Initial state
    }

    public void setState(PhoneState state) {
        this.state = state;
    }

    public void pressButton() {
        state.handleButtonPress(this);
    }

    public void displayState() {
        System.out.println("Phone is currently " + state.toString());
    }
}