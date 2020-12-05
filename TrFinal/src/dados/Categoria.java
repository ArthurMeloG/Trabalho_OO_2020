package dados;

public class Categoria {
	
	private String CatDescricao;
	private String RecebeSubCategoria;
	private SubCategoria subCategoria = new SubCategoria();
	
	//Get e Set
	public String getDescricao() {
		return CatDescricao;
	}
	
	public void setDescricao(String Catdescricao) {
		this.CatDescricao = Catdescricao;
	}
	
	public void setRecebeSubCategoria() {
		this.RecebeSubCategoria = subCategoria.setSubDescricao(subCategoria);
	}
	
	public SubCategoria getSubCategoria() {
		return subCategoria;
	}
	
}
