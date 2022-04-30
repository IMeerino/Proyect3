package Inicio;//ERICK ALFONSO MERINO ROQUE

import java.awt.Graphics;
import javax.swing.ImageIcon;

public class FondoInterfaz extends javax.swing.JPanel {
    public FondoInterfaz(){
        this.setSize(784, 420);
    }
//LO DE ABAJO ES PARA QUE APARESCCA EL FONDO DE ESCUDO DE ARMAS DE MEERINO
    public void paintComponent(Graphics g){
        ImageIcon imagenFondo =  new ImageIcon(getClass().getResource("/Inicio/Fondos/Hola3.jpg"));
        g.drawImage(imagenFondo.getImage(),0,0,784,420, null);
        setOpaque(false);
        super.paintComponent(g);
    }
}