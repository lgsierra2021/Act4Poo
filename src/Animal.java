public abstract class Animal extends SerVivo{
    private float tamanio;
    private int velocidad;

    

    public Animal(int codigo, String nombre, float tamanio, int velocidad) {
        super(codigo, nombre);
        this.tamanio = tamanio;
        this.velocidad = velocidad;
    }

    public float getTamanio() {
        return tamanio;
    }

    public void setTamanio(float tamanio) {
        this.tamanio = tamanio;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    @Override
    public abstract void mostrarDatos();
    
    @Override
    public abstract void alimentarse();

    public abstract void correr();

}
