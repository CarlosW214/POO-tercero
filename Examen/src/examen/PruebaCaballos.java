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

        System.out.println("Lerdo Crisostomo Juan Carlos. \nPrograma Caballos.");

        Caballos Jake=new Caballos("Jake", 1, 12, 'M', null);
       // Caballos Gunter=new Caballos();

       
        
        Caballos[] Caballo = new Caballos[80];

        for (int i=0; i<80; i++ ) {
            Caballo[i]=new Caballos();
        }

        for (int i=0; i<Caballo.length;i++){
            System.out.println("Caballo: "+(i+1));
            Caballo[i].Datos();
        }

        Caballo[79].Calculo_talla(45, 34, 1); 
        Caballo[45].Calculo_talla(23, 12, 2);
        Caballo[32].Calculo_talla(3, 5, 3);

        Caballo[3].Raza();
        Caballo[5].Raza2();
        Caballo[34].Raza();
        Caballo[53].Raza();


    }
    
}
