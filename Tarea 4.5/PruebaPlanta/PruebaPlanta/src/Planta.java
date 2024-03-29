import java.util.Random;

public class Planta {
    
    private String nombre;
    private float n_humedad;
    private char sol_sombra;
    private Hoja hoja1;
    private int edad;

    
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

     public float getN_humedad() {
        return n_humedad;
    }
    public void setN_humedad(float n_humedad) {
        this.n_humedad = n_humedad;
    }

     public char getSol_sombra() {
        return sol_sombra;
    }
    public void setSol_sombra(char sol_sombra) {
        this.sol_sombra = sol_sombra;
    }

    public Hoja getHoja1() {
        return hoja1;
    }
    public void setHoja1(Hoja hoja1) {
        this.hoja1 = hoja1;
    }

    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }

    
    public float HumedadRelativa(int He, float Ha, boolean calidad){

        float Hre, pi;
        getN_humedad();
        pi=3.1415f;

        if (calidad==true) {  
            Hre=(Ha-He)/pi;
            System.out.println("\nLa calidad de la tierra de "+getNombre()+" es buena : DD");
        }else{
            Hre=pi*Ha;
            System.out.println("\nLa calidad de la tirra de "+getNombre()+" es mala.\nConsiderar cambiar de tierra.");
        }
        
        System.out.println("La humedad relativa de "+getNombre()+" es: "+Hre+"\n");
        
        return Hre;

    }

    public String Habitad(float temperatura, float presion, int presionABS ){
        
        float temperaturaplanta;
        String[] lugares=new String[]{"Soleado","Sombra", "Resolana"};
        String l;
        l="Habitad";

        temperaturaplanta=(temperatura+presion)/presionABS; 
        if (temperaturaplanta>27) {
            
            System.out.println("\nEl habitad ideal de "+getNombre()+" es: "+lugares[0]);    
       
        }else if(temperaturaplanta>25 && temperaturaplanta<27)
        {
            System.out.println("\nEl habitad ideal de "+getNombre()+" es: "+lugares[2]);
       
        }else{

            System.out.println("\nEl habitad ideal de "+getNombre()+" es: "+lugares[1]);
        }        

        return l; 

    }

    public float precio(int size){
       
        float M1;
        edad=getEdad();
        System.out.println("\n\nEl precio de "+getNombre()+" segun sus caracteristicas que son: \nEdad: "+getEdad()+"\nTipo de hoja: "+getHoja1()+"\nHumedad: "+getN_humedad()+"\nEdad: "+getEdad());
        M1=(getEdad()+getN_humedad()+20)*size;

        System.out.println("El precio de "+getNombre()+" es: "+M1);

        return M1;
    }

    
    int datos[]= new int[49];

    public void datos(){

        int sizeM=50;
        Random random=new Random();
        
        float[] humedad = new float[sizeM];

        Random ran=new Random();
        int n=ran.nextInt(49);
        n+=1;

        for(int j=0; j<sizeM; j++ ){
            humedad[j]=random.nextFloat();
        }

        /*for (int j = 0; j < sizeM; j++) {               //Imprime la Matriz de datos.
            System.out.print("\n"+humedad[j] + " ");
        }*/

        setN_humedad(humedad[n]);
        System.out.println("\n\n\nLa humeddad de "+getNombre()+" es: "+getN_humedad());

        char[] sol_sombraArray = new char[49];

        char s = 's';
        char l = 'l';

        for(int f=0; f<sol_sombraArray.length; f++){
            if(f % 2 == 0){
                sol_sombraArray[f]=s;
            }else{
                sol_sombraArray[f]=l;
            }
        }

        setSol_sombra(sol_sombraArray[n]);
        if(getSol_sombra()=='s'){

            System.out.println("La planta de "+getNombre()+" es de sombra.");

        }else{

            System.out.println("La planta de "+getNombre()+" es de Sol.");

        }



    }
}
