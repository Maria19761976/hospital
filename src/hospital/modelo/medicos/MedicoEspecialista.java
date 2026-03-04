package hospital.modelo.medicos;

public class MedicoEspecialista extends Medico {

    private String especialidadMedico;
    private int    diasVacacionesMedico;
    private int    aniosExperienciaMedico;

    public MedicoEspecialista(String nombrePersona, String apellidoPersona, int edadPersona,
                              String dniPersona, String telefonoPersona,
                              String matriculaMedico, String departamentoMedico,
                              int horasSemanaMedico, String especialidadMedico,
                              int diasVacacionesMedico, int aniosExperienciaMedico) {
        super(nombrePersona, apellidoPersona, edadPersona, dniPersona, telefonoPersona,
                matriculaMedico, departamentoMedico, horasSemanaMedico);
        this.especialidadMedico    = especialidadMedico;
        this.diasVacacionesMedico  = diasVacacionesMedico;
        this.aniosExperienciaMedico = aniosExperienciaMedico;
    }

    public String getEspecialidadMedico()     { return especialidadMedico; }
    public int    getDiasVacacionesMedico()   { return diasVacacionesMedico; }
    public int    getAniosExperienciaMedico() { return aniosExperienciaMedico; }

    public void setEspecialidadMedico(String e)      { this.especialidadMedico = e; }
    public void setDiasVacacionesMedico(int d)       { this.diasVacacionesMedico = d; }
    public void setAniosExperienciaMedico(int a)     { this.aniosExperienciaMedico = a; }

    @Override public void horasDeTrabajoSemana() { System.out.println("[HORAS] Dr. " + getNombrePersona() + " trabaja " + getHorasSemanaMedico() + " horas/semana."); }
    @Override public void comer()                { System.out.println("[COMIDA] Dr. " + getNombrePersona() + " toma su descanso para comer."); }

    public void vacaciones()    { System.out.println("[VACACIONES] Dr. " + getNombrePersona() + " tiene " + diasVacacionesMedico + " días de vacaciones."); }
    public void especialidad()  { System.out.println("[ESPECIALIDAD] Dr. " + getNombrePersona() + " es especialista en " + especialidadMedico); }

    @Override
    public void imprimir() {
        System.out.println("===== MÉDICO ESPECIALISTA =====");
        System.out.println("Nombre:        " + getNombrePersona() + " " + getApellidoPersona());
        System.out.println("Edad:          " + getEdadPersona());
        System.out.println("DNI:           " + getDniPersona());
        System.out.println("Teléfono:      " + getTelefonoPersona());
        System.out.println("Matrícula:     " + getMatriculaMedico());
        System.out.println("Departamento:  " + getDepartamentoMedico());
        System.out.println("Horas/semana:  " + getHorasSemanaMedico());
        System.out.println("Especialidad:  " + especialidadMedico);
        System.out.println("Vacaciones:    " + diasVacacionesMedico + " días");
        System.out.println("Experiencia:   " + aniosExperienciaMedico + " años");
        System.out.println("===============================\n");
    }
}