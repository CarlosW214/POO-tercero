public class Nieta2 extends Hija {
    public float realN2;
    public int enteroN2;
    
    public float metodo4CH(int entero, float decimal){
        float temporal=0;
        System.out.println("Ejecutando el metodo4CH que era abstracto en clase Hija, pero aquí se implementó:");
        return temporal;
    }
    
    public int metodo1N2(char letra, int entero){
        int mi_entero=0;
        System.out.println("Ejecutando el metodo1N2:");
        return mi_entero;
    }

    public float getRealN2() {
        return realN2;
    }

    public void setRealN2(float realN2) {
        this.realN2 = realN2;
    }

    public int getEnteroN2() {
        return enteroN2;
    }

    public void setEnteroN2(int enteroN2) {
        this.enteroN2 = enteroN2;
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
        return "Nieta2{" + "realN2=" + realN2 + ", enteroN2=" + enteroN2 + '}';
    }

    public Nieta2(float realN2, int enteroN2, String textoCH, int enteroCH, int enteroCP, char letraCP, String textoCP, float realCP) {
        super(textoCH, enteroCH, enteroCP, letraCP, textoCP, realCP);
        this.realN2 = realN2;
        this.enteroN2 = enteroN2;
    }

    public Nieta2(float realN2, int enteroN2, String textoCH, int enteroCH) {
        super(textoCH, enteroCH);
        this.realN2 = realN2;
        this.enteroN2 = enteroN2;
    }

    public Nieta2(float realN2, int enteroN2) {
        this.realN2 = realN2;
        this.enteroN2 = enteroN2;
    }

    public Nieta2() {
        super();
        this.realN2 = 0.0f;
        this.enteroN2 = 0;
    }
    
}
