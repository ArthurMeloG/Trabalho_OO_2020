package servicos;

import javax.swing.JFrame;

public class printImagenss {
	public static void printar() {

		try {
			for (int i = 0; i < 2; i++) {
				for (int j = 1; j < 10; j++) {
					EasterEgg.printImagem(j);
					new Thread();
					Thread.sleep(60);	
					
				}

			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
	}

}
