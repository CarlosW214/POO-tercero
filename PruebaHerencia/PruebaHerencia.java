public class PruebaHerencia {
    //reutilizacion
    //la clase hija va a tener metodos que va a especializar
    //

    public static void main(String[] args) {
        Padre objPadre = new Padre();
        System.out.println("Objeto Padre: "+objPadre);
        
        //Creando un objeto clase Hija
        //Hija objHija = new Hija(); no se puede instanciar un objeto hija porque la clase es abstracta
        Hija objHija;
        objHija=new Nieta2();
        System.out.println("Objeto Hija: "+objHija);
        
        //cambiando dos atributos en el objeto de la clase hija
        objHija.setEnteroCP(25);
        objHija.setTextoCP("Hola objeto Hija");
        
        //probando que la Hija heredo los metodos   
        System.out.println(objHija.metodo1CP(4));
        System.out.println(objHija.metodo2CP('o',5));
        
        //probando que el metodo2CP en la lcase hija se ha especializado
        System.out.println("Probando el metodo2CP del objeto padre: "+objPadre.metodo2CP('p', 5));
        System.out.println("Probando el metodo2CP del objeto hija"+objHija.metodo2CP('b', 4));
        
        //probando que la clase hija ahora tiene metodo3CP()
        System.out.println("metodo3CP() version del padre: "+objHija.metodo3CP(8, "opei"));
        System.out.println("metodo3CP() version de la hija: "+objHija.metodo3CP("opei",7));
        
        System.out.println("Ejecutando el metodo5CH"+objHija.metodo5CH("Jijo mano"));
        
    }
}
