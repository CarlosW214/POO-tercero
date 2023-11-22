abstract public class Hija extends Padre{
    public String textoCH;
    public int enteroCH;
    
    public char metodo2CP(char letra,int num_letras){
        char caracter=' ';
        System.out.println("Ejecutandose el metodo2CP() al estilo de la Hija");
        System.out.println("Ejecutandose con: "+letra+", "+num_letras);
        caracter=(char)(caracter+1);//aplicando un cast para cambiar el tipo de dato de entero a char
        return caracter;
    }
    
    public String metodo3CP(int num_palabras,String textoCP){
        String unTexto="Adios mundo";
        System.out.println("Ejecutandose el metodo3CP() ampliado: "+textoCP+", "+num_palabras);
        unTexto=textoCP+num_palabras;
        return unTexto;
    }
    
    public char metodo5CH(String texto){
        char resultado='?';
        System.out.println("Ejecutando el metodo5CH() no abstracto");
        return resultado;
    }
    
    
    //codificando el metodo4CH que es abstracto
    abstract public float metodo4CH(int entero,float decimal);

    public String getTextoCH() {
        return textoCH;
    }
    
    //setters y getters
    public void setTextoCH(String textoCH) {
        this.textoCH = textoCH;
    }

    public int getEnteroCH() {
        return enteroCH;
    }

    public void setEnteroCH(int enteroCH) {
        this.enteroCH = enteroCH;
    }
    
    //toString
    @Override
    public String toString() {
        return "Hija{" + "textoCH=" + textoCH + ", enteroCH=" + enteroCH + '}';
    }
    
    //Constructores de Hija y Padre
    public Hija(String textoCH, int enteroCH, int enteroCP, char letraCP, String textoCP, float realCP) {
        super(enteroCP, letraCP, textoCP, realCP);//super para llamar al constructor del padre
        this.textoCH = textoCH;
        this.enteroCH = enteroCH;
    }

    public Hija(String textoCH, int enteroCH) {
        super();
        this.textoCH = textoCH;
        this.enteroCH = enteroCH;
    }
    
    public Hija(){
        super();
        this.textoCH = " ";
        this.enteroCH = 0;
    }
    
}
