package servicos;

import javax.swing.JOptionPane;

import dados.Aluno;
import dados.Categoria;

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
				
				if (nome.isEmpty()) {  // TESTA O EXCPETION VAZIO
					throw new RuntimeException();
				} else
					nomeLoop = 1;
					al.setNome(nome);  // CADASTRA NOME AO OBJETO 'al'
			} catch (RuntimeException exc) {
				JOptionPane.showMessageDialog(null, "(DadosPessoaisIncompletosException)", "EXCEPTION", JOptionPane.ERROR_MESSAGE);
				JOptionPane.showMessageDialog(null, "Recadastrando...");
			}

		} while (nomeLoop != 1); //LOOP EM CASO DE CADASTRO ERRADO
		
		//EMAIL EXCEPTION
		
		do {
			try {
			
				String email = (String) JOptionPane.showInputDialog(null,"Digite o seu email","CADASTRO", 0 , Icons.icones(3), null,"");
				if (email.isEmpty()) { // TESTA O EXCPETION VAZIO
					throw new RuntimeException();  // JOGA A EXCEÇÃO
				} else
					emailLoop = 1;
					al.setEmail(email); // CADASTRA EMAIL AO OBJETO 'email'
			} catch (RuntimeException exc) {
				JOptionPane.showMessageDialog(null, "(DadosPessoaisIncompletosException)","EXCEPTION", JOptionPane.ERROR_MESSAGE);
				JOptionPane.showMessageDialog(null, "Recadastrando...");
			}

		} while (emailLoop != 1);  // LOOP EM CASO DE CADASTRO ERRADO
		
		// RENDIMENTO EXCEPTION
		do {

			try {
				String strREND = (String) JOptionPane.showInputDialog(null, "Digite o seu rendimento", "CADASTRO", 0 , Icons.icones(4), null, "");
				float rend = Float.parseFloat(strREND);				
				al.setRend(rend); //SETA RENDIMENTO AO OBEJTO 'al'
				rendLoop = 1;

			} catch (NumberFormatException ex) { //TRATA A EXCESSÃO

				JOptionPane.showMessageDialog(null, "(RendimentoInvalidoException)", "EXCEPTION",JOptionPane.ERROR_MESSAGE);
				JOptionPane.showMessageDialog(null, "Recadastrando...");				
				rendLoop = 0;
			}

		} while (rendLoop != 1); // LOOP EM CASO DE CADASTRO ERRADO
		
			

		return al; // RETORNA O OBJETO 'al' Completamente preenchido
	}
	
	public static Categoria categoriaExcepcion() {
		
		int categoriaLoop = 0;
		
		do {
			
			try {
				
			}catch(Exception e) {
				
			}
			
		}while (categoriaLoop != 1);
		
		
	}

}
