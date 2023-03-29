public class Docente extends Persona {
    // Atributos
    private String area;
    private Double sueldo;

    // Constructor
    public Docente(String nombre, String apellidos, int edad, String area, Double sueldo) {
        super(nombre, apellidos, edad);
        this.area = area;
        this.sueldo = sueldo;
    }

    // Metodos
    public void mostrarDatos() {
        System.out.println("DATOS DEL DOCENTE");
        System.out.println("Nombre: " + getNombre());
        System.out.println("Apellidos: " + getApellidos());
        System.out.println("Edad: " + getEdad());
        System.out.println("Area: " + area);
        System.out.println("Sueldo: " + sueldo);
        System.out.println("------------------");
        System.out.println("Fin.");
    }

    public void cobrarSueldo() {

    }

    public void calificarEstudiante() {

    }

    // Get y set
    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public Double getSueldo() {
        return sueldo;
    }

    public void setSueldo(Double sueldo) {
        this.sueldo = sueldo;
    }

}
