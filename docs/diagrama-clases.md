classDiagram
Persona <|-- Cliente
Persona <|-- Empleado
Persona <|-- Estudiante
Persona <|-- Docente
Persona <|-- Visitante
Persona <|-- Voluntario
Persona <|-- Proveedor

    %% Tercera generación (Herencia multinivel)
    Empleado <|-- Gerente
    Docente <|-- DocenteInvestigador

    class Persona {
        <<abstract>>
        #String nombre
        #String dui
        +presentarse() String
        +calcularBeneficioAnual()* double
    }
    
    class Empleado {
        -double salario
        +calcularBeneficioAnual() double
    }
    
    class Gerente {
        -int tamanoEquipo
        +calcularBeneficioAnual() double
    }
    
    class Docente {
        -String especialidad
        -int aniosExperiencia
        +calcularBeneficioAnual() double
    }
    
    class DocenteInvestigador {
        -int numeroPublicaciones
        +calcularBeneficioAnual() double
    }