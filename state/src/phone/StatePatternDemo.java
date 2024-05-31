package phone;

public class StatePatternDemo {
    public static void main(String[] args) {
        Phone phone = new Phone();
        System.out.println("Sameeksha Gupta\n22BCP343");
        phone.displayState();
        phone.pressButton(); // Switch from Silent to Vibrate
        phone.displayState();
        phone.pressButton(); // Switch from Vibrate to Sound
        phone.displayState();
        phone.pressButton(); // Switch from Sound to Silent
        phone.displayState();
    }
}
