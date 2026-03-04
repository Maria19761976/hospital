package hospital;

import hospital.modelo.medicos.MedicoEspecialista;
import hospital.modelo.medicos.MedicoEstudiante;
import hospital.modelo.pacientes.PacienteAmbulancia;
import hospital.modelo.pacientes.PacienteConsulta;

public class Main {
    public static void main(String[] args) {


        PacienteConsulta pacienteConsulta1 = new PacienteConsulta(
                "Laura","García", 34, "12345678A", "600111222",
                "HC-001","2025-03-01","Sanitas",
                "Dolor de cabeza","Mañana","Dr. Pérez","2025-03-15"
        );
        PacienteConsulta pacienteConsulta2 = new PacienteConsulta(
                "Carlos","López", 50, "87654321B", "600333444",
                "HC-002","2025-03-02","Mapfre",
                "Control tensión","Tarde","Dra. Ruiz","2025-03-20"
        );

        PacienteAmbulancia pacienteAmbulancia1 = new PacienteAmbulancia(
                "Mario","Fernández", 62, "11223344C", "600555666",
                "HC-003","2025-03-03","Adeslas",
                "Infarto agudo",1,"Dr. Torres", true
        );
        PacienteAmbulancia pacienteAmbulancia2 = new PacienteAmbulancia(
                "Ana","Martínez", 28, "44332211D", "600777888",
                "HC-004","2025-03-04","Asisa",
                "Fractura fémur",2,"Dr. Vega", true
        );


        MedicoEspecialista medicoEspecialista1 = new MedicoEspecialista(
                "Pedro","Torres", 45, "55667788E", "600999000",
                "MAT-001","Cardiología", 40,
                "Cardiología", 22, 15
        );
        MedicoEspecialista medicoEspecialista2 = new MedicoEspecialista(
                "Sofía","Vega", 38, "88776655F", "601000111",
                "MAT-002","Traumatología", 38,
                "Traumatología", 28, 10
        );


        MedicoEstudiante medicoEstudiante1 = new MedicoEstudiante(
                "Juan","Ramírez", 24, "99887766G", "601222333",
                "EST-001","Urgencias", 20,
                30,"Anatomía","Universidad Complutense", 4
        );
        MedicoEstudiante medicoEstudiante2 = new MedicoEstudiante(
                "Elena","Castro", 23, "66778899H", "601444555",
                "EST-002","Pediatría", 18,
                35,"Fisiología","Universidad de Salamanca", 3
        );

        System.out.println("\n========== PACIENTES CONSULTA ==========");
        pacienteConsulta1.imprimir();
        pacienteConsulta2.imprimir();

        System.out.println("========== PACIENTES AMBULANCIA ==========");
        pacienteAmbulancia1.imprimir();
        pacienteAmbulancia2.imprimir();

        System.out.println("========== MÉDICOS ESPECIALISTAS ==========");
        medicoEspecialista1.imprimir();
        medicoEspecialista2.imprimir();

        System.out.println("========== MÉDICOS ESTUDIANTES ==========");
        medicoEstudiante1.imprimir();
        medicoEstudiante2.imprimir();
    }
}