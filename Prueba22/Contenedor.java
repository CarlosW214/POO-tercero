
public class Contenedor {
    
    private int enteroC;
    private char letraC;
    private String textoC;

    //Codificando la agregacion. 
    private ComponenteA objCA; //Codifica la relacion. Agregar setters / getters. 
    private Componente_B objCB;

    public Componente_B getObjCB() {
        return objCB;
    }

    public void setObjCB(Componente_B objCB) {
        this.objCB = objCB;
    }
    
    public ComponenteA getObjCA() {
        return objCA;
    }
    public void setObjCA(ComponenteA objCA) {
        this.objCA = objCA;
    }
    public String getTextoC() {
        return textoC;
    }
    public void setTextoC(String textoC) {
        this.textoC = textoC;
    }
    public char getLetraC() {
        return letraC;
    }
    public void setLetraC(char letraC) {
        this.letraC = letraC;
    }
    public int getEnteroC() {
        return enteroC;
    }
    public void setEnteroC(int enteroC) {
        this.enteroC = enteroC;
    }

    public Contenedor(int enteroC, char letraC, String textoC, ComponenteA objCA, Componente_B objCB) {
        this.enteroC = enteroC;
        this.letraC = letraC;
        this.textoC = textoC;
        this.objCA=objCA;
        this.objCB=objCB;
        
    }
    
    public Contenedor() {
        this.enteroC=0;
        this.letraC=' ';
        this.textoC="";
        this.objCA=new ComponenteA();
        this.objCB=new Componente_B();

    }

    @Override
    public String toString() {
        return "Contenedor{" + "enteroC=" + enteroC + ", letraC=" + letraC + ", textoC=" + textoC + ", objCA=" + objCA + ", objCB=" + objCB + '}';
    }
    
    public String metodo1C(int entero, String Texto){

        String texto="";
        System.out.println("Ejecutando el metodo1C");
        texto=texto+entero;
        return texto;

    }

}
    
