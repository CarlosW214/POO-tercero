package examen;

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


    public float Calculo_talla(int tamano, float peso, int edad){
        float talla;
        
        talla=(tamano*peso)*edad/3;

        System.out.println("La talla de"+getNombre()+" es:"+talla);
        
        return talla;

    }
}
