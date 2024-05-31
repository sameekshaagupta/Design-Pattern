package phone;

class ScreenDisplayObserver implements PhoneObserver {
    public void update(Phone phone) {
        System.out.println("Screen Display: " + phone.getScreenDisplay());
    }
}