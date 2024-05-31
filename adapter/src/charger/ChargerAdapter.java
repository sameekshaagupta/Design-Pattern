package charger;

public class ChargerAdapter extends IPhoneCharger {
    private final AndroidCharger androidCharger;

    public ChargerAdapter(String chargerType) {
        if (chargerType.equalsIgnoreCase("CType")) {
            androidCharger = new CTypeCharger();
        } else if (chargerType.equalsIgnoreCase("BType")) {
            androidCharger = new BTypeCharger();
        } else {
            throw new IllegalArgumentException("Invalid charger type");
        }
    }

    public void chargeIPhone() {
        androidCharger.chargeAndroid();
    }
}