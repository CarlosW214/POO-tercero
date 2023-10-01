public class PruebaTortuga{

    public static void main(String[] args) {
        
        Tortuga Miguel = new Tortuga();
        Tortuga Leonardo = new Tortuga();
        Tortuga Donnie = new Tortuga();
        Tortuga Raphael = new Tortuga();


        System.out.println("Programa que da las carateristicas de Tortugas.");
        
        Miguel.setNombre("Miguel Angel");
        Miguel.setColor(Color.NARANJA);

        System.err.println(Miguel.getNombre());
        
        System.out.println("Su color es:  "+Miguel.getColor());
        System.out.println("La tortuga es:"+Miguel.getNombre());

       Leonardo.setNombre("Leonardo");
       Leonardo.setAltura(165.f);
       Leonardo.setColor(Color.AZUL);
       Leonardo.setPeso(50f);
       Leonardo.setGenero('m');
       Leonardo.setEdad(16);
    
        Leonardo.FichaTortuga();


        Miguel.setNombre("Miguel Angel");
        Miguel.setAltura(140.4f);
        Miguel.setColor(Color.NARANJA);
        Miguel.setPeso(43.6f);
        Miguel.setGenero('m');
        Miguel.setEdad(15);

        Miguel.FichaTortuga();

        Donnie.setNombre("Donatello");
        Donnie.setAltura(160.6f);
        Donnie.setColor(Color.MORADO);
        Donnie.setPeso(49);
        Donnie.setGenero('m');
        Donnie.setEdad(16);

        Donnie.FichaTortuga();

        Raphael.setNombre("Raphael");
        Raphael.setAltura(180);
        Raphael.setColor(Color.ROJO);
        Raphael.setPeso(75);
        Raphael.setGenero('m');
        Raphael.setEdad(18);

    }
}