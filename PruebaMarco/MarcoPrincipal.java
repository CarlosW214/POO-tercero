import javax.swing.*;
import java.awt.*;

public class MarcoPrincipal extends JFrame{ 
    //Agregando Componentes y atributos.
    JButton bt1, bt2, bt3, bt4, bt5;
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
    gestor = new FlowLayout(); //FlowLayout puede acomodar hasta 5 componentes.
    //Activar el gestor de disenno.
    this.setLayout(gestor);
    //Instanciando al componente. Los componentes de la interfaz.
    bt1= new JButton("Boton MP1");
    bt2= new JButton("Boton dos pa");
    bt3= new JButton("Boton tres pa");
    bt4= new JButton("Boton cuatro Pa");
    bt5= new JButton("Boton cinco pa");
    //Agregando el boton al marco.
    this.add(bt1, BorderLayout.NORTH);
    this.add(bt2, BorderLayout.WEST);
    this.add(bt3, BorderLayout.SOUTH);
    this.add(bt4, BorderLayout.EAST);
    this.add(bt5, BorderLayout.CENTER);
    
    

    }   
}
