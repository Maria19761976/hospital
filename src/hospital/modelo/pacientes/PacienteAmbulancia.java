package hospital.modelo.pacientes;

public class PacienteAmbulancia extends Paciente {

    private String  tipoEmergenciaPaciente;
    private int     nivelUrgenciaPaciente;
    private String  cirujanoAsignadoPaciente;
    private boolean requiereRehabPaciente;

    public PacienteAmbulancia(String nombrePersona, String apellidoPersona, int edadPersona,
                              String dniPersona, String telefonoPersona,
                              String numeroHistorialMedico, String fechaIngresoPaciente,
                              String seguroMedicoPaciente, String tipoEmergenciaPaciente,
                              int nivelUrgenciaPaciente, String cirujanoAsignadoPaciente,
                              boolean requiereRehabPaciente) {
        super(nombrePersona, apellidoPersona, edadPersona, dniPersona, telefonoPersona,
                numeroHistorialMedico, fechaIngresoPaciente, seguroMedicoPaciente);
        this.tipoEmergenciaPaciente  = tipoEmergenciaPaciente;
        this.nivelUrgenciaPaciente   = nivelUrgenciaPaciente;
        this.cirujanoAsignadoPaciente = cirujanoAsignadoPaciente;
        this.requiereRehabPaciente   = requiereRehabPaciente;
    }

    public String  getTipoEmergenciaPaciente()   { return tipoEmergenciaPaciente; }
    public int     getNivelUrgenciaPaciente()     { return nivelUrgenciaPaciente; }
    public String  getCirujanoAsignadoPaciente()  { return cirujanoAsignadoPaciente; }
    public boolean isRequiereRehabPaciente()      { return requiereRehabPaciente; }

    public void setTipoEmergenciaPaciente(String t)   { this.tipoEmergenciaPaciente = t; }
    public void setNivelUrgenciaPaciente(int n)        { this.nivelUrgenciaPaciente = n; }
    public void setCirujanoAsignadoPaciente(String c)  { this.cirujanoAsignadoPaciente = c; }
    public void setRequiereRehabPaciente(boolean r)    { this.requiereRehabPaciente = r; }

    @Override public void admision()   { System.out.println("[EMERGENCIA] " + getNombrePersona() + " ingresa en ambulancia. Urgencia nivel: " + nivelUrgenciaPaciente); }
    @Override public void habitacion() { System.out.println("[UCI] " + getNombrePersona() + " trasladado a UCI."); }
    @Override public void tratamiento(){ System.out.println("[TRATAMIENTO] Cirujano " + cirujanoAsignadoPaciente + " trata a " + getNombrePersona()); }
    @Override public void salida()     { System.out.println("[ALTA] " + getNombrePersona() + " recibe el alta hospitalaria."); }

    public void operacion()      { System.out.println("[OPERACIÓN] Intervención quirúrgica de " + getNombrePersona() + ". Tipo: " + tipoEmergenciaPaciente); }
    public void rehabilitacion() { System.out.println("[REHAB] Rehabilitación " + (requiereRehabPaciente ? "requerida" : "no requerida") + " para " + getNombrePersona()); }

    @Override
    public void imprimir() {
        System.out.println("===== PACIENTE AMBULANCIA =====");
        System.out.println("Nombre:        " + getNombrePersona() + " " + getApellidoPersona());
        System.out.println("Edad:          " + getEdadPersona());
        System.out.println("DNI:           " + getDniPersona());
        System.out.println("Teléfono:      " + getTelefonoPersona());
        System.out.println("Historial:     " + getNumeroHistorialMedico());
        System.out.println("Ingreso:       " + getFechaIngresoPaciente());
        System.out.println("Seguro:        " + getSeguroMedicoPaciente());
        System.out.println("Emergencia:    " + tipoEmergenciaPaciente);
        System.out.println("Urgencia:      " + nivelUrgenciaPaciente);
        System.out.println("Cirujano:      " + cirujanoAsignadoPaciente);
        System.out.println("Rehabilitación:" + requiereRehabPaciente);
        System.out.println("===============================\n");
    }
}