# 🏥 Hospital Java

> Hospital Management System developed in Java applying the 4 pillars of OOP and SOLID principles.

![Java](https://img.shields.io/badge/Java-17-orange)
![OOP](https://img.shields.io/badge/OOP-4%20pillars-blue)
![SOLID](https://img.shields.io/badge/SOLID-5%20principles-green)

---

## 📋 Description

This project simulates the operation of a hospital with patients and doctors.
It models the complete hospital care cycle applying:

- **Encapsulation** — `private` attributes with getters and setters
- **Inheritance** — 3-level hierarchy
- **Polymorphism** — `print()` produces different output in each class
- **Abstraction** — abstract classes and interfaces

---

## 📁 Project Structure
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
Universal print contract for any entity in the system.

| Method | Return |
|--------|--------|
| `print()` | `void` |

---

### `IAttendable`
Defines the complete patient care workflow.

| Method | Description |
|--------|-------------|
| `admission()` | Registers patient entry |
| `ward()` | Assigns room or ward |
| `treatment()` | Applies medical treatment |
| `discharge()` | Manages patient discharge |

---

### `IDoctor`
Defines the basic work behaviour of any doctor.

| Method | Description |
|--------|-------------|
| `weeklyWorkHours()` | Displays weekly hours worked |
| `eat()` | Represents meal break |

---

## 👑 Superclass — `Characters`

Root class of the entire system. Contains attributes common to any person.
Implements `IPrintable`. It is **abstract** — cannot be instantiated directly.

| `private` Attribute | Type | Getter / Setter |
|---------------------|------|-----------------|
| `firstName` | `String` | ✅ |
| `lastName` | `String` | ✅ |
| `age` | `int` | ✅ |
| `dni` | `String` | ✅ |
| `phone` | `String` | ✅ |

---

## 🔷 Abstract Classes

### `Patient`
> Extends `Characters` · Implements `IAttendable`

| `private` Attribute | Type | Description |
|---------------------|------|-------------|
| `medicalRecordNumber` | `String` | Medical record identifier |
| `admissionDate` | `String` | Hospital admission date |
| `medicalInsurance` | `String` | Medical insurance company |

---

### `Doctor`
> Extends `Characters` · Implements `IDoctor`

| `private` Attribute | Type | Description |
|---------------------|------|-------------|
| `licenseNumber` | `String` | Professional license number |
| `department` | `String` | Assigned hospital department |
| `weeklyHours` | `int` | Weekly working hours |

---

## 🟣 Concrete Classes

### `ConsultationPatient`
> Extends `Patient`

Patient arriving for a scheduled appointment. On discharge, books a follow-up appointment.

| `private` Attribute | Type | Description |
|---------------------|------|-------------|
| `consultationReason` | `String` | Main reason for the visit |
| `shift` | `String` | Shift: morning or afternoon |
| `assignedDoctor` | `String` | Attending doctor |
| `nextAppointment` | `String` | Next review date |

**Flow:** `admission()` → `nurseCheck()` → `ward()` → `treatment()` → `showNextAppointment()` → `discharge()`

---

### `AmbulancePatient`
> Extends `Patient`

Emergency patient. May require surgery and subsequent rehabilitation.

| `private` Attribute | Type | Description |
|---------------------|------|-------------|
| `emergencyType` | `String` | Type of medical emergency |
| `urgencyLevel` | `int` | Urgency level (1 = critical) |
| `assignedSurgeon` | `String` | Responsible surgeon |
| `requiresRehabilitation` | `boolean` | Needs follow-up rehabilitation |

**Flow:** `admission()` → `operation()` → `ward()` → `treatment()` → `rehabilitation()` → `discharge()`

---

### `SpecialistDoctor`
> Extends `Doctor`

Doctor with a defined specialty and accredited experience.

| `private` Attribute | Type | Description |
|---------------------|------|-------------|
| `specialty` | `String` | Area of specialisation |
| `vacationDays` | `int` | Annual vacation days |
| `yearsOfExperience` | `int` | Years of experience |

**Methods:** `weeklyWorkHours()` · `showSpecialty()` · `vacation()` · `eat()` · `print()`

---

### `StudentDoctor`
> Extends `Doctor`

Doctor in training balancing hospital shifts with university studies.

| `private` Attribute | Type | Description |
|---------------------|------|-------------|
| `weeklyStudyHours` | `int` | Study hours per week |
| `currentCourse` | `String` | Subject currently enrolled in |
| `university` | `String` | University of origin |
| `careerYear` | `int` | Current year of degree |

**Methods:** `weeklyWorkHours()` · `showWeeklyStudyHours()` · `showCurrentCourse()` · `eat()` · `print()`

---

## 🔗 Inheritance Hierarchy
```
IPrintable          IAttendable              IDoctor
    ▲                   ▲                       ▲
    │                   │                       │
Characters  ──────► Patient                  Doctor
(superclass)            △           △            △             △
              ConsultationPatient  AmbulancePatient
                                SpecialistDoctor  StudentDoctor
```

---

## ⚙️ OOP Pillars

| Pillar | Application |
|--------|-------------|
| **Encapsulation** | All attributes are `private`. Access exclusively via getters and setters |
| **Inheritance** | 3 levels: `Characters` → `Patient`/`Doctor` → concrete classes |
| **Polymorphism** | `print()` produces different output in each concrete class |
| **Abstraction** | Abstract classes and interfaces define contracts without implementation |

---

## 🏆 SOLID Principles

| Letter | Principle | Application |
|--------|-----------|-------------|
| **S** | Single Responsibility | Each class has a single responsibility |
| **O** | Open / Closed | Open for extension without modifying existing code |
| **L** | Liskov Substitution | Subclasses substitute their parent classes without breaking the system |
| **I** | Interface Segregation | Small, specific interfaces per responsibility |
| **D** | Dependency Inversion | `Main.java` depends on abstractions, not on implementations |

---

## ▶️ How to Run

1. Open the project in **IntelliJ IDEA**
2. Verify the JDK is configured **(Java 17 or higher)**
3. Mark `src` as **Sources Root**
4. Run `Main.java`
5. The console will display the data of the **8 instantiated objects**

---

## 👩‍💻 Author

**María Perez** · Software Development · March 2026
