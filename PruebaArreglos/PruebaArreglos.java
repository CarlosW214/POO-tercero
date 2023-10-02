/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author tania
 */
public class PruebaArreglos {
    public static void main(String[] args) {
        //Se crea un arreglo de 5 enteros llamado edades
        //int Edades[5]; Sintaxis para lenguaje C
        int Edades[]= new int[5];
        //Guardando en el primer entero de Edades el valor 10
        Edades[0]=10;
        Edades[1]=1995;
        Edades[2]=(int)(Math.random()*100); //Hacer un cast
        System.out.println(Edades[2]);
        Edades[3]=13;
        Edades[4]=9;
        //Edades[5]=0;
        
        //Creando un arreglo de 5 números flotantes llamado Pesos
        //Indica que es un vector
        float []Pesos= new float[5];
        
        //Inicializando el arreglo Pesos con valores aleatorios comprendidos entre 
        //1 y 100 mediante el uso de un for
        for(int i=0;i<5;i++){
            Pesos[i]=(float)(Math.random()*10);
            System.out.println(Pesos[i]);
        }
        
        //Creando u  arreglo de 5 caracteres llamado Letras que representen una letra del abecedario
        char Letras[]= new char[5];
        String nombre="Tania"+"García"+"Díaz";
        String Nombres[] = new String[5];
        Nombres[1]="Pedro";
        Nombres[0]="Juan";
        Nombres[4]="Karen Madrigal";
    }
}
