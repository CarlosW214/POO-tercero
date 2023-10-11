# POO-tercero
Programas que hice durante el semestre 23-01

Notas
Los tres archivos que están afuera corresponden a la tarea 3 parte 1. 

public class Corredor {
    public static void correr(double distancia, double tiempo, double talla) {
        double velocidad = distancia / tiempo;
        System.out.println("El corredor recorrió una distancia de " + distancia + " metros en un tiempo de " + tiempo + " segundos.");
        System.out.println("Su velocidad promedio fue de " + velocidad + " metros por segundo.");
        System.out.println("La talla del corredor es " + talla);
    }

      public static void main(String[] args) {
        double distanciaRecorrida = 1000.0; // en metros
        double tiempoEmpleado = 60.0; // en segundos
        double tallaCorredor = 1.75; // en metros

        // Llamada al método correr
        correr(distanciaRecorrida, tiempoEmpleado, tallaCorredor);
    }
}
