package phone;

public class PhoneSettings {
    private String ringtone;
    private int brightness;

    public PhoneSettings(String ringtone, int brightness) {
        this.ringtone = ringtone;
        this.brightness = brightness;
    }

    public String getRingtone() {
        return ringtone;
    }

    public int getBrightness() {
        return brightness;
    }

    public void setRingtone(String ringtone) {
        this.ringtone = ringtone;
    }

    public void setBrightness(int brightness) {
        this.brightness = brightness;
    }

    @Override
    public String toString() {
        return "Ringtone: " + ringtone + ", Brightness: " + brightness;
    }
}
