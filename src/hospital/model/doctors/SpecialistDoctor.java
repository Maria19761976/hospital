package hospital.model.doctors;

public class SpecialistDoctor extends Doctor {

    private String specialty;
    private int    vacationDays;
    private int    yearsOfExperience;

    public SpecialistDoctor(String firstName, String lastName, int age,
                            String dni, String phone,
                            String licenseNumber, String department,
                            int weeklyHours, String specialty,
                            int vacationDays, int yearsOfExperience) {
        super(firstName, lastName, age, dni, phone,
                licenseNumber, department, weeklyHours);
        this.specialty         = specialty;
        this.vacationDays      = vacationDays;
        this.yearsOfExperience = yearsOfExperience;
    }

    public String getSpecialty()        { return specialty; }
    public int    getVacationDays()     { return vacationDays; }
    public int    getYearsOfExperience(){ return yearsOfExperience; }

    public void setSpecialty(String specialty)              { this.specialty = specialty; }
    public void setVacationDays(int vacationDays)           { this.vacationDays = vacationDays; }
    public void setYearsOfExperience(int yearsOfExperience) { this.yearsOfExperience = yearsOfExperience; }

    @Override public void weeklyWorkHours() { System.out.println("[HOURS] Dr. " + getFirstName() + " works " + getWeeklyHours() + " hours/week."); }
    @Override public void eat()             { System.out.println("[LUNCH] Dr. " + getFirstName() + " takes their lunch break."); }

    public void vacation()      { System.out.println("[VACATION] Dr. " + getFirstName() + " has " + vacationDays + " vacation days."); }
    public void showSpecialty() { System.out.println("[SPECIALTY] Dr. " + getFirstName() + " specializes in " + specialty); }

    @Override
    public void print() {
        System.out.println("===== SPECIALIST DOCTOR =====");
        System.out.println("Name:         " + getFirstName() + " " + getLastName());
        System.out.println("Age:          " + getAge());
        System.out.println("DNI:          " + getDni());
        System.out.println("Phone:        " + getPhone());
        System.out.println("License:      " + getLicenseNumber());
        System.out.println("Department:   " + getDepartment());
        System.out.println("Hours/week:   " + getWeeklyHours());
        System.out.println("Specialty:    " + specialty);
        System.out.println("Vacation:     " + vacationDays + " days");
        System.out.println("Experience:   " + yearsOfExperience + " years");
        System.out.println("=============================\n");
    }
}