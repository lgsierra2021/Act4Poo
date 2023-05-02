public class Mango extends Frutal{

    public Mango(int codigo, String nombre, String color, String tipo) {
        super(codigo, nombre, color, tipo);
        
    }

    @Override
    public void mostrarDatos() {
        System.out.println("DATOS DEL ARBOL");
        System.out.println("Codigo: " + getCodigo());
        System.out.println("Nombre: " + getNombre());
        System.out.println("Color: " + getColor());
        System.out.println("Tipo: " + getNombre() + " " + getTipo());
        System.out.println("Fin.");
        System.out.println("----------------------------");
        System.out.println(" ");
    }

    @Override
    public void alimentarse() {
        System.out.println("Los arboles se alimentan de la luz solar y el agua (fotosíntesis)");
        
    }

    @Override
    public void darFruto() {
       System.out.println("Este arbol da " + getNombre() + " " + getTipo());
    }
    

    
}
