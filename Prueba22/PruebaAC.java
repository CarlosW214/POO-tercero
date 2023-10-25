public class PruebaAC{
    public static void main(String[] args) {
        
      ComponenteA objCA=new ComponenteA();
      Componente_B objCB=new Componente_B();
      Contenedor objC=new Contenedor();


        //System.out.println(objC);
        System.out.println(objCA);
        System.out.println(objCB);

        //Guardando un 50 en el enteroC del objeto Contenedor (objC).
        objC.setEnteroC(50);
        //Verificando que se guardo el 50 en el atributo enteroC.
        
        System.out.println(objC);

        //Ejecutando el metodo1C por medio del objeto. 

        objC.metodo1C(30, "Hola");
        System.out.println(objC.metodo1C(30, "Hola"));
        
        //Guardando un 55 en el atributo enteroCA del atributo objCA del objeto Contenedor (objC).

        objC.getObjCA().setEnteroCA(55);
        //Verificando que se guardo el valor en el atributo.
        System.out.println(objC);
        
        //Guardando la letra Z en el atributo letraCA del atributo CA del objeto contenedor objC.
        objC.setObjCA(new ComponenteA(0, 'Z', ""));
        System.out.println(objC);

        //Ejecutando el metodo1AC del atributo objCA del objeto contenedor objC.
        objC.getObjCA().Metodo1AC(23, 3.141592f);
        System.out.println(objC);
    }
}

/*Tarea 5 23/10/23 --- Fecha maxima de entrega 30/10/23 
1.-Modifique el diagrama de clase para construir el componente B.
2.-Codifique en java la clase componente B.
3.-Actualice para la clase contenedor los setter, getters, constructores, toString.
4.-Haga una instancia de la clase contenedor para que por medio de esta utilice los atributos y metodos de los atributos compoenente A y componente B.
*/
