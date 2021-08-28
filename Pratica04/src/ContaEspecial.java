// A conta especial possui como atributo um limite.
// Nessa conta o método sacar foi redefinido, permitindo um saldo negativo até o valor do limite
public class ContaEspecial extends Conta{
	private double limite;
	
	public ContaEspecial(String c, int n, double s, double l) {
		super(c, n, s);
		setLimite(l);
	}
	
	public double getLimite() {
		return limite;
	}

	public void setLimite(double limite) {
		if(limite < 0)
			this.limite = 0;
		else this.limite = limite;
	}
	
	public void saque(double valor) {
		if(getSaldo() - valor < limite)
			System.out.println("Saque indisponivel");
		else setSaldo(getSaldo() - valor);
	}
}
