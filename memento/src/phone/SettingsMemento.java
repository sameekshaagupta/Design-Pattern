package phone;

public class SettingsMemento {
 private PhoneSettings savedSettings;

 public SettingsMemento(PhoneSettings settings) {
     savedSettings = new PhoneSettings(settings.getRingtone(), settings.getBrightness());
 }

 public PhoneSettings getSavedSettings() {
     return savedSettings;
 }
}
