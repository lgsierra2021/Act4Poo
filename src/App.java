public class App {
    public static void main(String[] args) throws Exception {
        
        Pantera pantera1 = new Pantera(111, "Pantera Negra", 0.8f, 90, "Garras y colmillos");

        
        pantera1.alimentarse();
        pantera1.correr();
        pantera1.mostrarDatos();

        Cebra cebra1 = new Cebra(112, "Cebra", 2.4f, 65, 20);
        
        cebra1.alimentarse();
        cebra1.correr();
        cebra1.mostrarDatos();


        Mango mango1 = new Mango(114, "Mango","Amarillo", "de piña");
        
        mango1.alimentarse();
        mango1.darFruto();
        mango1.mostrarDatos();

        Caoba caoba1 = new Caoba(115, "Caoba", "Rojo púrpura");

        caoba1.alimentarse();
        caoba1.darMadera();
        caoba1.mostrarDatos();

    }
}
