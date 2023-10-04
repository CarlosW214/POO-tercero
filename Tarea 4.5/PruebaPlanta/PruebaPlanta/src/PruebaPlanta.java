public class PruebaPlanta {
    public static void main(String[] args) {

        System.out.println("Programa que da Propiedades de plantas.");

        Planta Romero = new Planta();
        Planta Oregano = new Planta();
        Planta Lavanda = new Planta();
        
        Romero.setNombre("Romero");
        Oregano.setNombre("Oregano");
        Lavanda.setNombre("Lavanda");


        Romero.HumedadRelativa(43, 10f, true);
        Lavanda.HumedadRelativa(31, 10, false);
    }
}
