# Programación Orientada a Objetos: Gestión de Veleros (Java)

> **Nota:** Este proyecto utiliza una librería externa (`libtarea3.jar`) que contiene la clase `Velero`. Para compilar y ejecutar el proyecto, asegúrate de añadir esta librería al *classpath* de tu IDE (NetBeans).

Proyecto de programación en Java que aplica los principios de la **Programación Orientada a Objetos (POO)** para la gestión de una flota de veleros. El proyecto simula la creación de barcos, la navegación, la competición en regatas y el control de su estado.

## 🛠️ Tecnologías y Herramientas
*   **Lenguaje:** Java (JDK 17)
*   **IDE:** Apache NetBeans
*   **Conceptos:** POO, Clases, Objetos, Métodos, Excepciones, Formateo de salida.

## 🎯 Funcionalidades y Conceptos Aplicados

1.  **Creación de Objetos:**
    *   Uso de **constructores** (por defecto y con parámetros) para instanciar objetos de la clase `Velero`.
    *   Manejo de **excepciones** (`NullPointerException` e `IllegalArgumentException`) al intentar crear objetos con datos inválidos (nombre nulo o mástiles negativos).

2.  **Métodos de Instancia:**
    *   Llamadas a métodos para modificar el estado de los objetos: `iniciarNavegacion()`, `pararNavegacion()`, `setRumbo()`.
    *   Consulta de datos mediante métodos *getter*: `getNombreBarco()`, `getNumMastiles()`, `getPatron()`, `getVelocidad()`, `getTiempoTotalNavegacion()`.
    *   Uso de `toString()` para mostrar la información completa de cada velero.

3.  **Métodos Estáticos:**
    *   Uso de métodos de clase para consultar datos globales: `getNumBarcos()`, `getNumBarcosNavegando()`, `getTiempoTotalNavegacion()`.

4.  **Formateo de Salida:**
    *   Uso de `System.out.printf()` para dar formato a la salida por consola.
    *   Uso del operador ternario (`? :`) para mostrar "Sí" o "No".

## 🚀 Cómo ejecutar el proyecto
1. Abre el proyecto en Apache NetBeans.
2. Ejecuta la clase `Controlador.java` como aplicación Java.
3. Observa la salida por consola con la información de los veleros y los resultados de las operaciones.
