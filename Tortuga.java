public class Tortuga {
    
    private int edad;
    private String nombre;
    private char genero;
    private float peso;
    private float altura;
    private Color color;

    public Tortuga(String nombre, Color color){
        this.nombre=nombre;
        this.color=color;
        
        System.out.println("Tortuga:  "+nombre+"\nColor:"+color);

    }

    public String getNombre (){
        return nombre;
    }

    public void setNombre(String nombre){
        this.nombre=nombre;
    }
    public void FichaTortuga() {

        System.out.println("Tortuga "+nombre+" edad "+edad+"");
     }

    public void setEdad(int edad) {
        this.edad=edad;
    }

}
