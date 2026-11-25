import java.util.ArrayList;

public class Sprint {
    private String nombre;
    private ArrayList<Tarea> tareas;

    public Sprint(String nombre) {
        this.nombre = nombre;
        this.tareas = new ArrayList<>();
    }

    public void crearTarea(String codigo, String titulo, double horas) {
        Tarea nuevaTarea = new Tarea(codigo, titulo, horas);
        tareas.add(nuevaTarea);
    }

    public Tarea buscarTarea(String codigo) {
        for (Tarea t : tareas) {
            if (t.getCodigo().equals(codigo)) {
                return t;
            }
        }
        return null;
    }

    public boolean completarTarea(String codigo) {
        Tarea encontrada = buscarTarea(codigo);
        if (encontrada != null) {
            encontrada.setCompletada(true);
            return true;
        }
        return false;
    }

    public int contarCompletadas() {
        int contador = 0;
        for (Tarea t : tareas) {
            if (t.isCompletada()) {
                contador++;
            }
        }
        return contador;
    }

    public double calcularHorasPendientes() {
        double totalPendientes = 0;
        for (Tarea t : tareas) {
            if (!t.isCompletada()) {
                totalPendientes += t.getHoras();
            }
        }
        return totalPendientes;
    }

    public String mostrarTareas() {
        String resultado = "=== Tareas del " + nombre + " ===\n";
        if (tareas.isEmpty()) {
            resultado += "No hay tareas registradas.\n";
        } else {
            for (Tarea t : tareas) {
                resultado += "- " + t.mostrarInformacion() + "\n";
            }
        }
        return resultado;
    }
}