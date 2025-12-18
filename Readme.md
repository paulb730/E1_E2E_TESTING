# Guía de Configuración y Ejecución de Pruebas – E2E 

## 1. Prerrequisitos

Antes de proceder, asegúrate de tener instalados:

- ✅ **Java JDK** 8, 11, 17  (Se ejecutó en JDK 17)
    - Verificar con:
      ```bash
      java -version
      javac -version
      ```
- ✅ **Apache Maven** 3.9.1 o superior
    - Verificar con:
      ```bash
      mvn -v
      ```
- ✅ **Git** (Para publicación del proyecto)
  ```bash
  git --version

- ✅ **IntellijIDEA 2025.2.6** (IDE Utilizado)


## 2. Comandos de Instalación 

### 2.1. Clonar el proyecto 
- Desde Powershell o GitBash:
  ```bash
  git clone https://github.com/paulb730/E1_E2E_TESTING.git
  cd E1_E2E_TESTING
  ```
### 2.2. Instalar Dependencias
- Desde Una Terminal en IntellijIDEA:
  ```bash
    mvn clean install -DskipTests
  ```  
### 2.3. Validacion Instalacion
#### Verifica que el proyecto se compila (sin ejecutar tests)
- Desde Una Terminal en IntellijIDEA:
  ```bash
    mvn compile
  ```  
#### Verifica que las dependencias se resuelven correctamente
- Desde Una Terminal en IntellijIDEA:
  ```bash
    mvn dependency:resolve
  ```  
#### Muestra la estructura del proyecto (útil para verificar fuentes y recursos)
  ```bash
    mvn help:effective-pom
  ```
## 3. Instrucciones para Ejecutar Pruebas 
El proyecto utiliza JUnit 5 (por defecto en Maven con maven-surefire-plugin). Si usa TestNG u otro framework, 
se indicará en el pom.xml]
- Ejecuta todas las pruebas:
  ```bash
    mvn clean verify
  ```
## 4. Reportes
### 4.1. Reporte de Ejecución de Pruebas (Cucumber)

- Ejecucion con reportes:
  ```bash
    
  ```
## 5.  Información Adicional
### Estructura del Proyecto Arquitectura Screenplay

  ```
  E2E_Testing/
├── pom.xml
├── Readme.md
├── Conclusiones.
└── target
└── src
    ├── main
    │   └── java
    │       └── com.nttdata.challenge
    │           └── 
    │               ├── interactions     (Clases de Interactions del patrón Screenplay)
    │               ├── questions        (Clases de Questions del patrón Screenplay)
    │               ├── tasks            (Clases de Tasks del patrón Screenplay)
    │               	├── CartShopTask 
    │               	├── LoginTask    
    │               	├── OpenURLTask 
    │               	├── PagoTask
    │               	├── ProductoTask                                       
    │               └── ui               (Mapeo de elementos de la UI)
    │               	└── listproductInterface        
    │               	└── loginInterface    
    │               	└── payInterface    
    │               	└── shopcartInterface                     
    └── test
        ├── java
        │   └── com.nttdata.challenge
        │       └── 
        │           ├── runners
        │           │   └── RunnerTest.java            (Clase Runner para ejecutar Cucumber + Serenity)
        │           └── stepDefinitions                        
        │               ├── Hooks.java (Steps Globales)
        │               └── CommonSteps.java (Steps Comunes)
        │               └── compraProductoSD.java (Steps Scenario 3)
        │               └── pagoProductoSD.java (Steps Scenario 4)
        │               └── seleccionProductoSD.java (Steps Scenario 2)
        │               └── ingresoProductoSD.java (Steps Scenario 1)
        └── resources
            ├── features                       
            │   └── ingresosesion.feature                   (Archivos .feature con escenarios de prueba)
            │   └── compraProducto.feature   
            │   └── pagoProducto.feature   
            │   └── seleccionProducto.feature   
            └── serenity.conf                      (Archivo de configuración de Serenity)
  
    
  ```








