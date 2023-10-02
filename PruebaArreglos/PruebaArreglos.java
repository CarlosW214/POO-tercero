import java.util.Random;

public class PruebaArreglos {
    public static void main(String[] args) {
        //Se crea un arreglo de 5 enteros llamado edades
        //int Edades[5]; Sintaxis para lenguaje C
        
        // Creando Numeros aleatorios. 

        Random rand =new Random();
        int n=rand.nextInt(81);
        n+=1;


        int Edades[]= new int[5];
        //Guardando en el primer entero de Edades el valor 10
        Edades[0]=10;
        Edades[1]=1995;
        Edades[2]=(int)(Math.random()*100); //Hacer un cast
       
        //System.out.println(Edades[2]);
        
        Edades[3]=13;
        Edades[4]=9;
        
        int[] edad;
        edad=new int[40];
        
        //Creando un arreglo de 5 números flotantes llamado Pesos
        //Indica que es un vector
        float []Pesos= new float[5];
        
        //Inicializando el arreglo Pesos con valores aleatorios comprendidos entre 
        //1 y 100 mediante el uso de un for
        for(int i=0;i<2;i++){
            Pesos[i]=(float)(Math.random());
            System.out.println("Peso "+i+":"+Pesos[i]+"\n\n");
        }
        
        for(int i=0; i<edad.length; i++){

            edad[i]=rand.nextInt(40);
            System.out.println("Edad "+i+":"+edad[i]);
        }
        


        //Creando u  arreglo de 5 caracteres llamado Letras que representen una letra del abecedario
        //Generando Nombres de forma aleatoria.
        //char Letras[]= new char[5];
        
        String nombres[]={"Tania","Claudia","Ojeda","Teresa","Carlos","AMLO","Auriel","Christian"}; //0-7
        String apellidos[]={"Reyes","Paz","Diaz","Perez","Maldonado","Rojas","Baez","Prieto"};
        String apellidosma[]={"Crisostomo","Zarco","Perez","Kenny","Panda","LoboGris","Leoner","Mendez"};
        
        //Definiendo tres numeros enteros que se usaran como indice.
       /*  int In;  //Indice para nombre.
        int Ip;  //Indice para apellido.
        int Im;  //Indicde para mpa.
        */
        String nombreCompleto;

        for(int i=0; i<5;i++){
        
            Random rand1 =new Random();
            int n1=rand1.nextInt(7);
            n1+=1;
            int n2=rand1.nextInt(7);
            n2+=1;
            int n3=rand1.nextInt(7);
            n3+=1;
            
                nombreCompleto=nombres[n1]+" "+apellidos[n2]+" "+apellidosma[n3];
                System.out.println(nombreCompleto);
        }

        String Nombres[] = new String[5];
        Nombres[1]="Pedro";
        Nombres[0]="Juan";
        Nombres[4]="Karen Madrigal";


    }
}
