package servicos;

import javax.swing.JOptionPane;

import dados.Aluno;

public class Exception {
	public static Aluno alunoException() {
		Aluno al = new Aluno(null, null, null);
		
//		boolean loop2 = true;

		// NAME EXCEPTION

		//boolean loop1 = true;
		//do {
			try {
				
				String nome = JOptionPane.showInputDialog("Digite o seu nome");
				String email = JOptionPane.showInputDialog("Digite o seu email");
				if (nome.isEmpty() || email.isEmpty()) {
					throw new RuntimeException();
				} else
//					loop1 = false;
					al.setEmail(email);
					al.setNome(nome);
			} catch (RuntimeException exc) {
				JOptionPane.showMessageDialog(null, "(DadosPessoaisIncompletosException)");
			}

//		} while (loop1 = !true);
		

		// RENDIMENTO EXCEPTION
//		do {

			try {
				String strREND = JOptionPane.showInputDialog("Digite o seu rendimento");
				float rend = Float.parseFloat(strREND);
//				loop2 = false;
				al.setRend(rend);

			} catch (NumberFormatException ex) {

				JOptionPane.showMessageDialog(null, "(RendimentoInvalidoException)");
			}

//		} while (loop2 = true);
		
			

		return al;

	}

}
