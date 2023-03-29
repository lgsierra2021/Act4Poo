public class Estudiante extends Persona {
    private int id;
    private float notaFinal;

    // Metodo contructor
    public Estudiante(String nombre, String apellidos, int edad, int id, float notaFinal) {
        super(nombre, apellidos, edad);
        this.id = id;
        this.notaFinal = notaFinal;
    }

    // Metodos
    public void mostrarDatos() {
        System.out.println("DATOS DEL ESTUDIANTE");
        System.out.println("Nombre: " + getNombre());
        System.out.println("Apellidos: " + getApellidos());
        System.out.println("Edad: " + getEdad());
        System.out.println("Id estudiante: " + id);
        System.out.println("Nota final: " + notaFinal);
        System.out.println("------------------");
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public float getNotaFinal() {
        return notaFinal;
    }

    public void setNotaFinal(float notaFinal) {
        this.notaFinal = notaFinal;
    }

}
