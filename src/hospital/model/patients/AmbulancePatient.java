package hospital.model.patients;

public class AmbulancePatient extends Patient {

    private String  emergencyType;
    private int     urgencyLevel;
    private String  assignedSurgeon;
    private boolean requiresRehabilitation;

    public AmbulancePatient(String firstName, String lastName, int age,
                            String dni, String phone,
                            String medicalRecordNumber, String admissionDate,
                            String medicalInsurance, String emergencyType,
                            int urgencyLevel, String assignedSurgeon,
                            boolean requiresRehabilitation) {
        super(firstName, lastName, age, dni, phone,
                medicalRecordNumber, admissionDate, medicalInsurance);
        this.emergencyType          = emergencyType;
        this.urgencyLevel           = urgencyLevel;
        this.assignedSurgeon        = assignedSurgeon;
        this.requiresRehabilitation = requiresRehabilitation;
    }

    public String  getEmergencyType()         { return emergencyType; }
    public int     getUrgencyLevel()          { return urgencyLevel; }
    public String  getAssignedSurgeon()       { return assignedSurgeon; }
    public boolean isRequiresRehabilitation() { return requiresRehabilitation; }

    public void setEmergencyType(String emergencyType)                { this.emergencyType = emergencyType; }
    public void setUrgencyLevel(int urgencyLevel)                     { this.urgencyLevel = urgencyLevel; }
    public void setAssignedSurgeon(String assignedSurgeon)            { this.assignedSurgeon = assignedSurgeon; }
    public void setRequiresRehabilitation(boolean requiresRehabilitation) { this.requiresRehabilitation = requiresRehabilitation; }

    @Override public void admission()  { System.out.println("[EMERGENCY] " + getFirstName() + " arrives by ambulance. Urgency level: " + urgencyLevel); }
    @Override public void ward()       { System.out.println("[ICU] " + getFirstName() + " transferred to ICU."); }
    @Override public void treatment()  { System.out.println("[TREATMENT] Surgeon " + assignedSurgeon + " treats " + getFirstName()); }
    @Override public void discharge()  { System.out.println("[DISCHARGE] " + getFirstName() + " receives hospital discharge."); }

    public void operation()       { System.out.println("[OPERATION] Surgical intervention for " + getFirstName() + ". Type: " + emergencyType); }
    public void rehabilitation()  { System.out.println("[REHAB] Rehabilitation " + (requiresRehabilitation ? "required" : "not required") + " for " + getFirstName()); }

    @Override
    public void print() {
        System.out.println("===== AMBULANCE PATIENT =====");
        System.out.println("Name:           " + getFirstName() + " " + getLastName());
        System.out.println("Age:            " + getAge());
        System.out.println("DNI:            " + getDni());
        System.out.println("Phone:          " + getPhone());
        System.out.println("Medical Record: " + getMedicalRecordNumber());
        System.out.println("Admission:      " + getAdmissionDate());
        System.out.println("Insurance:      " + getMedicalInsurance());
        System.out.println("Emergency:      " + emergencyType);
        System.out.println("Urgency:        " + urgencyLevel);
        System.out.println("Surgeon:        " + assignedSurgeon);
        System.out.println("Rehabilitation: " + requiresRehabilitation);
        System.out.println("=============================\n");
    }
}