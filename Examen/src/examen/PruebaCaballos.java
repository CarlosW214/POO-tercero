/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package examen;

/**
 *
 * @author carlo
 */
public class PruebaCaballos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        System.out.println("Lerdo Crisostomo Juan Carlos. \nPrograma Caballos.");

        Caballos Jake=new Caballos("Jake", 1, 12, 'M', null);
        Caballos Gunter=new Caballos();


        Caballos[] Caballo = new Caballos[79];


        for (int i=0; i<79; i++ ) {
            Caballo[i]=new Caballos();
        }

        for (int i=0; i<Caballo.length;i++){
            Caballo[i].Datos();
        }


        
    }
    
}
