package servicos;

import javax.swing.JOptionPane;

import dados.Aluno;
import dados.Despesa;

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
					throw new RuntimeException();  // JOGA A EXCE√á√ÉO
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

			} catch (NumberFormatException ex) { //TRATA A EXCESS√ÉO

				JOptionPane.showMessageDialog(null, "(RendimentoInvalidoException)", "EXCEPTION",JOptionPane.ERROR_MESSAGE);
				JOptionPane.showMessageDialog(null, "Recadastrando...");				
				rendLoop = 0;
			}

		} while (rendLoop != 1); // LOOP EM CASO DE CADASTRO ERRADO
		
			

		return al; // RETORNA O OBJETO 'al' Completamente preenchido

	}
	////////////////////////////////////////////////DESPESAS///////////////////////////////////////////////////////////////////////////////////
	
	public static Despesa despesaException() {
		Despesa dp = new Despesa();
		
		int descricaoLoop = 1;
		int valorDespesaLoop = 1;
		
		
		//DESCRI«√O DESPESA
		do {
			try {
			String descricao = (String) JOptionPane.showInputDialog(null,"Digite a descriÁ„o da despesa", "CADASTRO", 0 , Icons.icones(4), null, "");
			if (descricao.isEmpty()) {
				throw new RuntimeException();
			} else {
				descricaoLoop = 1;
				dp.setDescricaoDespesa(descricao);
			}
		}
			catch(RuntimeException exc){
				JOptionPane.showMessageDialog(null, "(DadosdeDespesasIncompletosException)","EXCEPTION", JOptionPane.ERROR_MESSAGE);
				JOptionPane.showMessageDialog(null, "Recadastrando...");
				}
			
		}
		while(descricaoLoop != 1);
		
		//VALORDESPESAS
		
		do {
			try {
			String strValor = (String) JOptionPane.showInputDialog(null,"Digite o valor", "CADASTRO", 0 , Icons.icones(4), null, "");
			float valorDespesas = Float.parseFloat(strValor);
			dp.setValorDespesa(valorDespesas);
			valorDespesaLoop = 1;
			
		}
			catch (NumberFormatException ex) {
				valorDespesaLoop = 0;
				JOptionPane.showMessageDialog(null, "(valorDespesasInvalidoException)", "EXCEPTION",JOptionPane.ERROR_MESSAGE);
				
				JOptionPane.showMessageDialog(null, "Recadastrando...");				
				
			}
			
			
		}
		while(descricaoLoop != 1);
		return dp;
}
}