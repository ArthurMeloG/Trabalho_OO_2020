package servicos;

import java.util.InputMismatchException;

import javax.swing.JOptionPane;

import cadastro.CadastroCategoria;
import dados.Aluno;
import dados.Categoria;
import dados.Despesas;

public class Exception {
	public static Aluno alunoException() {
		Aluno al = new Aluno(null, null, null);

		int nomeLoop = 0;
		int emailLoop = 0;
		int rendLoop = 0;

		// NOME EXCEPTION

		do {
			try {

				String nome = (String) JOptionPane.showInputDialog(null, "Digite o seu nome", "CADASTRO", 0,
						Icons.icones(2), null, "");

				if (nome.isEmpty()) { // TESTA O EXCPETION VAZIO
					throw new IllegalArgumentException();
				} else
					nomeLoop = 1;
				al.setNome(nome); // CADASTRA NOME AO OBJETO 'al'
			} catch (IllegalArgumentException exc) {
				JOptionPane.showMessageDialog(null, "(DadosPessoaisIncompletosException)", "EXCEPTION",
						JOptionPane.ERROR_MESSAGE);
				JOptionPane.showMessageDialog(null, "Recadastrando...");
			}

		} while (nomeLoop != 1); // LOOP EM CASO DE CADASTRO ERRADO

		// EMAIL EXCEPTION

		do {
			try {

				String email = (String) JOptionPane.showInputDialog(null, "Digite o seu email", "CADASTRO", 0,
						Icons.icones(3), null, "");
				if (email.isEmpty()) { // TESTA O EXCPETION VAZIO
					throw new IllegalArgumentException(); // JOGA A EXCEÇÃO
				} else
					emailLoop = 1;
				al.setEmail(email); // CADASTRA EMAIL AO OBJETO 'email'
			} catch (IllegalArgumentException exc) {
				JOptionPane.showMessageDialog(null, "(DadosPessoaisIncompletosException)", "EXCEPTION",
						JOptionPane.ERROR_MESSAGE);
				JOptionPane.showMessageDialog(null, "Recadastrando...");
			}

		} while (emailLoop != 1); // LOOP EM CASO DE CADASTRO ERRADO

		// RENDIMENTO EXCEPTION
		do {

			try {
				String strREND = (String) JOptionPane.showInputDialog(null, "Digite o seu rendimento", "CADASTRO", 0,
						Icons.icones(4), null, "");
				float rend = Float.parseFloat(strREND);
				al.setRend(rend); // SETA RENDIMENTO AO OBEJTO 'al'
				rendLoop = 1;

			} catch (NumberFormatException ex) { // TRATA A EXCESSÃO

				JOptionPane.showMessageDialog(null, "(RendimentoInvalidoException)", "EXCEPTION",
						JOptionPane.ERROR_MESSAGE);
				JOptionPane.showMessageDialog(null, "Recadastrando...");
				rendLoop = 0;
			}

		} while (rendLoop != 1); // LOOP EM CASO DE CADASTRO ERRADO

		return al; // RETORNA O OBJETO 'al' Completamente preenchido
	}

	////////////////////////////////// CATEGORIA
	////////////////////////////////// ////////////////////////////////////////////

	public static Categoria categoriaException() {
		Categoria ca = new Categoria();
		CadastroCategoria cc = new CadastroCategoria();
		
		int Catloop = 2;
		do {
			try {
				String nomeCat = (String) JOptionPane.showInputDialog(null, "Digite a categoria a ser cadastrada", "CADASTRO", 0,
					Icons.icones(5), null, "");
				if(cc.verficarIgual(nomeCat) == true) {
					throw new InputMismatchException();
				}
				
				if(nomeCat.isEmpty() == true) {
					throw new IllegalArgumentException();					
				}else {
					Catloop = 1;
					ca.setDescricao(nomeCat);
				}
			} catch (IllegalArgumentException e) {
				
				JOptionPane.showMessageDialog(null, "(CategoriaNaoInformadaException)", "EXCEPTION",
						JOptionPane.ERROR_MESSAGE);
				JOptionPane.showMessageDialog(null, "Recadastrando...");	
				
			} catch(InputMismatchException a) {
				JOptionPane.showMessageDialog(null, "(CategoriaJaCadastradaException)", "EXCEPTION",
						JOptionPane.ERROR_MESSAGE);
				JOptionPane.showMessageDialog(null, "Recadastrando...");	
			}
						
		} while (Catloop != 1);
		
		
		return ca;
}

////////////////////////////////////////////////DESPESAS///////////////////////////////////////////////////////////////////////////////////

	public static Despesas despesasException() {
		Despesas dp = new Despesas();

		int descricaoLoop = 2;
		int valorDespesaLoop = 2;

//DESCRIÇÃO DESPESA
		do {
			try {
				String descricao = (String) JOptionPane.showInputDialog(null, "Digite a descrição da despesa",
						"CADASTRO", 0, Icons.icones(6), null, "");
				if (descricao.isEmpty()) {
					throw new IllegalArgumentException();
				} else {
					descricaoLoop = 1;
					dp.setDescricaoDespesa(descricao);
				}
			} catch (IllegalArgumentException exc) {
				JOptionPane.showMessageDialog(null, "(DescricaoNaoInformadoException)", "EXCEPTION",
						JOptionPane.ERROR_MESSAGE);
				JOptionPane.showMessageDialog(null, "Recadastrando...");
			}

		} while (descricaoLoop != 1);

//VALORDESPESAS

		do {
			try {
				String strValor = (String) JOptionPane.showInputDialog(null, "Digite o valor", "CADASTRO", 0,
						Icons.icones(6), null, "");
				float valorDespesas = Float.parseFloat(strValor);
				dp.setValorDespesa(valorDespesas);
				valorDespesaLoop = 1;

			} catch (NumberFormatException ex) {
				valorDespesaLoop = 0;
				JOptionPane.showMessageDialog(null, "(ValorNaoInformadoException)", "EXCEPTION",
						JOptionPane.ERROR_MESSAGE);

				JOptionPane.showMessageDialog(null, "Recadastrando...");

			}

		} while (valorDespesaLoop != 1);
		return dp;
	}

}
