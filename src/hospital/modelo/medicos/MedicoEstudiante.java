package hospital.modelo.medicos;

public class MedicoEstudiante extends Medico {

    private int    horasEstudioSemanaMedico;
    private String cursoActualMedico;
    private String universidadMedico;
    private int    anioCarreraMedico;

    public MedicoEstudiante(String nombrePersona, String apellidoPersona, int edadPersona,
                            String dniPersona, String telefonoPersona,
                            String matriculaMedico, String departamentoMedico,
                            int horasSemanaMedico, int horasEstudioSemanaMedico,
                            String cursoActualMedico, String universidadMedico,
                            int anioCarreraMedico) {
        super(nombrePersona, apellidoPersona, edadPersona, dniPersona, telefonoPersona,
                matriculaMedico, departamentoMedico, horasSemanaMedico);
        this.horasEstudioSemanaMedico = horasEstudioSemanaMedico;
        this.cursoActualMedico        = cursoActualMedico;
        this.universidadMedico        = universidadMedico;
        this.anioCarreraMedico        = anioCarreraMedico;
    }

    public int    getHorasEstudioSemanaMedico() { return horasEstudioSemanaMedico; }
    public String getCursoActualMedico()        { return cursoActualMedico; }
    public String getUniversidadMedico()        { return universidadMedico; }
    public int    getAnioCarreraMedico()        { return anioCarreraMedico; }

    public void setHorasEstudioSemanaMedico(int h) { this.horasEstudioSemanaMedico = h; }
    public void setCursoActualMedico(String c)      { this.cursoActualMedico = c; }
    public void setUniversidadMedico(String u)      { this.universidadMedico = u; }
    public void setAnioCarreraMedico(int a)         { this.anioCarreraMedico = a; }

    @Override public void horasDeTrabajoSemana()  { System.out.println("[HORAS TRABAJO] " + getNombrePersona() + " trabaja " + getHorasSemanaMedico() + " horas/semana."); }
    @Override public void comer()                 { System.out.println("[COMIDA] " + getNombrePersona() + " come entre clases y guardia."); }

    public void horasEstudioPorSemana() { System.out.println("[ESTUDIO] " + getNombrePersona() + " estudia " + horasEstudioSemanaMedico + " horas/semana."); }
    public void cursoActual()           { System.out.println("[CURSO] " + getNombrePersona() + " cursa " + cursoActualMedico + " en " + universidadMedico); }

    @Override
    public void imprimir() {
        System.out.println("===== MÉDICO ESTUDIANTE =====");
        System.out.println("Nombre:        " + getNombrePersona() + " " + getApellidoPersona());
        System.out.println("Edad:          " + getEdadPersona());
        System.out.println("DNI:           " + getDniPersona());
        System.out.println("Teléfono:      " + getTelefonoPersona());
        System.out.println("Matrícula:     " + getMatriculaMedico());
        System.out.println("Departamento:  " + getDepartamentoMedico());
        System.out.println("Horas trabajo: " + getHorasSemanaMedico() + " h/semana");
        System.out.println("Horas estudio: " + horasEstudioSemanaMedico + " h/semana");
        System.out.println("Curso:         " + cursoActualMedico);
        System.out.println("Universidad:   " + universidadMedico);
        System.out.println("Año carrera:   " + anioCarreraMedico);
        System.out.println("=============================\n");
    }
}