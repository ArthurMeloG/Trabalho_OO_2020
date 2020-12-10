package servicos;


import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import javax.swing.JOptionPane;

import dados.Aluno;

public class SalvarArquivo {
	
	static final String nomeArquivoAluno =  "arquivos/alunos.txt";
	
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

}
