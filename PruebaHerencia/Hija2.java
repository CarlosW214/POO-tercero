public class Hija2 extends Padre{
    public int enteroCH2;
    
    public char metodo1CH2(char letra){
        char simbolo=' ';
        return simbolo;
    }
    
    public int metodo1CP(int entero){
        int resultado=0;
        System.out.println("Ejecutándose el metodo1CP() con: "+entero);
        resultado=resultado+2*entero;
        return resultado;
    }
}

