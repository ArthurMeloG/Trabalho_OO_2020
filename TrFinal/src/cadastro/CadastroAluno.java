package cadastro;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import dados.Aluno;
import servicos.Exception;

public class CadastroAluno {

	// Criando Array de alunos
	List<Aluno> alunos = new ArrayList<Aluno>();

	public boolean cadastrarAluno() {
		Aluno temp = new Aluno(null, null, null);
		temp = Exception.alunoException();
		

		alunos.add(temp);

		return true;
	}
	
	public void printTest(){
		
		for (int i = 0; i < alunos.size(); i++) {

			JOptionPane.showMessageDialog(null,"Alunos Cadastrado\n" +
											"email : " + alunos.get(i).getEmail() + "\n" +
											"nome : " + alunos.get(i).getNome() + "\n" +
											"Rendimento : " + alunos.get(i).getRend());

		}
	}
}


