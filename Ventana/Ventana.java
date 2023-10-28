import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

public class Ventana {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> createAndShowGUI());
    }

    private static void createAndShowGUI() {
        JFrame frame = new JFrame("Tremendo");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);
        frame.setLocationRelativeTo(null);

        try {
            BufferedImage image = ImageIO.read(new File("foo.png"));
            JLabel label = new JLabel(new ImageIcon(image));
            frame.add(label, BorderLayout.CENTER);
        } catch (IOException e) {
            e.printStackTrace();
        }

        frame.setVisible(true);
    }
}
