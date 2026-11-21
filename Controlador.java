package tarea03;

import libtarea3.Velero;

// ------------------------------------------------------------
//                   Clase Controlador
// ------------------------------------------------------------
/**
 * <p>
 * Clase que representa al <strong>controlador</strong>,
 * que será la clase que utilizaremos y donde se escribirán las diferentes 
 * operaciones en veleros que se nos pide en el enunciado de la tarea.
 * </p>
 * @author Zafra Vallejo Ana
 */
public class Controlador {

    public static void main(String[] args) {

        //----------------------------------------------
        //          Declaración de variables 
        //----------------------------------------------

        /*Variables de entrada.
        Declaración cuatro variables referencia a objetos instancia de la clase Velero.*/

        Velero velero1;
        Velero velero2;
        Velero velero3;
        Velero veleroIncorrecto;
        
        //----------------------------------------------
        //          Creación de objetos
        //----------------------------------------------
        
        System.out.println("-------------------------");
        System.out.println("--- Creando Veleros -----");
        System.out.println("-------------------------\n");
        
        System.out.println("Creando veleros con datos correctos...");
        
        // Instanciar los tres veleros correctos: velero1, velero2 y velero3
        velero1 = new Velero (); // Velero1 creado con el constructor por defecto.
        velero2 = new Velero ("Poseidón", 3, 6); // velero2 creado con los parámetros nombre Poseidón, número de mástiles 3 y número de tripulantes 6.
        velero3 = new Velero ("Atlántico", 3, 5); // velero3 creado con los parámetros nombre Atlántico, número de mástiles 3 y número de tripulantes 5.
        
        System.out.println("**Veleros creados correctamente**\n");
        
        // Intentar instanciar el cuarto velero (incorrecto): veleroIncorrecto, dos veces, capturando los diferentes errores.
        System.out.println("Creando veleros con datos incorrectos/nulos...");        

        // Primero: El nombre se establecerá como nulo (null).        
        try {
            veleroIncorrecto = new Velero(null, 2, 4);
        } catch (NullPointerException e) {
            System.out.println("Error al crear el velero: El nombre del velero no puede ser nulo.");
        }
        
        // El número de mástiles se establecerá a un valor incorrecto: número negativo -5.
        try {
            veleroIncorrecto = new Velero("VeleroIncorrecto", -5, 4);
        } catch (IllegalArgumentException e) {
            System.out.println("Error al crear el velero: El número de mástiles debe estar entre 1 y 4.\n");
        }
        
        //----------------------------------------------
        //   Inicio de la secuencia de instrucciones
        //----------------------------------------------
        /*Llevar a cabo una secuencia de instrucciones haciendo uso de los distintos métodos de la clase Velero, 
        de manera que muestre en pantalla la información utilizando la herramienta de E/S System.out.printf*/
        
        System.out.println("--------------------------------");
        System.out.println("-- Secuencia de instrucciones --");
        System.out.println("--------------------------------\n");
        
        // velero1 inicia su navegación con velocidad 10, rumbo ceñida, patrón Carlos Ruiz y tripulación 0.
        velero1.iniciarNavegacion(10, "ceñida", "Carlos Ruiz", 0);
        System.out.println("El velero1 ha iniciado su navegación.");
        
        // velero2 inicia su navegación con velocidad 15, rumbo empopada, patrón Laura Gómez y tripulación 4.
        velero2.iniciarNavegacion(15, "empopada", "Laura Gómez", 4);
        System.out.println("El velero2 ha iniciado su navegación.");
        
        // velero3 inicia su navegación con velocidad 12, rumbo empopada, patrón Pedro Torres y tripulación 2.
        velero3.iniciarNavegacion(12, "empopada", "Pedro Torres", 2);
        System.out.println("El velero3 ha iniciado su navegación.\n");
        
        // Comprobar si el velero1 está navegando.       
        System.out.printf("¿El velero1 está navegando?: %s", velero1.isNavegando() ? "Sí" : "No");
        
        // Mostrar el nombre y el número de mástiles de velero2.
        System.out.printf("\n\nEl nombre del velero2 es: %s", velero2.getNombreBarco());
        System.out.printf("\nEl número de mástiles del velero2 es: %d", velero2.getNumMastiles());
 

        // Mostrar el patrón y la velocidad de navegación de velero3.
        System.out.printf("\n\nEl patrón del velero3 es: %s ", velero3.getPatron());
        System.out.printf("\nLa velocidad del velero3 es: %d nudos", velero3.getVelocidad());

        // Modificar el rumbo de velero1 a empopada y mostrarlo.
        velero1.setRumbo("empopada");
        System.out.printf("\n\nEl nuevo rumbo del velero1 es: %s", velero1.getRumbo());

        // Parar la navegación de velero1 después de 120 minutos.
        velero1.pararNavegacion(120);
        System.out.println("\n\nEl velero1 ha parado su navegación.");

        // Mostrar el tiempo total de navegación de velero1.
        System.out.printf("Tiempo total de navegación del velero1: %d minutos", (int)velero1.getTiempoTotalNavegacion());

        // Iniciar una regata entre velero2 y velero3.
        System.out.println("\n\nIniciando regata...");
        System.out.printf("%s", velero2.iniciarRegata(velero3));
        
        // Parar la navegación de velero2 después de 90 minutos.
        velero2.pararNavegacion(90);
        System.out.println("\nEl velero2 ha parado su navegación.");
        
        // Parar la navegación de velero3 después de 150 minutos.
        velero3.pararNavegacion(150);
        System.out.println("El velero3 ha parado su navegación.");

        //----------------------------------------------
        //   Mostrar información de cada velero
        //----------------------------------------------
        
        System.out.println("\n------------------------------");
        System.out.println("--- Información de veleros ---");
        System.out.println("------------------------------\n");
        
        //Mostrar toda la información de velero1 haciendo uso del método toString().
        System.out.printf("Velero1: %s", velero1.toString());
        
        //Mostrar toda la información de velero2 haciendo uso del método toString().
        System.out.printf("\nVelero2: %s", velero2.toString());
        
        //Mostrar toda la información de velero3 haciendo uso del método toString().
        System.out.printf("\nVelero3: %s",  velero3.toString());

        //----------------------------------------------
        //          Llamadas a métodos estáticos
        //----------------------------------------------
        /*Consulta final de valores globales de la clase Velero. Una vez 
        finalizado el paso anterior, pasaremos a mostrar los valores  globales 
        haciendo uso de los métodos estáticos de la clase*/
        
        System.out.println("\n\n-------------------------");
        System.out.println("--- Métodos estáticos ---");
        System.out.println("-------------------------\n");
        
        // Mostrar el número total de veleros creados.
        System.out.printf("Número total de veleros: %d", Velero.getNumBarcos());
        
        // Mostrar el número total de veleros navegando en este momento.
        System.out.printf("\nNúmero de veleros navegando: %d", Velero.getNumBarcosNavegando());
        
        // Mostrar el tiempo total de navegación de todos los veleros (en horas).
        System.out.printf("\nTiempo total de navegación de todos los veleros: %.2f horas\n", Velero.getTiempoTotalNavegacion() / 60.0);
    }
}
