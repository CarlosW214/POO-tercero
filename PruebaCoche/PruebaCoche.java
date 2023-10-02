public class PruebaCoche{
    public static void main(String[] args) {
        Coche miCoche = new Coche();

        
        miCoche.setMarca("Toyota");
        miCoche.setModelo("Camry");
        miCoche.setAño(2020);
        miCoche.setColor("Rojo");
        miCoche.setKilometraje(15000.5);

        miCoche.mostrarInformacion();
    }
}