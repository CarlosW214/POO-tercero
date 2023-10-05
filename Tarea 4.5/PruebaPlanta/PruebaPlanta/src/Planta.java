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

        //System.err.println(temperaturaplanta);
        return l; 


    }

    public float precio(String nombre, int size){
        

        return precio("", 0);
    }

    
    int datos[]= new int[49];


}
