public class Padre{
    
    private int EnteroCP;
    private char letraCP;
    private String textoCP;
    private float RealCP;

      public int getEnteroCP() {
        return EnteroCP;
    }

    public void setEnteroCP(int enteroCP) {
        EnteroCP = enteroCP;
    }

     public char getLetraCP() {
        return letraCP;
    }

    public void setLetraCP(char letraCP) {
        this.letraCP = letraCP;
    }

    public String getTextoCP() {
        return textoCP;
    }

    public void setTextoCP(String textoCP) {
        this.textoCP = textoCP;
    }

     public float getRealCP() {
        return RealCP;
    }

    public void setRealCP(float realCP) {
        RealCP = realCP;
    }

    public Padre() {
        EnteroCP=0;
        letraCP=' ';
        textoCP="";
        RealCP=0;

    }
    
    public Padre(int enteroCP, char letraCP, String textoCP, float realCP) {
        EnteroCP = enteroCP;
        this.letraCP = letraCP;
        this.textoCP = textoCP;
        RealCP = realCP;
    }

    @Override
    public String toString() {
    return String.format("EnteroCP: %d, letraCP: %c, textoCP: %s, RealCP: %f",
        EnteroCP, letraCP, textoCP, RealCP);
    }


    public int metodo1CP(int entero){
        int numero;
        numero=1;
        entero=entero+numero;
        System.out.println("Ejecutando el metedo 1");
        return entero;

    }

    public char metodo2CP(char letra){
        letra=' ';
        System.out.println("Ejecutando el metodo 2");
        return letra;
    }

    public float metodo3CP(float entero, char letra2){
        System.out.println("Ejecutando el metodo 3");
        return entero;
    }

    public float metodo4CP(String texto, int numero){
        float n2;
        n2=0;
        System.out.println("Ejecutando el metodo 4");
        return n2;
    }
}