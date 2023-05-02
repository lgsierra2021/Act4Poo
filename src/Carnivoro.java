public abstract class Carnivoro extends Animal{

    private String tipoDeCaza;

    public Carnivoro(int codigo, String nombre, float tamanio, int velocidad, String tipoDeCaza) {
        super(codigo, nombre, tamanio, velocidad);
        this.tipoDeCaza = tipoDeCaza;
    }

    public String getTipoDeCaza() {
        return tipoDeCaza;
    }

    public void setTipoDeCaza(String tipoDeCaza) {
        this.tipoDeCaza = tipoDeCaza;
    }

    @Override
    public abstract void alimentarse();

    @Override
    public abstract void correr();

    @Override
    public abstract void mostrarDatos();
    
}
