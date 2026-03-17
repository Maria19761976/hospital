package hospital.model.patients;

public class ConsultationPatient extends Patient {

    private String consultationReason;
    private String shift;
    private String assignedDoctor;
    private String nextAppointment;

    public ConsultationPatient(String firstName, String lastName, int age,
                               String dni, String phone,
                               String medicalRecordNumber, String admissionDate,
                               String medicalInsurance, String consultationReason,
                               String shift, String assignedDoctor,
                               String nextAppointment) {
        super(firstName, lastName, age, dni, phone,
                medicalRecordNumber, admissionDate, medicalInsurance);
        this.consultationReason = consultationReason;
        this.shift              = shift;
        this.assignedDoctor     = assignedDoctor;
        this.nextAppointment    = nextAppointment;
    }

    public String getConsultationReason() { return consultationReason; }
    public String getShift()              { return shift; }
    public String getAssignedDoctor()     { return assignedDoctor; }
    public String getNextAppointment()    { return nextAppointment; }

    public void setConsultationReason(String consultationReason) { this.consultationReason = consultationReason; }
    public void setShift(String shift)                           { this.shift = shift; }
    public void setAssignedDoctor(String assignedDoctor)         { this.assignedDoctor = assignedDoctor; }
    public void setNextAppointment(String nextAppointment)       { this.nextAppointment = nextAppointment; }

    @Override public void admission()  { System.out.println("[ADMISSION] " + getFirstName() + " registered for consultation. Shift: " + shift); }
    @Override public void ward()       { System.out.println("[WARD] " + getFirstName() + " moves to consultation room."); }
    @Override public void treatment()  { System.out.println("[TREATMENT] Doctor " + assignedDoctor + " attends to " + getFirstName() + ". Reason: " + consultationReason); }
    @Override public void discharge()  { System.out.println("[DISCHARGE] " + getFirstName() + " has been discharged. Next appointment: " + nextAppointment); }

    public void nurseCheck()          { System.out.println("[NURSE] Vital signs check for " + getFirstName()); }
    public void showNextAppointment() { System.out.println("[NEXT APPOINTMENT] Scheduled for: " + nextAppointment); }

    @Override
    public void print() {
        System.out.println("===== CONSULTATION PATIENT =====");
        System.out.println("Name:            " + getFirstName() + " " + getLastName());
        System.out.println("Age:             " + getAge());
        System.out.println("DNI:             " + getDni());
        System.out.println("Phone:           " + getPhone());
        System.out.println("Medical Record:  " + getMedicalRecordNumber());
        System.out.println("Admission:       " + getAdmissionDate());
        System.out.println("Insurance:       " + getMedicalInsurance());
        System.out.println("Reason:          " + consultationReason);
        System.out.println("Shift:           " + shift);
        System.out.println("Doctor:          " + assignedDoctor);
        System.out.println("Next Appointment:" + nextAppointment);
        System.out.println("================================\n");
    }
}