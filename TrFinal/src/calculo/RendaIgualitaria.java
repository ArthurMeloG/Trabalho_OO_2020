package calculo;
import cadastro.CadastroAluno;
import cadastro.CadastroCategoria;

public class RendaIgualitaria {
	public float rendaIgualitaria() {
		CadastroAluno ca = new CadastroAluno();
		CadastroCategoria cc = new CadastroCategoria();
		
		int quantAluno = ca.getqantAluno();
		float valorTotal = 0;
		
		for (int j = 0; j < cc.getListas().size(); j++) {
			for (int j2 = 0; j2 < cc.getListas().get(j).getListasDesp().size(); j2++) {
				valorTotal = cc.getListas().get(j).getListasDesp().get(j2).getValorDespesa() + valorTotal;
			}	
		}
		
		valorTotal = valorTotal / quantAluno;
		
		
		return valorTotal;
	
	}

}
