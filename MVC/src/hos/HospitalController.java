package hos;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class HospitalController {
    private HospitalView theView;
    private PatientModel theModel;
    
    public HospitalController(HospitalView theView, PatientModel theModel) {
        this.theView = theView;
        this.theModel = theModel;
        this.theView.addPatientButtonListener(new AddPatientListener());
    }
    
    class AddPatientListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            try {
                String name = theView.getPatientName();
                int age = theView.getPatientAge();
                String condition = theView.getPatientCondition();
                
                Patient patient = new Patient(name, age, condition);
                theModel.addPatient(patient);
                
                theView.addPatientData("Name: " + name + ", Age: " + age + ", Condition: " + condition);
            } catch (NumberFormatException ex) {
                theView.displayErrorMessage("Please enter a valid age.");
            }
        }
    }
}
