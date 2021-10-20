import java.io.Serializable;

public class Pessoa implements Serializable {
	private int idPessoa;
	private String nome;
	private double salario;
	private String senha;
	
	Pessoa(int idPessoa, String nome, double salario, String senha){
		this.setIdPessoa(idPessoa);
		this.setNome(nome);
		this.setSalario(salario);
		this.setSenha(senha);
	}
	
	public int getIdPessoa() {
		return idPessoa;
	}
	public void setIdPessoa(int idPessoa) {
		this.idPessoa = idPessoa;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	
	
}
