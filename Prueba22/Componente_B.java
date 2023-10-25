/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/*
 * @author carlo
 */
public class Componente_B {
    private char caracterCB;
    private String textoCB;

    public Componente_B(char caracterCB, String textoCB) {
        this.caracterCB = caracterCB;
        this.textoCB = textoCB;
    }

    public Componente_B() {
        this.caracterCB=' ';
        this.textoCB=" ";
    }

    public char getCaracterCB() {
        return caracterCB;
    }

    public void setCaracterCB(char caracterCB) {
        this.caracterCB = caracterCB;
    }

    public String getTextoCB() {
        return textoCB;
    }

    public void setTextoCB(String textoCB) {
        this.textoCB = textoCB;
    }

    @Override
    public String toString() {
        return "Componente_B{" + "caracterCB=" + caracterCB + ", textoCB=" + textoCB + '}';
    }
    
    
    public float metodo1CB(int numero, float decimal){
        float temporal;
        temporal=numero+decimal;
        System.out.println("Ejecutando el metodo 1 CB con "+decimal+" "+numero);
        return temporal;
    }
}
