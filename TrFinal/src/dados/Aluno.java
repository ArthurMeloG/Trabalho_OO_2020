package dados;

public class Aluno {
	private String nome;
	private String email;
	private Float rend;
	
	// Construtor
	
	public Aluno(String nome, String email , Float rend) {
		this.setEmail(email);
		this.setNome(nome);
		this.setRend(rend);
	}
	
	// GEt e Set

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Float getRend() {
		return rend;
	}

	public void setRend(Float rend) {
		this.rend = rend;
	}

}
