package hospital.modelo.personajes;

import hospital.interfaces.IPrintable;

public abstract class Characters implements IPrintable {

    private String nombrePersona;
    private String apellidoPersona;
    private int    edadPersona;
    private String dniPersona;
    private String telefonoPersona;

    public Characters(String nombrePersona, String apellidoPersona,
                      int edadPersona, String dniPersona, String telefonoPersona) {
        this.nombrePersona   = nombrePersona;
        this.apellidoPersona = apellidoPersona;
        this.edadPersona     = edadPersona;
        this.dniPersona      = dniPersona;
        this.telefonoPersona = telefonoPersona;
    }


    public String getNombrePersona()   { return nombrePersona; }
    public String getApellidoPersona() { return apellidoPersona; }
    public int    getEdadPersona()     { return edadPersona; }
    public String getDniPersona()      { return dniPersona; }
    public String getTelefonoPersona() { return telefonoPersona; }


    public void setNombrePersona(String nombrePersona)     { this.nombrePersona = nombrePersona; }
    public void setApellidoPersona(String apellidoPersona) { this.apellidoPersona = apellidoPersona; }
    public void setEdadPersona(int edadPersona)            { this.edadPersona = edadPersona; }
    public void setDniPersona(String dniPersona)           { this.dniPersona = dniPersona; }
    public void setTelefonoPersona(String telefonoPersona) { this.telefonoPersona = telefonoPersona; }
}