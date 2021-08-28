// Uma conta bancária tem os seguintes atributos: cpf do cliente, nro da conta, saldo.
// É possível realizar as operações de saque e depósito em uma conta.
// Existem dois tipos de conta, a poupança e a especial.

public class Conta {
	private String cpf;
	private int nro;
	private double saldo;
	
	public Conta(String c, int n, double s) {
		setCpf(c);
		setNro(n);
		setSaldo(s);
	}
	
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public int getNro() {
		return nro;
	}
	public void setNro(int nro) {
		this.nro = nro;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	public void saque(double valor) {
		if(saldo - valor < 0)
			System.out.println("Saldo indisponivel");
		else this.saldo = saldo - valor;
	}
	
	public void deposito(double valor) {
		this.saldo = saldo + valor;
	}
	
}
