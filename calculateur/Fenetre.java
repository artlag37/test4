import javax.imageio.ImageIO;
import java.awt.Dimension;
import java.awt.Image;
import java.io.File;
import java.net.URL;
import java.awt.Color;
import javax.swing.*;
import java.awt.event.*;

public class Fenetre {
    public static void main(String[] arg) {	
	JFrame cadre = new javax.swing.JFrame("Calcul points OFL");
	JPanel panneau = new JPanel();
    //Image image = "logonbavis.png";
	panneau.setPreferredSize(new Dimension(920, 450));

	//panneau.setBackground(Color.white);
	cadre.setContentPane(panneau);
	cadre.setLocation(400, 300);
	cadre.pack();
    // cadre.setIconImage(ImageIO.read(new File("logonbavis.png")));
	cadre.setVisible(true);
	cadre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    JButton bouton = new JButton("Mon bouton");
    panneau.add(bouton);
    }
}
