# 🏥 Hospital Java

> Sistema de Gestión Hospitalaria desarrollado en Java aplicando los 4 pilares de la POO y los principios SOLID.

![Java](https://img.shields.io/badge/Java-17-orange)
![POO](https://img.shields.io/badge/POO-4%20pilares-blue)
![SOLID](https://img.shields.io/badge/SOLID-5%20principios-green)

---

## 📋 Descripción

Este proyecto simula el funcionamiento de un hospital con pacientes y médicos.
Modela el ciclo completo de atención hospitalaria aplicando:

- **Encapsulamiento** — atributos `private` con getters y setters
- **Herencia** — jerarquía de 3 niveles
- **Polimorfismo** — `print()` distinto en cada clase
- **Abstracción** — clases abstractas e interfaces

---

## 📁 Estructura del Proyecto
```
src/
└── hospital/
    ├── interfaces/
    │   ├── IPrintable.java
    │   ├── IAttendable.java
    │   └── IDoctor.java
    ├── model/
    │   ├── characters/
    │   │   └── Characters.java
    │   ├── patients/
    │   │   ├── Patient.java
    │   │   ├── ConsultationPatient.java
    │   │   └── AmbulancePatient.java
    │   └── doctors/
    │       ├── Doctor.java
    │       ├── SpecialistDoctor.java
    │       └── StudentDoctor.java
    └── Main.java
```

---

## 🔌 Interfaces

### `IPrintable`
Contrato de impresión universal para cualquier entidad del sistema.

| Método | Retorno |
|--------|---------|
| `print()` | `void` |

---

### `IAttendable`
Define el flujo completo de atención de un paciente.

| Método | Descripción |
|--------|-------------|
| `admission()` | Registra la entrada del paciente |
| `ward()` | Asigna sala o habitación |
| `treatment()` | Aplica el tratamiento médico |
| `discharge()` | Gestiona el alta del paciente |

---

### `IDoctor`
Define el comportamiento laboral básico de cualquier médico.

| Método | Descripción |
|--------|-------------|
| `weeklyWorkHours()` | Muestra las horas trabajadas por semana |
| `eat()` | Representa el descanso para comer |

---

## 👑 Superclase — `Characters`

Clase madre de todo el sistema. Contiene los atributos comunes a cualquier persona.
Implementa `IPrintable`. Es **abstracta** — no se puede instanciar directamente.

| Atributo `private` | Tipo | Getter / Setter |
|--------------------|------|-----------------|
| `firstName` | `String` | ✅ |
| `lastName` | `String` | ✅ |
| `age` | `int` | ✅ |
| `dni` | `String` | ✅ |
| `phone` | `String` | ✅ |

---

## 🔷 Clases Abstractas

### `Patient`
> Extiende `Characters` · Implementa `IAttendable`

| Atributo `private` | Tipo | Descripción |
|--------------------|------|-------------|
| `medicalRecordNumber` | `String` | Número identificador del historial |
| `admissionDate` | `String` | Fecha de ingreso al hospital |
| `medicalInsurance` | `String` | Compañía de seguro médico |

---

### `Doctor`
> Extiende `Characters` · Implementa `IDoctor`

| Atributo `private` | Tipo | Descripción |
|--------------------|------|-------------|
| `licenseNumber` | `String` | Número de matrícula profesional |
| `department` | `String` | Departamento hospitalario asignado |
| `weeklyHours` | `int` | Horas de trabajo semanales |

---

## 🟣 Clases Concretas

### `ConsultationPatient`
> Extiende `Patient`

Paciente que llega por cita programada. Al alta, agenda una próxima cita.

| Atributo `private` | Tipo | Descripción |
|--------------------|------|-------------|
| `consultationReason` | `String` | Razón principal de la visita |
| `shift` | `String` | Turno: mañana o tarde |
| `assignedDoctor` | `String` | Médico que le atiende |
| `nextAppointment` | `String` | Fecha de la próxima revisión |

**Flujo:** `admission()` → `nurseCheck()` → `ward()` → `treatment()` → `showNextAppointment()` → `discharge()`

---

### `AmbulancePatient`
> Extiende `Patient`

Paciente de emergencia. Puede requerir operación y rehabilitación posterior.

| Atributo `private` | Tipo | Descripción |
|--------------------|------|-------------|
| `emergencyType` | `String` | Tipo de emergencia médica |
| `urgencyLevel` | `int` | Nivel de urgencia (1 = crítico) |
| `assignedSurgeon` | `String` | Cirujano responsable |
| `requiresRehabilitation` | `boolean` | Necesita rehabilitación posterior |

**Flujo:** `admission()` → `operation()` → `ward()` → `treatment()` → `rehabilitation()` → `discharge()`

---

### `SpecialistDoctor`
> Extiende `Doctor`

Médico con especialidad definida y experiencia acreditada.

| Atributo `private` | Tipo | Descripción |
|--------------------|------|-------------|
| `specialty` | `String` | Área de especialización |
| `vacationDays` | `int` | Días de vacaciones anuales |
| `yearsOfExperience` | `int` | Años de experiencia |

**Métodos:** `weeklyWorkHours()` · `showSpecialty()` · `vacation()` · `eat()` · `print()`

---

### `StudentDoctor`
> Extiende `Doctor`

Médico en formación que compagina guardia hospitalaria con estudios universitarios.

| Atributo `private` | Tipo | Descripción |
|--------------------|------|-------------|
| `weeklyStudyHours` | `int` | Horas de estudio por semana |
| `currentCourse` | `String` | Asignatura que está cursando |
| `university` | `String` | Universidad de origen |
| `careerYear` | `int` | Año en curso de la carrera |

**Métodos:** `weeklyWorkHours()` · `showWeeklyStudyHours()` · `showCurrentCourse()` · `eat()` · `print()`

---

## 🔗 Jerarquía de Herencia
```
IPrintable          IAttendable              IDoctor
    ▲                   ▲                       ▲
    │                   │                       │
Characters  ──────► Patient                  Doctor
(superclase)            △           △            △             △
              ConsultationPatient  AmbulancePatient
                                SpecialistDoctor  StudentDoctor
```

---

## ⚙️ Pilares POO

| Pilar | Aplicación |
|-------|------------|
| **Encapsulamiento** | Todos los atributos son `private`. Acceso exclusivo vía getters y setters |
| **Herencia** | 3 niveles: `Characters` → `Patient`/`Doctor` → clases concretas |
| **Polimorfismo** | `print()` produce resultados distintos en cada clase concreta |
| **Abstracción** | Clases abstractas e interfaces definen contratos sin implementación |

---

## 🏆 Principios SOLID

| Sigla | Principio | Aplicación |
|-------|-----------|------------|
| **S** | Single Responsibility | Cada clase tiene una única responsabilidad |
| **O** | Open / Closed | Abierto a extensión sin modificar lo existente |
| **L** | Liskov Substitution | Las subclases sustituyen a sus clases padre sin romper el sistema |
| **I** | Interface Segregation | Interfaces pequeñas y específicas por responsabilidad |
| **D** | Dependency Inversion | `Main.java` depende de abstracciones, no de implementaciones |

---

## ▶️ Cómo Ejecutar

1. Abrir el proyecto en **IntelliJ IDEA**
2. Verificar JDK configurado **(Java 17 o superior)**
3. Marcar `src` como **Sources Root**
4. Ejecutar `Main.java`
5. La consola mostrará los datos de los **8 objetos instanciados**

---

## 👩‍💻 Autora

**María Perez** · Desarrollo de Software · Marzo 2026