package servicos;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

import javax.swing.JOptionPane;

import cadastro.CadastroAluno;
import dados.Aluno;

public class LendoArquivo {
	
	static final String nomeArquivoAluno =  "arquivos/alunos.txt";
	
	public void lerAlunos() {
		int op;
		BufferedReader entrada = null;
		CadastroAluno ca = new CadastroAluno();
		Scanner s = null;
		int quant = 0;
	
		if(new File(nomeArquivoAluno).isFile()) {
			op = JOptionPane.showConfirmDialog(null, "Arquivo txt de Aluno encontrado.\n Deseja utilizar os dados salvos no arquivo?");
			if(op == 0) {
	
				try {
					entrada = new BufferedReader(new FileReader(nomeArquivoAluno));
					String linha;
					
					while ((linha = entrada.readLine()) != null) {
						s = new Scanner(linha);
						s.useDelimiter(";");
						
						String nome = s.next();
						String email = s.next();
						String STRrend = s.next();
						float rend = Float.parseFloat(STRrend);
						
						Aluno a = new Aluno(nome, email, rend);
						
						quant = quant+1;
						ca.getAlunos().add(a);
					}
				} catch (IOException e) {
					e.printStackTrace();
				}finally {
					CadastroAluno.setQuantAluno(quant);
					if(entrada != null)
						try {
							entrada.close();
						} catch (IOException e2) {
							e2.printStackTrace();
						}
						
				}
			}else {
				try {
					PrintWriter writer = new PrintWriter(nomeArquivoAluno);
				writer.print("");
				writer.close();
				} catch (IOException e3) {
					e3.printStackTrace();
				}	
			}	
		}
	}
}
