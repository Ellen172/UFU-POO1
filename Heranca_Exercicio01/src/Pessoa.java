
public class Pessoa {
	private String nome;
	private String sobrenome;
	private int idade;
	private String rg;
	private String lugarNascimento;
	
	public Pessoa(String n, String s, int i, String r, String ln) {
		setNome(n);
		setSobrenome(s);
		setIdade(i);
		setRg(r);
		setLugarNascimento(ln);
	}
	
	public void infoPessoal() {
		System.out.println("Nome: " + getNome());
		System.out.println("Sobrenome: " + getSobrenome());
		System.out.println("Idade: " + getIdade());
		System.out.println("Rg: " + getRg());
		System.out.println("Lugar: " + getLugarNascimento());
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getSobrenome() {
		return sobrenome;
	}
	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public String getRg() {
		return rg;
	}
	public void setRg(String rg) {
		this.rg = rg;
	}
	public String getLugarNascimento() {
		return lugarNascimento;
	}
	public void setLugarNascimento(String lugarNascimento) {
		this.lugarNascimento = lugarNascimento;
	}
}
