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
				
				String nome = (String) JOptionPane.showInputDialog(null,"Digite o seu nome", "CADASTRO", 0 , Icons.icones(2), null, "");
				if (nome.isEmpty()) {
					throw new RuntimeException();
				} else
					nomeLoop = 1;
					al.setNome(nome);
			} catch (RuntimeException exc) {
				JOptionPane.showMessageDialog(null, "(DadosPessoaisIncompletosException)", "EXCEPTION", JOptionPane.ERROR_MESSAGE);
				JOptionPane.showMessageDialog(null, "Recadastrando...");
			}

		} while (nomeLoop != 1);
		
		
		//EMAIL EXCEPTION
		
		do {
			try {
			
				String email = (String) JOptionPane.showInputDialog(null,"Digite o seu email","CADASTRO", 0 , Icons.icones(3), null,"");
				if (email.isEmpty()) {
					throw new RuntimeException();
				} else
					emailLoop = 1;
					al.setEmail(email);
			} catch (RuntimeException exc) {
				JOptionPane.showMessageDialog(null, "(DadosPessoaisIncompletosException)","EXCEPTION", JOptionPane.ERROR_MESSAGE);
				JOptionPane.showMessageDialog(null, "Recadastrando...");
			}

		} while (emailLoop != 1);
		

		// RENDIMENTO EXCEPTION
		do {

			try {
				String strREND = (String) JOptionPane.showInputDialog(null, "Digite o seu rendimento", "CADASTRO", 0 , Icons.icones(4), null, "");
				float rend = Float.parseFloat(strREND);				
				al.setRend(rend);
				rendLoop = 1;

			} catch (NumberFormatException ex) {

				JOptionPane.showMessageDialog(null, "(RendimentoInvalidoException)", "EXCEPTION",JOptionPane.ERROR_MESSAGE);
				JOptionPane.showMessageDialog(null, "Recadastrando...");				
				rendLoop = 0;
			}

		} while (rendLoop != 1);
		
			

		return al;

	}

}
