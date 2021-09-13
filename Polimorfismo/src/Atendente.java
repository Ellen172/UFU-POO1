
public class Atendente extends Funcionario {
	private float comissao;
	private int nVendas;
	
	public Atendente(String n, String cpf, String rg, int i, int m) {
		super(n, cpf, rg, i, m);
		comissao = 0.45f;
		nVendas = 0;
	}
	
	public float computaVendas() {
		return nVendas++;
	}
	public float calculaSalario() {
		return salarioBase + comissao*nVendas;
	}
}
