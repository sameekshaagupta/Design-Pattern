package phone;

public class DecoratorPatternExample {
    public static void main(String[] args) {
    	System.out.println("Sameeksha gupta\n22BCP343");
        // Creating a basic phone
        Phone basicPhone = new BasicPhone();
        System.out.println("Basic Phone:");
        System.out.println("Description: " + basicPhone.getDescription());
        System.out.println("Price: " + basicPhone.getPrice());

        // Decorating the basic phone with additional features
        Phone phoneWithCamera = new PhoneWithCamera(basicPhone);
        System.out.println("\nPhone with Camera:");
        System.out.println("Description: " + phoneWithCamera.getDescription());
        System.out.println("Price: " + phoneWithCamera.getPrice());

        Phone phoneWithGPS = new PhoneWithGPS(phoneWithCamera);
        System.out.println("\nPhone with Camera and GPS:");
        System.out.println("Description: " + phoneWithGPS.getDescription());
        System.out.println("Price: " + phoneWithGPS.getPrice());

        Phone phoneWithBluetooth = new PhoneWithBluetooth(phoneWithGPS);
        System.out.println("\nPhone with Camera, GPS, and Bluetooth:");
        System.out.println("Description: " + phoneWithBluetooth.getDescription());
        System.out.println("Price: " + phoneWithBluetooth.getPrice());
    }
}