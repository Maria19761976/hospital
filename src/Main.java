package hospital;

import hospital.model.doctors.SpecialistDoctor;
import hospital.model.doctors.StudentDoctor;
import hospital.model.patients.AmbulancePatient;
import hospital.model.patients.ConsultationPatient;

public class Main {
    public static void main(String[] args) {

        ConsultationPatient consultationPatient1 = new ConsultationPatient(
                "Laura","García", 34, "12345678A", "600111222",
                "HC-001","2025-03-01","Sanitas",
                "Headache","Morning","Dr. Pérez","2025-03-15"
        );
        ConsultationPatient consultationPatient2 = new ConsultationPatient(
                "Carlos","López", 50, "87654321B", "600333444",
                "HC-002","2025-03-02","Mapfre",
                "Blood pressure check","Afternoon","Dr. Ruiz","2025-03-20"
        );

        AmbulancePatient ambulancePatient1 = new AmbulancePatient(
                "Mario","Fernández", 62, "11223344C", "600555666",
                "HC-003","2025-03-03","Adeslas",
                "Acute myocardial infarction",1,"Dr. Torres", true
        );
        AmbulancePatient ambulancePatient2 = new AmbulancePatient(
                "Ana","Martínez", 28, "44332211D", "600777888",
                "HC-004","2025-03-04","Asisa",
                "Femur fracture",2,"Dr. Vega", true
        );

        SpecialistDoctor specialistDoctor1 = new SpecialistDoctor(
                "Pedro","Torres", 45, "55667788E", "600999000",
                "MAT-001","Cardiology", 40,
                "Cardiology", 22, 15
        );
        SpecialistDoctor specialistDoctor2 = new SpecialistDoctor(
                "Sofía","Vega", 38, "88776655F", "601000111",
                "MAT-002","Traumatology", 38,
                "Traumatology", 28, 10
        );

        StudentDoctor studentDoctor1 = new StudentDoctor(
                "Juan","Ramírez", 24, "99887766G", "601222333",
                "EST-001","Emergency", 20,
                30,"Anatomy","Complutense University", 4
        );
        StudentDoctor studentDoctor2 = new StudentDoctor(
                "Elena","Castro", 23, "66778899H", "601444555",
                "EST-002","Pediatrics", 18,
                35,"Physiology","University of Salamanca", 3
        );

        System.out.println("\n========== CONSULTATION PATIENTS ==========");
        consultationPatient1.print();
        consultationPatient2.print();

        System.out.println("========== AMBULANCE PATIENTS ==========");
        ambulancePatient1.print();
        ambulancePatient2.print();

        System.out.println("========== SPECIALIST DOCTORS ==========");
        specialistDoctor1.print();
        specialistDoctor2.print();

        System.out.println("========== STUDENT DOCTORS ==========");
        studentDoctor1.print();
        studentDoctor2.print();
    }
}