package hospital.model.patients;

import hospital.interfaces.IAttendable;
import hospital.model.characters.Characters;

public abstract class Patient extends Characters implements IAttendable {

    private String medicalRecordNumber;
    private String admissionDate;
    private String medicalInsurance;

    public Patient(String firstName, String lastName, int age,
                   String dni, String phone,
                   String medicalRecordNumber, String admissionDate,
                   String medicalInsurance) {
        super(firstName, lastName, age, dni, phone);
        this.medicalRecordNumber = medicalRecordNumber;
        this.admissionDate       = admissionDate;
        this.medicalInsurance    = medicalInsurance;
    }

    public String getMedicalRecordNumber() { return medicalRecordNumber; }
    public String getAdmissionDate()       { return admissionDate; }
    public String getMedicalInsurance()    { return medicalInsurance; }

    public void setMedicalRecordNumber(String medicalRecordNumber) { this.medicalRecordNumber = medicalRecordNumber; }
    public void setAdmissionDate(String admissionDate)             { this.admissionDate = admissionDate; }
    public void setMedicalInsurance(String medicalInsurance)       { this.medicalInsurance = medicalInsurance; }

    public abstract void print();
}