import java.util.Random;

public class Arreglos {
    
    
    private int edad;
    //private final String CURP; //No se puede set en atributos constantes.
    private final String CURP;
    
    public Arreglos(String cURP) { //Constructor 
        this.CURP = cURP;
        this.edad=edad;
        this.nombre=nombre;

        cURP="";

    }

    /*public Arreglos() {   //Constructor 
       // CURP = "xd";      //Para algo con un atributo constante su contructor minimo es de uno.
    }Tiene atributos constantes por lo que no hay constructor 0.*/ 

    private String  nombre;
    private static String gentilicio;
    

    public static String getGentilicio() {
        return gentilicio;
    }
    public static void setGentilicio(String gentilicio) {
        Arreglos.gentilicio = gentilicio;
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void DarSaludo(){
        System.out.println("Bienvenido a una clase mas de POO");
    }

    //public String toString(){
        
    //}
    public static char dame_una_letra(boolean opccion){
      
        char letra;
       String abc="a b c d e f g h i j k l m n o p q r s t u v w x y z";
      
       if (opccion==true) {
        
        abc=abc.toUpperCase();
        //abc="A B C D E F G H I J K L M N O P Q R S T U V W X Y Z ";
       }

       Random index=new Random();
       int ind1=index.nextInt(25);
       ind1+=1;

       letra=abc.charAt(ind1);
       return letra=' ';

    }
    public void nume(){

        Random index=new Random();
        int ind1=index.nextInt(25);
         ind1+=1;

        System.out.println(ind1);

    }
}
