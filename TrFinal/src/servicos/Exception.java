package servicos;

import javax.swing.JOptionPane;

import dados.Aluno;

public class Exception {
	public static Aluno alunoException() {
		Aluno al = new Aluno(null, null, null);
		

		int nomeLoop = 0;
		int emailLoop = 0;
		int rendLoop = 0;	
		// NOME EXCEPTION


		do {
			try {
				
				String nome = JOptionPane.showInputDialog("Digite o seu nome");
				if (nome.isEmpty()) {
					throw new RuntimeException();
				} else
					nomeLoop = 1;
					al.setNome(nome);
			} catch (RuntimeException exc) {
				JOptionPane.showMessageDialog(null, "(DadosPessoaisIncompletosException)");
				JOptionPane.showMessageDialog(null, "Recadastrando...");
			}

		} while (nomeLoop != 1);
		
		
		//EMAIL EXCEPTION
		
		do {
			try {
			
				String email = JOptionPane.showInputDialog("Digite o seu email");
				if (email.isEmpty()) {
					throw new RuntimeException();
				} else
					emailLoop = 1;
					al.setEmail(email);
			} catch (RuntimeException exc) {
				JOptionPane.showMessageDialog(null, "(DadosPessoaisIncompletosException)");
				JOptionPane.showMessageDialog(null, "Recadastrando...");
			}

		} while (emailLoop != 1);
		

		// RENDIMENTO EXCEPTION
		do {

			try {
				String strREND = JOptionPane.showInputDialog("Digite o seu rendimento");
				float rend = Float.parseFloat(strREND);				
				al.setRend(rend);
				rendLoop = 1;

			} catch (NumberFormatException ex) {

				JOptionPane.showMessageDialog(null, "(RendimentoInvalidoException)");
				JOptionPane.showMessageDialog(null, "Recadastrando...");				
				rendLoop = 0;
			}

		} while (rendLoop != 1);
		
			

		return al;

	}

}
