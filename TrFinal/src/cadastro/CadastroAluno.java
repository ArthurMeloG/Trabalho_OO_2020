package cadastro;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import dados.Aluno;
import servicos.Exception;
import servicos.SalvarArquivo;

public class CadastroAluno {

	// Criando Array de alunos
	List<Aluno> alunos = new ArrayList<Aluno>();
	

	public boolean cadastrarAluno() {  // ADICIONA O OBJETO ALUNO AO ARRAYLIST
		SalvarArquivo sa = new SalvarArquivo(); // CHAMA PARA GRAVAR ALUNO EM UM AQUIVO TXT
		Aluno temp = new Aluno(null, null, null); //OBJETO TEMPORARIA PARAR RECEBER OBJETO
		
		temp = Exception.alunoException();//RETORNA UM OBJETO ALUNO PREENCHIDO E TRATADO DE EXÇÃO
		
		sa.gravarAluno(temp); // GRAVANDO NO TXT
		alunos.add(temp); // ADICIONA O OBJETO "TEMP" QUE JA ESTA PREENCHIDO POR CONTA DO 'alunoexcpetion'

		return true;
	}
	
	public void printLista(){
		
		for (int i = 0; i < alunos.size(); i++) { // RODA O ARRAY PEGANDO OS OBJETO E PRINTANDO

			JOptionPane.showMessageDialog(null, "Alunos Cadastrado\n" +
											    "email : " + alunos.get(i).getEmail() + "\n" +
											    "nome : " + alunos.get(i).getNome() + "\n" +
											    "Rendimento : " + alunos.get(i).getRend());

		}
			
	}
	
	public List<Aluno> getAlunos(){
		return alunos;
	}
	
	
}
