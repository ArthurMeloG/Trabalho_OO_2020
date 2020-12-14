package calculo;

import javax.swing.JOptionPane;

import cadastro.CadastroAluno;
import cadastro.CadastroCategoria;

public class RendaProporcional {
	public void calcRendaProporcional() {
		CadastroCategoria cc = new CadastroCategoria();
		CadastroAluno ca = new CadastroAluno();
		
		float valorTotal = 0;
		float rendTotal = 0;
		float temp = 0;
		float temp2 = 0;
		
		for (int j = 0; j < cc.getListas().size(); j++) {
			for (int j2 = 0; j2 < cc.getListas().get(j).getListasDesp().size(); j2++) {
				valorTotal = cc.getListas().get(j).getListasDesp().get(j2).getValorDespesa() + valorTotal;
			}	
		}
		
		for (int i = 0; i < ca.getAlunos().size() ; i++) {
			rendTotal = ca.getAlunos().get(i).getRend() + rendTotal;
		}
		
		for (int h = 0; h < ca.getAlunos().size(); h++) {
			temp = ca.getAlunos().get(h).getRend();
			temp = temp*100;
			temp = temp/rendTotal;   //porcentagem que represanta o aluno ao total de rendimento
			
			temp2= valorTotal * temp;
			temp2= temp2/100;    //valor com base na porcetagem de rendimento
			
			JOptionPane.showMessageDialog(null, "O aluno :" + ca.getAlunos().get(h).getNome() +
											"\n com email :" + ca.getAlunos().get(h).getEmail() +
											"\n Pagará " + temp2 + " Representando " + temp + " % das despesas totais");
			
		}
		
		
	}
}
