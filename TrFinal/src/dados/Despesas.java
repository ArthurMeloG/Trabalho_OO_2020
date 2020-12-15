package dados;

public class Despesas {
	
	private String descricaoDespesa;
	private float valorDespesa;
	
	
	public Despesas(){};
	
	public String getDescricaoDespesa() {
		return descricaoDespesa;
	}
	
	public float getValorDespesa() {
		return valorDespesa;
	}
	
	
	public void setDescricaoDespesa(String descricaoDespesa) {
		this.descricaoDespesa = descricaoDespesa;
	} 
	
	public void setValorDespesa(float valorDespesa) {
		this.valorDespesa = valorDespesa;
	}
}
