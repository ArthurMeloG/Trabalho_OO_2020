package cadastro;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import  dados.Despesa;
import servicos.Exception;

public class cadastraDespesa {

	// Criando Array de despesas
		List<Despesa> Despesas = new ArrayList<Despesa>();

		public boolean cadastrarDespesa() {  // ADICIONA O OBJETO DESPESA AO ARRAYLIST
			Despesa temp = new Despesa( ); //OBJETO TEMPORARIA PARAR RECEBER OBJETO
			
			temp = Exception.despesaException();//RETORNA UM OBJETO ALUNO PREENCHIDO E TRATADO DE EX√á√ÉO
		
			Despesas.add(temp); // ADICIONA O OBJETO "TEMP" QUE JA ESTA PREENCHIDO POR CONTA DO 'despesaEXECPTION'

			return true;
		}
		
		public void printLista(){
			
			for (int i = 0; i < Despesas.size(); i++) { // RODA O ARRAY PEGANDO OS OBJETO E PRINTANDO

				JOptionPane.showMessageDialog(null,"Despesa Cadastrada\n" +
												"valor : " + Despesas.get(i).getValorDespesa() + "\n" +
												"descriÁ„o : " + Despesas.get(i).getDescricaoDespesa() + "\n" 
												);
				
			
				
			

			}
		}
}
