public abstract class Arbol extends SerVivo{

    private String color;

    public Arbol(int codigo, String nombre, String color) {
        super(codigo, nombre);
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public abstract void mostrarDatos();

    @Override
    public abstract void alimentarse();

}