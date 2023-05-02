public class Cebra extends Herbivoro{

    public Cebra(int codigo, String nombre, float tamanio, int velocidad, int edad) {
        super(codigo, nombre, tamanio, velocidad, edad);
        
    }

    @Override
    public void alimentarse() {
        System.out.println("Este animal se alimenta de hierba. ");
       
    }

    @Override
    public void correr() {
        System.out.println("Corre unos " + getVelocidad() + " k/h.");
        
    }

    @Override
    public void mostrarDatos() {
        System.out.println("DATOS DEL ANIMAL");
        System.out.println("Codigo: " + getCodigo());
        System.out.println("Nombre: " + getNombre());
        System.out.println("Tamaño: " + getTamanio() + " metros");
        System.out.println("Velocidad: " + getVelocidad() + "km/h");
        System.out.println("Longevidad: " + getEdad() + " años");
        System.out.println("Fin.");
        System.out.println("----------------------------");
        System.out.println(" ");
        
    }
    

    
}
