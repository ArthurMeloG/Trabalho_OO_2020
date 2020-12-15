package servicos;

import java.io.File;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import javax.swing.JOptionPane;

import dados.Aluno;
import dados.Despesas;

public class SalvarArquivo {
	
	static final String nomeArquivoAluno =  "arquivos/alunos.txt";
	static String nomeArquivoCategoria;
	
	public void gravarAluno(Aluno temp) {
		
		String alu = "";
		
		//verificar se aquivo existe
		if(new File(nomeArquivoAluno).isFile()) {
			JOptionPane.showMessageDialog(null, "Arquivo encontrado");
			
		}else {
			JOptionPane.showMessageDialog(null, "Arquivo nao encontrado\n"
					+ "Criando um Arquivo novo");
			
			try {
				@SuppressWarnings({ "unused", "resource" })
				FileWriter arquivo = new FileWriter(new File("arquivos/alunos.txt"));
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
			
		//salvando no arquivo
		alu += temp.getNome() + " ;" + temp.getEmail() + " ;" + temp.getRend() + "\n" ;
		
		PrintWriter print = null;
		
		try {
			
			print = new PrintWriter(new FileWriter(nomeArquivoAluno , true));
			print.print(alu);
		} catch (IOException e) {
			JOptionPane.showMessageDialog(null, "ERRO NA TENTATIVA DE CADASTRAR ALUNO NO ARQUIVO", "ERRO",
					JOptionPane.ERROR_MESSAGE);
		} finally {
			if(print != null)
				print.close();
		}
	}

	
	public void gravarCategoria(Despesas temp, String CatDescricao) {
		
		String cat = "";
		
		
		JOptionPane.showMessageDialog(null, "CADASTRANDO DESPESAS EM UM ARQUIVO TXT");
		String mes = JOptionPane.showInputDialog("Digite o mes do ano");
		String ano = JOptionPane.showInputDialog("Digite o ano atual");
		nomeArquivoCategoria = "arquivos/despesas_" + mes + "_" + ano + ".txt";
		
		//Verifica se tem arquivo
		if(new File(nomeArquivoCategoria).isFile()) {
			JOptionPane.showMessageDialog(null, "Arquivo encontrado");
			
		}else {
			JOptionPane.showMessageDialog(null, "Arquivo nao encontrado\n"
					+ "Criando um Arquivo novo");
		
			try {
				@SuppressWarnings({ "unused", "resource" })
				FileWriter arquivoCategoria = new FileWriter(new File(nomeArquivoCategoria));
				
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		
		
		
		
		
		
		
		//Salvando o arquivo
		cat += CatDescricao + " ;" + temp.getDescricaoDespesa() + " ;" + temp.getValorDespesa() + "\n" ;
		
		
		PrintWriter print = null;
		
		try {
			
			print = new PrintWriter(new FileWriter(nomeArquivoCategoria , true));
			print.print(cat);
			
			
			
		} catch (IOException e) {
			JOptionPane.showMessageDialog(null, "ERRO NA TENTATIVA DE CADASTRAR CATEGORIA NO ARQUIVO", "ERRO",
					JOptionPane.ERROR_MESSAGE);
		} finally {
			if(print != null)
				print.close();
		}
	}
	

}
