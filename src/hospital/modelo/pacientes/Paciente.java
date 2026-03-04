package hospital.modelo.pacientes;

import hospital.interfaces.IAtendible;
import hospital.modelo.personajes.Characters;

public abstract class Paciente extends Characters implements IAtendible {

    private String numeroHistorialMedico;
    private String fechaIngresoPaciente;
    private String seguroMedicoPaciente;

    public Paciente(String nombrePersona, String apellidoPersona, int edadPersona,
                    String dniPersona, String telefonoPersona,
                    String numeroHistorialMedico, String fechaIngresoPaciente,
                    String seguroMedicoPaciente) {
        super(nombrePersona, apellidoPersona, edadPersona, dniPersona, telefonoPersona);
        this.numeroHistorialMedico = numeroHistorialMedico;
        this.fechaIngresoPaciente  = fechaIngresoPaciente;
        this.seguroMedicoPaciente  = seguroMedicoPaciente;
    }

    public String getNumeroHistorialMedico() { return numeroHistorialMedico; }
    public String getFechaIngresoPaciente()  { return fechaIngresoPaciente; }
    public String getSeguroMedicoPaciente()  { return seguroMedicoPaciente; }

    public void setNumeroHistorialMedico(String numeroHistorialMedico) { this.numeroHistorialMedico = numeroHistorialMedico; }
    public void setFechaIngresoPaciente(String fechaIngresoPaciente)   { this.fechaIngresoPaciente = fechaIngresoPaciente; }
    public void setSeguroMedicoPaciente(String seguroMedicoPaciente)   { this.seguroMedicoPaciente = seguroMedicoPaciente; }
}