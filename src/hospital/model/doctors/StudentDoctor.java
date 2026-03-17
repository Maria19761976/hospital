package hospital.model.doctors;

public class StudentDoctor extends Doctor {

    private int    weeklyStudyHours;
    private String currentCourse;
    private String university;
    private int    careerYear;

    public StudentDoctor(String firstName, String lastName, int age,
                         String dni, String phone,
                         String licenseNumber, String department,
                         int weeklyHours, int weeklyStudyHours,
                         String currentCourse, String university,
                         int careerYear) {
        super(firstName, lastName, age, dni, phone,
                licenseNumber, department, weeklyHours);
        this.weeklyStudyHours = weeklyStudyHours;
        this.currentCourse    = currentCourse;
        this.university       = university;
        this.careerYear       = careerYear;
    }

    public int    getWeeklyStudyHours() { return weeklyStudyHours; }
    public String getCurrentCourse()    { return currentCourse; }
    public String getUniversity()       { return university; }
    public int    getCareerYear()       { return careerYear; }

    public void setWeeklyStudyHours(int weeklyStudyHours) { this.weeklyStudyHours = weeklyStudyHours; }
    public void setCurrentCourse(String currentCourse)    { this.currentCourse = currentCourse; }
    public void setUniversity(String university)          { this.university = university; }
    public void setCareerYear(int careerYear)             { this.careerYear = careerYear; }

    @Override public void weeklyWorkHours()  { System.out.println("[WORK HOURS] " + getFirstName() + " works " + getWeeklyHours() + " hours/week."); }
    @Override public void eat()              { System.out.println("[LUNCH] " + getFirstName() + " eats between classes and shifts."); }

    public void showWeeklyStudyHours() { System.out.println("[STUDY] " + getFirstName() + " studies " + weeklyStudyHours + " hours/week."); }
    public void showCurrentCourse()    { System.out.println("[COURSE] " + getFirstName() + " is taking " + currentCourse + " at " + university); }

    @Override
    public void print() {
        System.out.println("===== STUDENT DOCTOR =====");
        System.out.println("Name:          " + getFirstName() + " " + getLastName());
        System.out.println("Age:           " + getAge());
        System.out.println("DNI:           " + getDni());
        System.out.println("Phone:         " + getPhone());
        System.out.println("License:       " + getLicenseNumber());
        System.out.println("Department:    " + getDepartment());
        System.out.println("Work hours:    " + getWeeklyHours() + " h/week");
        System.out.println("Study hours:   " + weeklyStudyHours + " h/week");
        System.out.println("Course:        " + currentCourse);
        System.out.println("University:    " + university);
        System.out.println("Career year:   " + careerYear);
        System.out.println("==========================\n");
    }
}