public class PruebaPlanta {
    public static void main(String[] args) {

        System.out.println("Programa que da Propiedades de plantas.");

        Planta Romero = new Planta();
        Planta Oregano = new Planta();
        Planta Lavanda = new Planta();
        
        Romero.setNombre("Romero");
        Oregano.setNombre("Oregano");
        Lavanda.setNombre("Lavanda");
        
        Oregano.setHoja1(Hoja.CORTA);
        Lavanda.setHoja1(Hoja.MORADA);
        Romero.setHoja1(Hoja.VERDE);

        Romero.setN_humedad(45.3f);
        Lavanda.setN_humedad(34.3f);
        Oregano.setN_humedad(43.2f);

        Oregano.setSol_sombra('L');
        Lavanda.setSol_sombra('S');
        Romero.setSol_sombra('S');

        Oregano.setEdad(1);
        Lavanda.setEdad(3);
        Romero.setEdad(4);



        Romero.HumedadRelativa(43, 10f, true);
        Lavanda.HumedadRelativa(31, 10, false);

        Romero.Habitad(32, 1.3f, 1);
        Lavanda.Habitad(34.5f, 1.44f, 1);
        Oregano.Habitad(25, 1, 1);

        Romero.datos();
        

    }
}
