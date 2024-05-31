package hospital;

public class AppointmentSystem {

    public static void main(String[] args) {
        AppointmentView theView = new AppointmentView();
        AppointmentModel theModel = new AppointmentModel();
        
        AppointmentController theController = new AppointmentController(theView, theModel);
        
        theView.setVisible(true);
    }
}
