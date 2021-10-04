
public class Artefato {
	private String nome;
	
	Artefato(String n){
		setNome(n);
	}
	
	public void imprimeNome() {
		System.out.println("Nome: " + getNome());
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
}
