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
        
        String[] nombresCaballos = {"Relámpago", "Tornado", "Espíritu", "Fuego", "Estrella", "Rayo", "Viento", "Pegaso", "Centella", "Bravo", "Canela", "Diamante", "Montaña", "Trueno", "Cascabel", "Corazón", "Valiente", "Jade", "Esmeralda", "Zafiro", "Aurora", "Dorado", "Plata", "Luna", "Sol", "Místico", "Titanio", "Invierno", "Verano", "Primavera", "Otoño", "Rocío", "Aguamarina", "Marino", "Flama", "Ciruela", "Cobalto", "Violeta", "Índigo", "Turquesa", "Caramelo", "Ambar", "Mariposa", "Apolo", "Astra", "Brisa", "Polar", "Cruzado", "Fenix", "Galaxia", "Granito", "Huracán", "Icaro", "Lince", "Místico", "Nebulosa", "Orion", "Polaris", "Quasar", "Sideral", "Titan", "Uranio", "Venus", "Zenith", "Ángel", "Dante", "Gala", "Sombra", "Noche", "Danza", "Dama", "Rey", "Reina", "Canción", "Deseo", "Dorado", "Sueño", "Esperanza", "Paciencia", "Libertad", "Victoria"};
        
        Random rand=new Random();
        int n= rand.nextInt(79);
        n+=1;

        for(int k=0; k<nombresCaballos.length;k++){
            setN_caballo(n);    
        }

        System.out.println("Los datos de"+getNombre()+ "son: \nNombre: "+getNombre()+"\nNumero de caballo: "+getN_caballo()+"\n Cantidad de comida que come: "+getCantidad_comida()+"\n Sexo: "+getSexo()+"\n Color: "+getColor());
    }

    public float Calculo_talla(int tamano, float peso, int edad){
        float talla;
        
        talla=(tamano*peso)*edad/3;

        System.out.println("La talla de "+getNombre()+" es: "+talla);
        
        return talla;

    }
}
