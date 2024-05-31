package hospital;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AppointmentController {
    private AppointmentView theView;
    private AppointmentModel theModel;
    
    public AppointmentController(AppointmentView theView, AppointmentModel theModel) {
        this.theView = theView;
        this.theModel = theModel;
        this.theView.addScheduleButtonListener(new ScheduleButtonListener());
    }
    
    class ScheduleButtonListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            try {
                String patientName = theView.getPatientName();
                String doctorName = theView.getDoctorName();
                
                Appointment appointment = new Appointment(patientName, doctorName);
                theModel.addAppointment(appointment);
                
                theView.addAppointmentData("Patient: " + patientName + ", Doctor: " + doctorName);
            } catch (Exception ex) {
                theView.displayErrorMessage("Error scheduling appointment: " + ex.getMessage());
            }
        }
    }
}
