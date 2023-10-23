public class ComponenteA {

    private int enteroCA;   
    private char letraCA;
    private String TextoC;

    public String getTextoC() {
        return TextoC;
    }
    public void setTextoC(String textoC) {
        TextoC = textoC;
    }
    public int getEnteroCA() {
        return enteroCA;
    }
    public void setEnteroCA(int enteroCA) {
        this.enteroCA = enteroCA;
    }
    public char getLetraCA() {
        return letraCA;
    }
    public void setLetraCA(char letraCA) {
        this.letraCA = letraCA;
    }
    
    public ComponenteA(int enteroCA, char letraCA, String TextoC){
        this.enteroCA=enteroCA;
        this.letraCA=letraCA;
        this.TextoC=TextoC;
    }
    
    public ComponenteA(){
        this.enteroCA=0;
        this.letraCA='j';
        this.TextoC="";

    }

    public String toString() {
        return "ComponenteA{" +"enteroCA=" + enteroCA +", letraCA=" + letraCA +", TextoC='" + TextoC + '\'' + '}';
    }
    
    
    public String Metodo1AC(int real, float decimal){
            String texto="";
            System.out.println("Ejecutando el metodo1AC");
            texto=texto+real;
            
            return texto;

    }
}
