public class ClaseMixta extends Nieta1 implements IP1,InterfazHija{
    public String metodo2N1(String texto,char letra){
        String calculo=" ";
        System.out.println("Se ejecuto el metodo2N1");
        return calculo;
    }
    
    public float metodo4CH(int entero,float decimal){
        float temporal =0.0f;
        System.out.println("Se ejecuto el metodo4CH");
        return temporal;
    }
    
    public int metodo1IP1(int entero,String texto){
        int resultado=0;
        System.out.println("Se ejecutó el metodo1IP1");
        return resultado;
    }
    
    public int metodo1IH1(int entero){
        int calculo=0;
        System.out.println("Se ejecuto el metodo1IH1");
        return calculo;
    }
    
    public int metodo1IP2(int entero,String texto){
        int numerito=0;
        System.out.println("Se ejecuto el metodo1IP2");
        return numerito;
    }
    public int metodo2IP2(char simbolo){
        int numerillo=0;
        System.out.println("Ejecutando el metodo2IP2");
        return numerillo;
    }
    
    public int metodo1CM(char letra){
        int simbolillo_numerico=0;
        System.out.println("Ejecutando el metodo1CM");
        return simbolillo_numerico;
    }
    
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
    public ClaseMixta(int enteroN1, String textoN1, String textoCH, int enteroCH, int enteroCP, char letraCP, String textoCP, float realCP) {
        super(enteroN1, textoN1, textoCH, enteroCH, enteroCP, letraCP, textoCP, realCP);
    }

    public ClaseMixta(int enteroN1, String textoN1, String textoCH, int enteroCH) {
        super(enteroN1, textoN1, textoCH, enteroCH);
    }

    public ClaseMixta(int enteroN1, String textoN1) {
        super(enteroN1, textoN1);
    }

    public ClaseMixta() {
    }
    
    
}

