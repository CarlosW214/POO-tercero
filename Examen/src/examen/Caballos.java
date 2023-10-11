package examen;

import java.util.Random;

public class Caballos {
    
   
    private String nombre;
    private int n_caballo;
    private float cantidad_comida;              //Atributos de distinto tipo de dato.
    private char sexo;
    private Color color;
    
    final int id_caballo_establo = 1205;
    final String especie_1 = "Caballo Americano";       //Atributos Constantes.
    final String especie_2= "Caballo Asiatico";

    public static int fecha_nacimiento[]=new int[3];    //Atributo Estatico.

    
//------------Setters y getters------//

     public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

      public int getN_caballo() {
        return n_caballo;
    }
    public void setN_caballo(int n_caballo) {
        this.n_caballo = n_caballo;
    }

     public float getCantidad_comida() {
        return cantidad_comida;
    }
    public void setCantidad_comida(float cantidad_comida) {
        this.cantidad_comida = cantidad_comida;
    }

     public char getSexo() {
        return sexo;
    }
    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

     public Color getColor() {
        return color;
    }
    public void setColor(Color color) {
        this.color = color;
    }

//-------------------Constructor Maximo----------------
    public Caballos(String nombre, int n_caballo, float cantidad_comida, char sexo, Color color){
        this.nombre=nombre;
        this.n_caballo=n_caballo;
        this.cantidad_comida=cantidad_comida;
        this.sexo=sexo;
        this.color=color;

    }
//----------------Constructor Minimo-----------------
    public Caballos(){
    }

    public void Datos(){
        
        String[] nombresCaballos = {"lol","Relámpago", "Tornado", "Espíritu", "Fuego", "Estrella", "Rayo", "Viento", "Pegaso", "Centella", "Bravo", "Canela", "Diamante", "Montaña", "Trueno", "Cascabel", "Corazón", "Valiente", "Jade", "Esmeralda", "Zafiro", "Aurora", "Dorado", "Plata", "Luna", "Sol", "Místico", "Titanio", "Invierno", "Verano", "Primavera", "Otoño", "Rocío", "Aguamarina", "Marino", "Flama", "Ciruela", "Cobalto", "Violeta", "Índigo", "Turquesa", "Caramelo", "Ambar", "Mariposa", "Apolo", "Astra", "Brisa", "Polar", "Cruzado", "Fenix", "Galaxia", "Granito", "Huracán", "Icaro", "Lince", "Místico", "Nebulosa", "Orion", "Polaris", "Quasar", "Sideral", "Titan", "Uranio", "Venus", "Zenith", "Ángel", "Dante", "Gala", "Sombra", "Noche", "Danza", "Dama", "Rey", "Reina", "Canción", "Deseo", "Dorado", "Sueño", "Esperanza", "Paciencia", "Libertad", "Victoria"};
       
        Random rand=new Random();
        Random rand1=new Random();
        int n1=rand.nextInt(30);
        int n= rand.nextInt(79);
        n+=1;

        float[] alimentolista = new float[80];
        char[] sexolista = new char[80];
        char female='f';
        char male='m';

        Color[] colores_lista = new Color[80];
        Color blanco=Color.BLANCO;
        Color negro=Color.NEGRO;
        Color cafe=Color.CAFE;
        Color gris=Color.GRIS;
        Color moteado=Color.MOTEADO;
        Color amarillo=Color.AMARILLO;


        for (int c=0; c<colores_lista.length; c++){
            if(c<=10){
                colores_lista[c]=blanco;

            }else if(c>10 && c<=20){
                colores_lista[c]=negro;
            }else if(c>20 && c<=30){
                colores_lista[c]=cafe;
            }else if(c>30 && c<=40){
                colores_lista[c]=gris;
            }else if(c>40 && c<=50){
                colores_lista[c]=moteado;
            }else{
                colores_lista[c]=amarillo;
            }
        }

        for (int s=0; s<sexolista.length; s++){
            if (s%2 == 0) {
                sexolista[s]=female;
            }else{
                sexolista[s]=male;
            }
            
        }

        for(int i=0; i<80; i++){ //

            float n_aliemento;

            n_aliemento=rand1.nextFloat()+n1;
            alimentolista[n]=n_aliemento;

            setNombre(nombresCaballos[n]);
            setN_caballo(n);    
            setCantidad_comida(n_aliemento);
            setSexo(sexolista[n]);
            setColor(colores_lista[n]);

        } //

        System.out.println("Los datos de "+getNombre()+ " son: \nNombre: "+getNombre()+"\nNumero de caballo: "+getN_caballo()+"\nCantidad de alimento que necesita: "+getCantidad_comida()+" kg"+"\nSexo: "+getSexo()+"\nColor: "+getColor()+"\n");
    }

    public float Calculo_talla(int tamano, float peso, int edad){
        float talla;
        
        talla=(tamano*peso)*edad/3;

        System.out.println("La talla de "+getNombre()+" es: "+talla);
        
        return talla;

    }
}
