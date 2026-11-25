public class Main {
    public static void main(String[] args) {
        Sprint sprint = new Sprint("Sprint 1 - Módulo Usuarios");

        // 1. Crear 5 tareas internamente
        sprint.crearTarea("T01", "Diseñar pantalla de login", 4.0);
        sprint.crearTarea("T02", "Crear base de datos", 6.5);
        sprint.crearTarea("T03", "Programar validación de clave", 3.0);
        sprint.crearTarea("T04", "Conectar API de registro", 5.0);
        sprint.crearTarea("T05", "Pruebas unitarias", 2.5);

        System.out.println("--- LISTA INICIAL ---");
        System.out.println(sprint.mostrarTareas());

        // 2. Completar tareas
        sprint.completarTarea("T01");
        sprint.completarTarea("T03");

        // 3. Buscar tarea
        System.out.println("--- BUSCAR TAREA T02 ---");
        Tarea buscada = sprint.buscarTarea("T02");
        if (buscada != null) {
            System.out.println("Encontrada: " + buscada.mostrarInformacion() + "\n");
        }

        // 4 y 5. Conteo y horas pendientes
        System.out.println("--- RESUMEN ---");
        System.out.println(sprint.mostrarTareas());
        System.out.println("Tareas completadas: " + sprint.contarCompletadas());
        System.out.println("Horas pendientes: " + sprint.calcularHorasPendientes() + " hrs");
    }
}