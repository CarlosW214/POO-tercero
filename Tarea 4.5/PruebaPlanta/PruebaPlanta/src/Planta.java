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

    

}
