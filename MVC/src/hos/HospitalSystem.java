package hos;
public class HospitalSystem {

    public static void main(String[] args) {
        HospitalView theView = new HospitalView();
        PatientModel theModel = new PatientModel();
        
        HospitalController theController = new HospitalController(theView, theModel);
        
        theView.setVisible(true);
    }
}
