
public class DedExclusiva extends Professor{
	private double salario;
	
	public DedExclusiva(String n, String mat, int i, double s) {
		super(n, mat, i);
		setSalario(s);
	}
	
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
}
