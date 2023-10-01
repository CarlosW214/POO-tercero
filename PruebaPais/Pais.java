public class Pais {
    
    private float PIB;
    private int superficie;
    private String officialName;
    private String Name;
    private int poblacion;
    private int ranking;
    private Continente continente;
    

    public Continente getContinente() {
        return continente;
    }
    public void setContinente(Continente continente) {
        this.continente = continente;
    }
    
    public float getPIB() {
        return PIB;
    }
    public void setPIB(float pIB) {
        PIB = pIB;
    }
    
    public int getSuperficie() {
        return superficie;
    }
    public void setSuperficie(int superficie) {
        this.superficie = superficie;
    }
    public String getOfficialName() {
        return officialName;
    }
    public void setOfficialName(String officialName) {
        this.officialName = officialName;
    }
    public String getName() {
        return Name;
    }
    public void setName(String name) {
        Name = name;
    }
    public int getPoblacion() {
        return poblacion;
    }
    public void setPoblacion(int poblacion) {
        this.poblacion = poblacion;
    }
    public int getRanking() {
        return ranking;
    }
    public void setRanking(int ranking) {
        this.ranking = ranking;
    } 


    public void DarPIB(){

        System.out.println("\nEl pib de "+getOfficialName()+"es :"+getPIB());

    }

    public int size(int size){
        
        size=getSuperficie()+4;
        System.out.println("La superfice de "+getName()+"es :"+size);
        return size;

    }

    public int population(int population){
        population=getPoblacion();
        System.out.println("La poblacion del "+getName()+"es: "+population);
        return population;

    }
}
