
public class Pessoa {
	private String nome;
	private String cpf;
	
	Pessoa(String n, String c){
		setNome(n);
		setCpf(c);
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
}
