package dados;

public class Despesa {
	
	private String descricaoDespesa;
	private float valorDespesa;
	
	
	public Despesa(){};
	
	
	
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
