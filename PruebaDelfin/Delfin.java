public class Delfin {

    private String nombre;
    private int edad;
    private char genero;
    private double longitud;
    private String color;

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

    public char getGenero() {
        return genero;
    }

    public void setGenero(char genero) {
        this.genero = genero;
    }

    public double getLongitud() {
        return longitud;
    }

    public void setLongitud(double longitud) {
        this.longitud = longitud;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void mostrarInformacion() {
        System.out.println("Delfín: " + nombre);
        System.out.println("Edad: " + edad + " años");
        System.out.println("Género: " + genero);
        System.out.println("Longitud: " + longitud + " metros");
        System.out.println("Color: " + color);
    }
}
