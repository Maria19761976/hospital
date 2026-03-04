package hospital.modelo.pacientes;

public class PacienteConsulta extends Paciente {

    private String motivoConsultaPaciente;
    private String turnoPaciente;
    private String medicoAsignadoPaciente;
    private String proximaCitaPaciente;

    public PacienteConsulta(String nombrePersona, String apellidoPersona, int edadPersona,
                            String dniPersona, String telefonoPersona,
                            String numeroHistorialMedico, String fechaIngresoPaciente,
                            String seguroMedicoPaciente, String motivoConsultaPaciente,
                            String turnoPaciente, String medicoAsignadoPaciente,
                            String proximaCitaPaciente) {
        super(nombrePersona, apellidoPersona, edadPersona, dniPersona, telefonoPersona,
                numeroHistorialMedico, fechaIngresoPaciente, seguroMedicoPaciente);
        this.motivoConsultaPaciente = motivoConsultaPaciente;
        this.turnoPaciente          = turnoPaciente;
        this.medicoAsignadoPaciente = medicoAsignadoPaciente;
        this.proximaCitaPaciente    = proximaCitaPaciente;
    }


    public String getMotivoConsultaPaciente() { return motivoConsultaPaciente; }
    public String getTurnoPaciente()          { return turnoPaciente; }
    public String getMedicoAsignadoPaciente() { return medicoAsignadoPaciente; }
    public String getProximaCitaPaciente()    { return proximaCitaPaciente; }

    public void setMotivoConsultaPaciente(String m) { this.motivoConsultaPaciente = m; }
    public void setTurnoPaciente(String t)           { this.turnoPaciente = t; }
    public void setMedicoAsignadoPaciente(String m)  { this.medicoAsignadoPaciente = m; }
    public void setProximaCitaPaciente(String p)     { this.proximaCitaPaciente = p; }

    @Override public void admision()  { System.out.println("[ADMISIÓN] " + getNombrePersona() + " registrado para consulta. Turno: " + turnoPaciente); }
    @Override public void habitacion(){ System.out.println("[HABITACIÓN] " + getNombrePersona() + " pasa a sala de consulta."); }
    @Override public void tratamiento(){ System.out.println("[TRATAMIENTO] Médico " + medicoAsignadoPaciente + " atiende a " + getNombrePersona() + ". Motivo: " + motivoConsultaPaciente); }
    @Override public void salida()    { System.out.println("[SALIDA] " + getNombrePersona() + " ha sido dado de alta. Próxima cita: " + proximaCitaPaciente); }

    public void controlEnfermera() { System.out.println("[ENFERMERA] Control de signos vitales de " + getNombrePersona()); }
    public void proximaCita()      { System.out.println("[PRÓXIMA CITA] Programada para: " + proximaCitaPaciente); }

    @Override
    public void imprimir() {
        System.out.println("===== PACIENTE CONSULTA =====");
        System.out.println("Nombre:        " + getNombrePersona() + " " + getApellidoPersona());
        System.out.println("Edad:          " + getEdadPersona());
        System.out.println("DNI:           " + getDniPersona());
        System.out.println("Teléfono:      " + getTelefonoPersona());
        System.out.println("Historial:     " + getNumeroHistorialMedico());
        System.out.println("Ingreso:       " + getFechaIngresoPaciente());
        System.out.println("Seguro:        " + getSeguroMedicoPaciente());
        System.out.println("Motivo:        " + motivoConsultaPaciente);
        System.out.println("Turno:         " + turnoPaciente);
        System.out.println("Médico:        " + medicoAsignadoPaciente);
        System.out.println("Próxima cita:  " + proximaCitaPaciente);
        System.out.println("=============================\n");
    }
}