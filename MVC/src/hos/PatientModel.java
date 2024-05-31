package hos;

import java.util.ArrayList;
import java.util.List;

public class PatientModel {
    private List<Patient> patients;
    
    public PatientModel() {
        patients = new ArrayList<>();
    }
    
    public void addPatient(Patient patient) {
        patients.add(patient);
    }
}
