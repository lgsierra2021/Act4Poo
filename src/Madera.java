public abstract class Madera extends Arbol{


    public Madera(int codigo, String nombre, String color) {
        super(codigo, nombre, color);
    }

    @Override
    public abstract void alimentarse();

    @Override
    public abstract void mostrarDatos();

    public abstract void darMadera();
    

}