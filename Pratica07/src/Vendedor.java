
public class Vendedor extends Funcionario {
	private double comissao;
	
	Vendedor(String n, String mat, double sal, double com) {
		super(n, mat, sal);
		setComissao(com);
	}
	
	public void mostraDados() {
		super.mostraDados();
		System.out.println("Comissao: " + getComissao());
		System.out.println("Salario: " + calculaSalario());
	}

	public double calculaSalario() {
		return salario_base+comissao;
	}

	public double getComissao() {
		return comissao;
	}

	public void setComissao(double comissao) {
		this.comissao = comissao;
	}
	
	

}
