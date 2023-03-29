public class App {
    public static void main(String[] args) throws Exception {
        Estudiante estudiante1 = new Estudiante("Juan", "Hernandez Hernandez", 20, 2023, 4.2f);
        estudiante1.mostrarDatos();

        Docente docente1 = new Docente("Andrés", "Rios Noriega", 38, "Matemáticas", (double) 3640000);
        docente1.mostrarDatos();

        Admistrativo administrativo1 = new Admistrativo("Alfredo", "Contreras", 45, "Tesorería", (double) 20515062);
        administrativo1.mostrarDatos();

        Proovedor proovedor1 = new Proovedor("Camilo", "Reyes", 35, "Agendas", 300);
        proovedor1.mostrarDatos();
    }
}
