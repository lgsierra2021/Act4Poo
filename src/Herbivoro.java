public abstract class Herbivoro extends Animal {
    private int edad;

    public Herbivoro(int codigo, String nombre, float tamanio, int velocidad, int edad) {
        super(codigo, nombre, tamanio, velocidad);
        this.edad = edad;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public abstract void alimentarse();

    @Override
    public abstract void correr();

    @Override
    public abstract void mostrarDatos();
    
    
}
