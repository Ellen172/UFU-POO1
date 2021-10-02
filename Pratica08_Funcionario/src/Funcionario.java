
public class Funcionario extends Pessoa{
	protected int matricula;
	protected double salarioBase;
	
	Funcionario(String n, String c, String r, int i, int m, double s){
		super(n, c, r, i);
		setMatricula(m);
		setSalarioBase(s);
	}
	
	public int getMatricula() {
		return matricula;
	}
	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}
	public double getSalarioBase() {
		return salarioBase;
	}
	public void setSalarioBase(double salarioBase) {
		this.salarioBase = salarioBase;
	}
	
	
}
