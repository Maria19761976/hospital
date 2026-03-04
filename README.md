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
- **Polimorfismo** — `imprimir()` distinto en cada clase
- **Abstracción** — clases abstractas e interfaces

---

## 📁 Estructura del Proyecto
```
src/
└── hospital/
    ├── interfaces/
    │   ├── IPrintable.java
    │   ├── IAtendible.java
    │   └── IMedico.java
    ├── modelo/
    │   ├── personajes/
    │   │   └── Characters.java
    │   ├── pacientes/
    │   │   ├── Paciente.java
    │   │   ├── PacienteConsulta.java
    │   │   └── PacienteAmbulancia.java
    │   └── medicos/
    │       ├── Medico.java
    │       ├── MedicoEspecialista.java
    │       └── MedicoEstudiante.java
    └── Main.java
```

---

## 🔌 Interfaces

### `IPrintable`
Contrato de impresión universal para cualquier entidad del sistema.

| Método | Retorno |
|--------|---------|
| `imprimir()` | `void` |

---

### `IAtendible`
Define el flujo completo de atención de un paciente.

| Método | Descripción |
|--------|-------------|
| `admision()` | Registra la entrada del paciente |
| `habitacion()` | Asigna sala o habitación |
| `tratamiento()` | Aplica el tratamiento médico |
| `salida()` | Gestiona el alta del paciente |

---

### `IMedico`
Define el comportamiento laboral básico de cualquier médico.

| Método | Descripción |
|--------|-------------|
| `horasDeTrabajoSemana()` | Muestra las horas trabajadas por semana |
| `comer()` | Representa el descanso para comer |

---

## 👑 Superclase — `Characters`

Clase madre de todo el sistema. Contiene los atributos comunes a cualquier persona.
Implementa `IPrintable`. Es **abstracta** — no se puede instanciar directamente.

| Atributo `private` | Tipo | Getter / Setter |
|--------------------|------|-----------------|
| `nombrePersona` | `String` | ✅ |
| `apellidoPersona` | `String` | ✅ |
| `edadPersona` | `int` | ✅ |
| `dniPersona` | `String` | ✅ |
| `telefonoPersona` | `String` | ✅ |

---

## 🔷 Clases Abstractas

### `Paciente`
> Extiende `Characters` · Implementa `IAtendible`

| Atributo `private` | Tipo | Descripción |
|--------------------|------|-------------|
| `numeroHistorialMedico` | `String` | Número identificador del historial |
| `fechaIngresoPaciente` | `String` | Fecha de ingreso al hospital |
| `seguroMedicoPaciente` | `String` | Compañía de seguro médico |

---

### `Medico`
> Extiende `Characters` · Implementa `IMedico`

| Atributo `private` | Tipo | Descripción |
|--------------------|------|-------------|
| `matriculaMedico` | `String` | Número de matrícula profesional |
| `departamentoMedico` | `String` | Departamento hospitalario asignado |
| `horasSemanaMedico` | `int` | Horas de trabajo semanales |

---

## 🟣 Clases Concretas

### `PacienteConsulta`
> Extiende `Paciente`

Paciente que llega por cita programada. Al alta, agenda una próxima cita.

| Atributo `private` | Tipo | Descripción |
|--------------------|------|-------------|
| `motivoConsultaPaciente` | `String` | Razón principal de la visita |
| `turnoPaciente` | `String` | Turno: mañana o tarde |
| `medicoAsignadoPaciente` | `String` | Médico que le atiende |
| `proximaCitaPaciente` | `String` | Fecha de la próxima revisión |

**Flujo:** `admision()` → `controlEnfermera()` → `habitacion()` → `tratamiento()` → `proximaCita()` → `salida()`

---

### `PacienteAmbulancia`
> Extiende `Paciente`

Paciente de emergencia. Puede requerir operación y rehabilitación posterior.

| Atributo `private` | Tipo | Descripción |
|--------------------|------|-------------|
| `tipoEmergenciaPaciente` | `String` | Tipo de emergencia médica |
| `nivelUrgenciaPaciente` | `int` | Nivel de urgencia (1 = crítico) |
| `cirujanoAsignadoPaciente` | `String` | Cirujano responsable |
| `requiereRehabPaciente` | `boolean` | Necesita rehabilitación posterior |

**Flujo:** `admision()` → `operacion()` → `habitacion()` → `tratamiento()` → `rehabilitacion()` → `salida()`

---

### `MedicoEspecialista`
> Extiende `Medico`

Médico con especialidad definida y experiencia acreditada.

| Atributo `private` | Tipo | Descripción |
|--------------------|------|-------------|
| `especialidadMedico` | `String` | Área de especialización |
| `diasVacacionesMedico` | `int` | Días de vacaciones anuales |
| `aniosExperienciaMedico` | `int` | Años de experiencia |

**Métodos:** `horasDeTrabajoSemana()` · `especialidad()` · `vacaciones()` · `comer()` · `imprimir()`

---

### `MedicoEstudiante`
> Extiende `Medico`

Médico en formación que compagina guardia hospitalaria con estudios universitarios.

| Atributo `private` | Tipo | Descripción |
|--------------------|------|-------------|
| `horasEstudioSemanaMedico` | `int` | Horas de estudio por semana |
| `cursoActualMedico` | `String` | Asignatura que está cursando |
| `universidadMedico` | `String` | Universidad de origen |
| `anioCarreraMedico` | `int` | Año en curso de la carrera |

**Métodos:** `horasDeTrabajoSemana()` · `horasEstudioPorSemana()` · `cursoActual()` · `comer()` · `imprimir()`

---

## 🔗 Jerarquía de Herencia
```
IPrintable          IAtendible              IMedico
    ▲                   ▲                      ▲
    │                   │                      │
Characters  ──────► Paciente              Medico
(superclase)           △        △            △          △
               PacienteConsulta  PacienteAmbulancia
                              MedicoEspecialista  MedicoEstudiante
```

---

## ⚙️ Pilares POO

| Pilar | Aplicación |
|-------|------------|
| **Encapsulamiento** | Todos los atributos son `private`. Acceso exclusivo vía getters y setters |
| **Herencia** | 3 niveles: `Characters` → `Paciente`/`Medico` → clases concretas |
| **Polimorfismo** | `imprimir()` produce resultados distintos en cada clase concreta |
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
```

---

Para usarlo:

1. Abre `README.md` en IntelliJ
2. Selecciona todo con `Ctrl + A`
3. Pega con `Ctrl + V`
4. Guarda con `Ctrl + S`
5. Commit:
```
docs: README completo del proyecto
