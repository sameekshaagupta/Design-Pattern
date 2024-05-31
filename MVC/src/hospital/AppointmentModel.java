package hospital;

import java.util.ArrayList;
import java.util.List;

public class AppointmentModel {
    private List<Appointment> appointments;
    
    public AppointmentModel() {
        appointments = new ArrayList<>();
    }
    
    public void addAppointment(Appointment appointment) {
        appointments.add(appointment);
    }
    
    public List<Appointment> getAppointments() {
        return appointments;
    }
}
