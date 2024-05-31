package charger;

public class ChargerDemo {
    public static void main(String[] args) {
    	System.out.println("Sameeksha Gupta\n22BCP343");
    	
        IPhoneCharger iPhoneCharger = new ChargerAdapter("CType");
        iPhoneCharger.chargeIPhone();

        iPhoneCharger = new ChargerAdapter("BType");
        iPhoneCharger.chargeIPhone();
    }
}