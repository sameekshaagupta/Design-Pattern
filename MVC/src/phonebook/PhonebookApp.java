package phonebook;

public class PhonebookApp {

    public static void main(String[] args) {
        PhonebookView theView = new PhonebookView();
        PhonebookModel theModel = new PhonebookModel();

        PhonebookController theController = new PhonebookController(theView, theModel);

        theView.setVisible(true);
    }
}
