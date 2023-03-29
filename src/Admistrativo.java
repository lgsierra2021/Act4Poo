public class Admistrativo extends Persona {
    private String area;
    private Double fondo;

    public Admistrativo(String nombre, String apellidos, int edad, String area, Double fondo) {
        super(nombre, apellidos, edad);
        this.area = area;
        this.fondo = fondo;
    }

    // Metodos
    public void pagarSuedo() {

    }

    public void pagarProducto() {

    }

    public void mostrarDatos() {
        System.out.println("DATOS DEL ADMINISTRADOR");
        System.out.println("Nombre: " + getNombre());
        System.out.println("Apellidos: " + getApellidos());
        System.out.println("Edad: " + getEdad());
        System.out.println("Area: " + area);
        System.out.println("Fondo: " + fondo);
        System.out.println("------------------");
    }


    // Get y Set
    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public Double getFondo() {
        return fondo;
    }

    public void setFondo(Double fondo) {
        this.fondo = fondo;
    }

}
