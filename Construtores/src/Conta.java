
public class Conta {
	private String nome;
	private int nro; 
	private int senha; 
	private float saldo;
	
	public Conta(String n, int num, float s) {
		setNome(n);
		setNro(num);
		setSaldo(s);
	}
	
	public Conta(int num) {
		nro = num;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getNro() {
		return nro;
	}
	public void setNro(int nro) {
		this.nro = nro;
	}
	public int getSenha() {
		return senha;
	}
	public void setSenha(int senha) {
		this.senha = senha;
	}
	public float getSaldo() {
		return saldo;
	}
	public void setSaldo(float saldo) {
		if(saldo < 0) {
			saldo = 10;
		}
		this.saldo = saldo;
	}
		
}
