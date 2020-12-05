package dados;

public class Categoria {
	
	private String CatDescricao;
	private String RecebeSubCategoria;
	private SubCategoria subCategoria = new SubCategoria();
	
	//Construtor
	public Categoria() {}
	
	//Get e Set
	public String getDescricao() {
		return CatDescricao;
	}
	
	public void setDescricao(String Catdescricao) {
		this.CatDescricao = Catdescricao;
	}
	
	public SubCategoria getSubCategoria() {
		return subCategoria;
	}
	
	public void setSubCategoria(SubCategoria subCategoria) {
		this.subCategoria = subCategoria.setSubDescricao(RecebeSubCategoria);;
	}
	
	public String getRecebeSubCategoria() {
		return RecebeSubCategoria;
	}
	
	public void setRecebeSubCategoria(String recebeSubCategoria) {
		RecebeSubCategoria = recebeSubCategoria;
	}
	
}
