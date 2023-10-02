public class PruebaPais{
    public static void main(String[] args) {

        Pais Mexico = new Pais();
        Pais Polonia = new Pais();
        Pais Argentina = new Pais();
        Pais URRS = new Pais();

        System.out.println("Programa que señala atributos de algunas naciones");

        Mexico.setContinente(Continente.AMERICA);
        Mexico.setName("Mexico");
        Mexico.setOfficialName("Estados Unidos Mexicanos");
        Mexico.setPoblacion(128);
        Mexico.setPIB(1322740);
        Mexico.setRanking(13);
        Mexico.setSuperficie(1964375);

        Mexico.DarPIB();
        Mexico.size(12);
        Mexico.population(1);
        Mexico.datosPais();
        Mexico.rank(13);


        Polonia.setContinente(Continente.EUROPA);
        Polonia.setName("Polonia");
        Polonia.setOfficialName("Republica de Polonia");
        Polonia.setPoblacion(41026068);
        Polonia.setPIB(642121);
        Polonia.setRanking(20);
        Polonia.setSuperficie(312696);

        Polonia.DarPIB();
        Polonia.size(12);
        Polonia.population(23);
        Polonia.datosPais();
        Polonia.rank(23);

        
        URRS.setContinente(Continente.EUROPA);
        URRS.setName("Union Sovietica");
        URRS.setOfficialName("Union de Republicas Sovieticas Socialistas");
        URRS.setPoblacion(293047571);
        URRS.setPIB(100585860);
        URRS.setRanking(1);
        URRS.setSuperficie(22402200);

        URRS.datosPais();
        URRS.DarPIB();
        URRS.rank(1);

        Argentina.setContinente(Continente.AMERICA);
        Argentina.setName("Argentina");
        Argentina.setOfficialName("Republica de Argentina");
        Argentina.setPoblacion(46044703);
        Argentina.setPIB(630689);
        Argentina.setRanking(24);
        Argentina.setSuperficie(2780400);

        Argentina.datosPais();
        Argentina.DarPIB();

        

    }
}