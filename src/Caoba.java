public class Caoba extends Madera {

    public Caoba(int codigo, String nombre, String color) {
        super(codigo, nombre, color);
    }


    @Override
    public void alimentarse() {
        System.out.println("Los arboles se alimentan de la luz solar y el agua (fotosíntesis)"); 
        
    }

    @Override
    public void darMadera(){
        System.out.println("Este arbol da madera de buena calidad de color " + getColor());
    }


    @Override
    public void mostrarDatos() {

        System.out.println("DATOS DEL ARBOL");
        System.out.println("Codigo: " + getCodigo());
        System.out.println("Nombre: " + getNombre());
        System.out.println("Color: " + getColor());
        System.out.println("Fin.");
        System.out.println("----------------------------");
        System.out.println(" ");
        
    }

        
    
    
}