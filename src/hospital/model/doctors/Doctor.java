package hospital.model.doctors;

import hospital.interfaces.IDoctor;
import hospital.model.characters.Characters;

public abstract class Doctor extends Characters implements IDoctor {

    private String licenseNumber;
    private String department;
    private int    weeklyHours;

    public Doctor(String firstName, String lastName, int age,
                  String dni, String phone,
                  String licenseNumber, String department, int weeklyHours) {
        super(firstName, lastName, age, dni, phone);
        this.licenseNumber = licenseNumber;
        this.department    = department;
        this.weeklyHours   = weeklyHours;
    }

    public String getLicenseNumber() { return licenseNumber; }
    public String getDepartment()    { return department; }
    public int    getWeeklyHours()   { return weeklyHours; }

    public void setLicenseNumber(String licenseNumber) { this.licenseNumber = licenseNumber; }
    public void setDepartment(String department)       { this.department = department; }
    public void setWeeklyHours(int weeklyHours)        { this.weeklyHours = weeklyHours; }

    public abstract void print();
}