
public class Piloto extends Funcionario {
	private int nHoras;
	
	public Piloto(String n, String cpf, String rg, int i, int m, int nh) {
		super(n, cpf, rg, i, m);
		nHoras = nh;
	}
	
	public float calculaSalario() {
		return salarioBase + 10*nHoras;
	}
}
