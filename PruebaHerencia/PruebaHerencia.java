public class PruebaHerencia {

    public static void main(String[] args) {
    
        Padre objPadre=new Padre();
        System.out.println("OBJETO PADRE"+objPadre);
        
        //Creando un objeto clase hija
        
        //Hija objHija=new Hija();

        Hija objHija; //no se puede instanciar Hija, pero se pueden crear variables de tipo Hija porque es abstracta
        objHija= new Nieta2();
        System.out.println("OBJETO HIJA:"+objHija);

        //Cambiando dos atributos en el objeto de la clase Hija.

        objHija.setEnteroCP(25);
        objHija.setTextoCP("Hola objeto Hija");
        System.out.println("Objeto Hija: "+objHija);

        //Probando que la Hija heredó los métodos de la clase Padre

        System.out.println(objHija.metodo1CP(4));
        System.out.println(objHija.metodo2CP('b', 1));
        System.out.println(objHija.metodo3CP("Este es un texto ", 4));
        System.out.println(objHija.metodo4CP(8));

        //Probando que el metodo2Cp en la clase hija se ha especializado

        System.out.println("Probando el metodo2CP del objeto padre: "+objPadre.metodo2CP('b', 5));
        System.out.println("Probando el metodo2CP del objeto hija: "+objHija.metodo2CP('b', 5));

        //pROBANDO QUE LA CLASE HIJA AHORA TIENE 2 metodo3CP()
        
        System.out.println("metodo3CP(),Version del padre: "+objHija.metodo3CP('p', "valor"));
        System.out.println("metodo3CP(),Version de la hija: "+objHija.metodo3CP("valor2", 'm'));
    }
    
}
