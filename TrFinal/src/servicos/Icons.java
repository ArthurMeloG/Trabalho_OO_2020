package servicos;

import javax.swing.ImageIcon;

public class Icons {
	public static ImageIcon icones(int i) {
		
		ImageIcon icons = null;
		switch (i) {
		case 1:
			icons = new ImageIcon("icons/unb.png");
			break;
			
		case 2:
			icons = new ImageIcon("icons/name.jpg");
			break;
			
		case 3:
			icons = new ImageIcon("icons/mail.jpg");
			break;
			
		case 4:
			icons = new ImageIcon("icons/rendimento.jpg");
			break;
		case 5:
			icons = new ImageIcon("icons/categoria.png");
			break;
		case 6:
			icons = new ImageIcon("icons/despesas.png");
			break;

		default:
			break;
		}
	
	return icons;
	}
}
