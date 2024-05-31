package hospital;

public class Appointment {
    private String patientName;
    private String doctorName;
    
    public Appointment(String patientName, String doctorName) {
        this.patientName = patientName;
        this.doctorName = doctorName;
    }
    
    public String getPatientName() {
        return patientName;
    }
    
    public String getDoctorName() {
        return doctorName;
    }
}
