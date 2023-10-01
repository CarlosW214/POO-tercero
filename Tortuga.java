public class Tortuga {
    
    private int edad;
    private String nombre;
    private char genero;
    private float peso;
    private float altura;
    private Color color;


    public String getNombre (){
        return nombre;
    }
    public void setNombre(String nombre){
        this.nombre=nombre;
    }


     public int getEdad(){
        return edad;
    }
    public void setEdad(int edad) {
        this.edad=edad;
    }


    public char getGenero(){
        return genero;
    }
    public void setGenero(char genero){
         this.genero=genero;

    }


    public float getPeso() {
        return peso;
    }
    public void setPeso(float peso) {
        this.peso = peso;
    }


     public float getAltura() {
        return altura;
    }
    public void setAltura(float altura) {
        this.altura = altura;
    }


    public Color getColor() {
        return color;
    }
    public void setColor(Color color) {
        this.color = color;
    }


    public void FichaTortuga() {

        System.out.println("\n\nTortuga "+getNombre()+"\nColor: "+getColor()+" \nedad:"+getEdad()+"\nSu altura es:"+getAltura()+"\nGenero: "+getGenero()+"\nPeso: "+getPeso());

     }
     
}
