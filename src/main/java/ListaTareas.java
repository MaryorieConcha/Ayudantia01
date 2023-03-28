import java.util.ArrayList;
import java.util.Scanner;

public class ListaTareas {
    private ArrayList<String> tareas;

    Scanner sc = new Scanner(System.in);

    public ListaTareas(ArrayList<String> tareas) {
        this.tareas = tareas;
    }

    public ArrayList<String> getTareas() {
        return tareas;
    }

    public void setTareas(ArrayList<String> tareas) {
        this.tareas = tareas;
    }

    public ArrayList<String> agregarTareas(){
        String tarea = sc.next();
        this.tareas.add(tarea);
        return this.tareas;
    }

    public ArrayList<String> eliminarTareas(){
        String tarea = sc.next();
        this.tareas.remove(tarea);
        return this.tareas;
    }

    public void mostrarTareas(){
        for (int i = 0; i < this.tareas.size(); i++) {
            System.out.println(i + ".- " + this.tareas.get(i));
            System.out.println();
        }
    }


}
