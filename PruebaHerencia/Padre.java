public class Padre {
    //para especializar, tienen que coincidirel nombre, la cantidad de parametros, tipo de parametros y orden de los parámetros
    //para ampliar, se cambian los parametros del método
    private int enteroCP;
    private char letraCP;
    private String textoCP;
    private float realCP;

    //setters y getters
    public int getEnteroCP() {
        return enteroCP;
    }

    public void setEnteroCP(int enteroCP) {
        this.enteroCP = enteroCP;
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
        return realCP;
    }

    public void setRealCP(float realCP) {
        this.realCP = realCP;
    }
    
    //constructores

    public Padre(int enteroCP, char letraCP, String textoCP, float realCP) {
        this.enteroCP = enteroCP;
        this.letraCP = letraCP;
        this.textoCP = textoCP;
        this.realCP = realCP;
    }
        
    public Padre() {
        this.enteroCP = 0;
        this.letraCP = ' ';
        this.textoCP = " ";
        this.realCP = 0.0f;
    }

    @Override
    public String toString() {
        return "Padre{" + "enteroCP=" + enteroCP + ", letraCP=" + letraCP + ", textoCP=" + textoCP + ", realCP=" + realCP + '}';
    } 
    
    public int metodo1CP(int entero){
        int resultado=0;
        System.out.println("Ejecutándose el metodo1CP() con: "+entero);
        resultado=resultado+2*entero;
        return resultado;
    }
    
    public char metodo2CP(char letra,int num_letras){
        char caracter=' ';
        System.out.println("Ejecutandose el metodo2CP() con: "+letra+", "+num_letras);
        caracter=(char)(caracter+1);//aplicando un cast para cambiar el tipo de dato de entero a char
        return caracter;
    }
    
    public String metodo3CP(String textoCP,int num_palabras){
        String unTexto=" ";
        System.out.println("Ejecutandose el metodo3CP() con: "+textoCP+", "+num_palabras);
        unTexto=textoCP+num_palabras;
        return unTexto;
    }
    
    public float metodo4CP(float realCP){
        float unReal=0.1f;
        System.out.println("Ejecutandose el metodo4CP() con "+realCP);
        unReal=2*realCP;
        return unReal;
    }
}