abstract public class Hija extends Padre{
    public String textoCH;
    public int enteroCH;
    
    public char metodo2CP(char letra, int cDL){
        char caracter='A';
        System.out.println("EJECUTANDOSE METODO_2CP() AL ESTILO DE LA HIJA ");
        System.out.println("EJECUTANDOSE CON:  "+letra+", "+cDL);
        caracter=(char)(caracter+2);
        return caracter;
    }
    public String metodo3CP(int cDP, String textoCP){
        String unTexto="Adios mundo";
        System.out.println("Ejecutándose el metodo3CP() ampliado  con: "+cDP+" , "+textoCP);
        unTexto=textoCP+textoCP;
        return unTexto;
    }
    abstract public float metodo4CH(int entero, float decimal);
    
    //implementando método5CH
    public char metodo5CH(String texto){
        char resultado=' ';
        System.out.println("Ejecutando método no abstracto:");
        return resultado;
    }

    public String getTextoCH() {
        return textoCH;
    }

    public void setTextoCH(String textoCH) {
        this.textoCH = textoCH;
    }

    public int getEnteroCH() {
        return enteroCH;
    }

    public void setEnteroCH(int enteroCH) {
        this.enteroCH = enteroCH;
    }

    @Override
    public String toString() {
        return "Hija{" + "textoCH=" + textoCH + ", enteroCH=" + enteroCH + '}';
    }

    public Hija(String textoCH, int enteroCH, int enteroCP, char letraCP, String textoCP, float realCP) {
        super(enteroCP, letraCP, textoCP, realCP);
        // super sirve para llamar al constructor de la clase padre
        this.textoCH = textoCH;
        this.enteroCH = enteroCH;
    }

    public Hija(String textoCH, int enteroCH) {
        super ();
        this.textoCH = textoCH;
        this.enteroCH = enteroCH;
    }

    public Hija() {
        super ();
        this.textoCH = " ";
        this.enteroCH = 0;
    }
    
    
}
