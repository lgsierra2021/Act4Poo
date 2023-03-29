public class Proovedor extends Persona {
    // Atributos
    private String producto;
    private int totalProductos;

    // Constructor
    public Proovedor(String nombre, String apellidos, int edad, String producto, int totalProductos) {
        super(nombre, apellidos, edad);
        this.producto = producto;
        this.totalProductos = totalProductos;
    }

    // Metodos
    public void mostrarDatos() {
        System.out.println("DATOS DEL ADMINISTRADOR");
        System.out.println("Nombre: " + getNombre());
        System.out.println("Apellidos: " + getApellidos());
        System.out.println("Edad: " + getEdad());
        System.out.println("Area: " + producto);
        System.out.println("Fondo: " + totalProductos);
        System.out.println("------------------");
    }

    public void enviarProducto(){

    }

    public String getProducto() {
        return producto;
    }

    public void setProducto(String producto) {
        this.producto = producto;
    }

    public int getTotalProductos() {
        return totalProductos;
    }

    public void setTotalProductos(int totalProductos) {
        this.totalProductos = totalProductos;
    }

}
