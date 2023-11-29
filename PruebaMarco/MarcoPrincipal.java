import javax.swing.*;
import java.awt.*;

public class MarcoPrincipal extends JFrame{ 
    //Agregando Componentes y atributos.
    JButton bt1;
    FlowLayout gestor;
    //Agregando comportamientos o metodos.
    public MarcoPrincipal() {
        super();

    //Definir el tamaño del marco con setSizw.
    this.setSize(600, 500);
    //Definiendo el modo de funcionamiento del marco.
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    //Poner Titulo al marco.
    this.setTitle("Ventana Principal lolololololol");
    //Instanciando el gestor de disenno.
    gestor = new FlowLayout();
    //Activar el gestor de disenno.
    this.setLayout(gestor);
    //Instanciando al componente. Los componentes de la interfaz.
    bt1= new JButton("Boton MP1");
    //Agregando el boton al marco.
    this.add(bt1);
    


    }   
}
