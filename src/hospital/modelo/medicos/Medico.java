package hospital.modelo.medicos;

import hospital.interfaces.IMedico;
import hospital.modelo.personajes.Characters;

public abstract class Medico extends Characters implements IMedico {

    private String matriculaMedico;
    private String departamentoMedico;
    private int    horasSemanaMedico;

    public Medico(String nombrePersona, String apellidoPersona, int edadPersona,
                  String dniPersona, String telefonoPersona,
                  String matriculaMedico, String departamentoMedico, int horasSemanaMedico) {
        super(nombrePersona, apellidoPersona, edadPersona, dniPersona, telefonoPersona);
        this.matriculaMedico    = matriculaMedico;
        this.departamentoMedico = departamentoMedico;
        this.horasSemanaMedico  = horasSemanaMedico;
    }

    public String getMatriculaMedico()    { return matriculaMedico; }
    public String getDepartamentoMedico() { return departamentoMedico; }
    public int    getHorasSemanaMedico()  { return horasSemanaMedico; }

    public void setMatriculaMedico(String matriculaMedico)       { this.matriculaMedico = matriculaMedico; }
    public void setDepartamentoMedico(String departamentoMedico) { this.departamentoMedico = departamentoMedico; }
    public void setHorasSemanaMedico(int horasSemanaMedico)      { this.horasSemanaMedico = horasSemanaMedico; }
}