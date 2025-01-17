package phone;

public class PhoneSettingsDemo {
	public static void main(String[] args) {
		SettingsManager settingsManager = new SettingsManager();
		System.out.println("Sameeksha Gupta 22BCP343");
		PhoneSettings initialSettings = new PhoneSettings("Default Ringtone", 50);
		settingsManager.setSettings(initialSettings);
		System.out.println("Initial Settings: " + initialSettings);
		SettingsMemento memento = settingsManager.saveSettingsToMemento();
		settingsManager.getSettings().setRingtone("New Ringtone");
		settingsManager.getSettings().setBrightness(75);
		System.out.println("Updated Settings: " + settingsManager.getSettings());

		settingsManager.restoreSettingsFromMemento(memento);
		System.out.println("Restored Settings: " + settingsManager.getSettings());
 	}
}
