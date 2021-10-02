
public class Pessoa {
	protected String nome;
	protected String Cpf;
	protected String Rg;
	protected int idade;
	
	Pessoa(String n, String c, String r, int i){
		setNome(n);
		setCpf(c);
		setRg(r);
		setIdade(i);
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return Cpf;
	}
	public void setCpf(String cpf) {
		Cpf = cpf;
	}
	public String getRg() {
		return Rg;
	}
	public void setRg(String rg) {
		Rg = rg;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	
}
