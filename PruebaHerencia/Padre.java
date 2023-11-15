class Padre {
    private int enteroCP;
    private char letraCP;
    private String textoCP;
    private float realCP;

    public Padre(int enteroCP, char letraCP, String textoCP, float realCP) {
        this.enteroCP = enteroCP;
        this.letraCP = letraCP;
        this.textoCP = textoCP;
        this.realCP = realCP;
    }
    
    public Padre(){
        this.enteroCP = 0;
        this.letraCP = 'a';
        this.textoCP = " ";
        this.realCP = 0.0f;
    }

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

    @Override
    public String toString() {
        return "PruebaPadre{" + "enteroCP=" + enteroCP + ", letraCP=" + letraCP + ", textoCP=" + textoCP + ", realCP=" + realCP + '}';
    }
    
    public int metodo1CP(int entero){
        int resultado=0;
        System.out.println("Ejecutándose el metodo1CP() con: "+entero);
        resultado=resultado+2*entero;
        return resultado;
    }
    public char metodo2CP(char letra, int cDL){
        char caracter='a';
        System.out.println("Ejecutándose el metodo2CP() con: "+letra+", "+cDL);
        caracter=(char)(caracter+1);
        return caracter;
    }
    public String metodo3CP(String textoCP, int cDP){
        String unTexto="Hola mundo";
        System.out.println("Ejecutándose el metodo3CP() con: "+textoCP+", "+cDP);
        unTexto=textoCP+cDP;
        return unTexto;
    }
    public float metodo4CP(float realCP){
        float unReal=0.5f;
        System.out.println("Ejecutándose el metodo4CP() con:"+realCP);
        unReal=unReal*realCP;
        return unReal;
    }
    
}
