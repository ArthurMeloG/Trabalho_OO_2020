package servicos;

import java.awt.Image;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class EasterEgg {
	public static void printImagem(int z) {
		 try {
	            JFrame frame = new JFrame();
	            File imageFile = new File("imagens/batman" + z + ".jpg");
	            Image i = ImageIO.read(imageFile);
	            ImageIcon image = new ImageIcon(i);
	            JLabel imageLabel = new JLabel(image);
	            frame.add(imageLabel);
	            frame.setLayout(null);
	            imageLabel.setLocation(0, 0);
	            imageLabel.setSize(500, 370);
	            imageLabel.setVisible(true);
	            
	            
	            frame.setVisible(true);
	            frame.setSize(500, 370);
	       
	            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	            
	        } catch (IOException e) {
	            
	            e.printStackTrace();
	        }
		
		 
	}

}
