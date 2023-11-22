abstract public class Nieta1 extends Hija{
    public int enteroN1;
    public String textoN1;
    
    public int metodo1N1(int entero){
        int resultado=0;
        System.out.println("Ejecutando metodo1N1 no abstracto");
        return resultado;
    }
    
    abstract public String metodo2N1(String texto,char letra);
    
    //setters y getters

    public int getEnteroN1() {
        return enteroN1;
    }

    public void setEnteroN1(int enteroN1) {
        this.enteroN1 = enteroN1;
    }

    public String getTextoN1() {
        return textoN1;
    }

    public void setTextoN1(String textoN1) {
        this.textoN1 = textoN1;
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
    
    //constructores

    public Nieta1(int enteroN1, String textoN1, String textoCH, int enteroCH, int enteroCP, char letraCP, String textoCP, float realCP) {
        super(textoCH, enteroCH, enteroCP, letraCP, textoCP, realCP);
        this.enteroN1 = enteroN1;
        this.textoN1 = textoN1;
    }

    public Nieta1(int enteroN1, String textoN1, String textoCH, int enteroCH) {
        super(textoCH, enteroCH);
        this.enteroN1 = enteroN1;
        this.textoN1 = textoN1;
    }

    public Nieta1(int enteroN1, String textoN1) {
        super();
        this.enteroN1 = enteroN1;
        this.textoN1 = textoN1;
    }
    
    public Nieta1() {
        super();
        this.enteroN1 = 0;
        this.textoN1 = " ";
    }

    @Override
    public String toString() {
        return "Nieta1{" + "enteroN1=" + enteroN1 + ", textoN1=" + textoN1 + '}';
    }
    
    
}
