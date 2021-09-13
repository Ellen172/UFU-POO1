
public class Funcionario extends Pessoa {
	protected int matricula;
	protected float salarioBase;
	
	public Funcionario(String n, String cpf, String rg, int i, int m) {
		super(n, cpf, rg, i);
		matricula = m;
		salarioBase = 1000;
	}
	
	public float calculaSalario() {
		return salarioBase;
	}
}
