abstract public class Nieta1 extends Hija{
    public int enteroN1;
    public String textoN1;
    
    public int metodo1N1(int entero){
        int resultado=0;
        System.out.println("Ejecutando metodo1N1 no abstracto");
        return resultado;
    }
    abstract public String metodo2N1(String texto, char letra);
    
}
