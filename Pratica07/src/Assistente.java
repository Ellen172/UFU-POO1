
public class Assistente extends Funcionario{

	Assistente(String n, String mat, double sal) {
		super(n, mat, sal);
	}
	
	public void mostraDados() {
		super.mostraDados();
		System.out.println("Salario: " + calculaSalario());
	}

	public double calculaSalario() {
		return salario_base;
	}
	
	

}
