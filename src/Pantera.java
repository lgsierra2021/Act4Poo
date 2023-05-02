public class Pantera extends Carnivoro {
    

    

    public Pantera(int codigo, String nombre, float tamanio, int velocidad, String tipoDeCaza) {
        super(codigo, nombre, tamanio, velocidad, tipoDeCaza);
    }

    @Override
    public void mostrarDatos(){
        System.out.println("DATOS DEL ANIMAL");
        System.out.println("Codigo: " + getCodigo());
        System.out.println("Nombre: " + getNombre());
        System.out.println("Tamaño: " + getTamanio() + " metros");
        System.out.println("Velocidad: " + getVelocidad() + " km/h");
        System.out.println("Caza con: " + getTipoDeCaza());
        System.out.println("Fin.");
        System.out.println("----------------------------");
        System.out.println(" ");
        
    }

    @Override
    public void alimentarse() {
        System.out.println("Este animal se alimenta de carne. ");
       
    }

    @Override
    public void correr() {
        System.out.println("Corre unos " + getVelocidad() + " km/h");
        
    }
    
}
