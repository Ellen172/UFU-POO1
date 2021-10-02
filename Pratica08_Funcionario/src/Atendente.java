
public class Atendente extends Funcionario {
	private double comissao;
	private int nVendas;
	
	public Atendente(String n, String c, String r, int i, int m, double s, int nv) {
		super(n, c, r, i, m, s);
		setnVendas(nv);
		comissao = 0.2;
	}
	
	public double calculaSalario() {
		return salarioBase + comissao*nVendas;
	}

	public double getComissao() {
		return comissao;
	}
	public void setComissao(double comissao) {
		this.comissao = comissao;
	}
	public int getnVendas() {
		return nVendas;
	}
	public void setnVendas(int nVendas) {
		this.nVendas = nVendas;
	}
	
	
}
