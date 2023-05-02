public abstract class Frutal extends Arbol {
    private String tipo;

    public Frutal(int codigo, String nombre, String color, String tipo) {
        super(codigo, nombre, color);
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public abstract void mostrarDatos();

    @Override
    public abstract void alimentarse();

    public abstract void darFruto();
}
