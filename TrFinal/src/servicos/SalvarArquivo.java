package servicos;

import java.io.File;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import javax.swing.JOptionPane;

import dados.Aluno;
import dados.Categoria;
import dados.Despesas;

public class SalvarArquivo {
	
	static final String nomeArquivoAluno =  "arquivos/alunos.txt";
	static final String nomeArquivoCategoria = "arquivos/categoria.txt";
	
	public void gravarAluno(Aluno temp) {
		
		String alu = "";
		
		//verificar se aquivo existe
		if(new File(nomeArquivoAluno).isFile()) {
			JOptionPane.showMessageDialog(null, "Arquivo encontrado");
			
		}else {
			JOptionPane.showMessageDialog(null, "Arquivo não encontrado\n"
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
	
	
	public void gravarCategoria(Categoria temp) {
		
		String cat = "";
		
		//Verifica se tem arquivo
		if(new File(nomeArquivoCategoria).isFile()) {
			JOptionPane.showMessageDialog(null, "Arquivo encontrado");
			
		}else {
			JOptionPane.showMessageDialog(null, "Arquivo não encontrado\n"
					+ "Criando um Arquivo novo");
			
			try {
				@SuppressWarnings({ "unused", "resource" })
				FileWriter arquivoCategoria = new FileWriter(new File("arquivos/categoria.txt"));
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		//Salvando o arquivo
		cat += temp.getDescricao() + " ;" + temp.getListasDesp() + "\n";
		
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
