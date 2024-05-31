package phone;

public class SettingsManager {
 private PhoneSettings settings;

 public void setSettings(PhoneSettings settings) {
     this.settings = settings;
 }

 public PhoneSettings getSettings() {
     return settings;
 }

 public SettingsMemento saveSettingsToMemento() {
     return new SettingsMemento(settings);
 }

 public void restoreSettingsFromMemento(SettingsMemento memento) {
     settings = memento.getSavedSettings();
 }
}
