public class PruebaHerencia {
    public static void main(String[] args) {
        System.out.println("lol");

        Padre objPadre= new Padre();
        
        System.out.println("objeto Padre "+objPadre);
        //Creando un objeto clase hija.

        Hija objHija= new Hija();
        System.out.println("Objeto hija "+objHija);

        //Cambiando dos atributos de la clase Hija.

        objHija.setEnteroCP(45);
        objHija.setTextoCP(": D");
        System.out.println(objHija.getEnteroCP());

        objHija.metodo1CP(4);
        objHija.metodo2CP('g');
        objHija.metodo3CP(4, 'd');
        objHija.metodo4CP("A", 23);
        
        System.out.println(objHija);

        
    }
}
