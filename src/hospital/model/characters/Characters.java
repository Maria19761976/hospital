package hospital.model.characters;

import hospital.interfaces.IPrintable;

public abstract class Characters implements IPrintable {

    private String firstName;
    private String lastName;
    private int    age;
    private String dni;
    private String phone;

    public Characters(String firstName, String lastName,
                      int age, String dni, String phone) {
        this.firstName = firstName;
        this.lastName  = lastName;
        this.age       = age;
        this.dni       = dni;
        this.phone     = phone;
    }

    public String getFirstName() { return firstName; }
    public String getLastName()  { return lastName; }
    public int    getAge()       { return age; }
    public String getDni()       { return dni; }
    public String getPhone()     { return phone; }

    public void setFirstName(String firstName) { this.firstName = firstName; }
    public void setLastName(String lastName)   { this.lastName = lastName; }
    public void setAge(int age)                { this.age = age; }
    public void setDni(String dni)             { this.dni = dni; }
    public void setPhone(String phone)         { this.phone = phone; }
}