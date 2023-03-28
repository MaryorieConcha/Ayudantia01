import java.util.ArrayList;
import java.util.Scanner;

public class Ventana {

    public void menu(){
        Scanner leer = new Scanner(System.in);
        int opcionUsuario;

        do {
            mostrarMenu ();

            ArrayList<String> tareas = new ArrayList<>();

            ListaTareas listaTareas = new ListaTareas(tareas);

            opcionUsuario = leer.nextInt();

            switch (opcionUsuario) {
                case 1 -> listaTareas.agregarTareas();
                case 2 -> listaTareas.eliminarTareas();
                case 3 -> listaTareas.mostrarTareas();
                case 4 -> salir();
                default -> System.out.println("Opcion invalida. Intentelo de nuevo.");
            }
        } while (opcionUsuario > 0 && opcionUsuario < 5);

    }

    public static void mostrarMenu(){
        System.out.println("Bienvenido, el programa se está iniciando.");
        System.out.println("Seleccione:");
        System.out.println("1- Agregar Tarea.");
        System.out.println("2- Eliminar Tarea.");
        System.out.println("3- Mostrar Tareas.");
        System.out.println("4- Salir.");
    }

    public static void menuDeSalida(){
        System.out.println("¿Desea salir?");
        System.out.println("1- Sí.");
        System.out.println("2- No.");
    }

    public static void salir(){
        Scanner leer = new Scanner(System.in);

        menuDeSalida();

        int opcionDelUsuario = leer.nextInt();

        switch (opcionDelUsuario) {
            case 1:
                System.out.println("El programa ha finalizado, hasta lluego.");
                System.exit(0);
            case 2:
                break;
            default:
                System.out.println("Opción inválida.");
                break;
        }
    }
}