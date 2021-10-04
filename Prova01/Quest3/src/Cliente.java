
public class Cliente {
	private String nome;
	private String cpf;
	private String rg;
	private String ultimo_dest;
	
	Cliente(String n, String c, String r, String ud){
		setNome(n);
		setCpf(c);
		setRg(r);
		setUltimo_dest(ud);
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
	public String getRg() {
		return rg;
	}
	public void setRg(String rg) {
		this.rg = rg;
	}
	public String getUltimo_dest() {
		return ultimo_dest;
	}
	public void setUltimo_dest(String ultimo_dest) {
		this.ultimo_dest = ultimo_dest;
	}
	
	
}
