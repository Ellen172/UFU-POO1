// A conta poupança possui como atributo a taxa de rendimento mensal.
// Ela deve ter um método calcularNovoSaldo que atualiza o saldo com a taxa de rendimento

public class ContaPoupa extends Conta {
	private double rendimento;
	
	public ContaPoupa(String c, int n, double s, double r) {
		super(c, n, s);
		setRendimento(r);
	}
	
	public double getRendimento() {
		return rendimento;
	}

	public void setRendimento(double rendimento) {
		this.rendimento = rendimento;
	}
	
	public void calculaNovoSaldo() {
		setSaldo(getSaldo() + (rendimento * getSaldo() / 100));
	}
	
}
