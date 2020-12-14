package dados;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import servicos.Exception;
import servicos.SalvarArquivo;

public class Categoria {

	private String CatDescricao;
	public List<Despesas> Despesas = new ArrayList<Despesas>();
	SalvarArquivo sc = new SalvarArquivo();

	// Construtor
	public Categoria() {
	}

	// Get e Set
	public String getDescricao() {
		return CatDescricao;
	}

	public void setDescricao(String Catdescricao) {
		this.CatDescricao = Catdescricao;
	}

	public List<Despesas> getListasDesp() {
		return Despesas;
	}

	public void setListas(List<Despesas> desps) {
		this.Despesas = desps;
	}

	public boolean cadastraDespesas() {
		Despesas temp = new Despesas();
		temp = Exception.despesasException();
		Despesas.add(temp);
		sc.gravarCategoria(temp, CatDescricao);

		return true;
	}
	public void printLista(){
		
		for (int i = 0; i < Despesas.size(); i++) { // RODA O ARRAY PEGANDO OS OBJETO E PRINTANDO

			JOptionPane.showMessageDialog(null,"Despesa Cadastrada\n" +
											"valor : " + Despesas.get(i).getValorDespesa() + "\n" +
											"descricao : " + Despesas.get(i).getDescricaoDespesa() + "\n" 
											);

		}
	}
}
