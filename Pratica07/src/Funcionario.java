
public abstract class Funcionario implements Imprimivel {
	protected String nome;
	protected String matricula;
	protected double salario_base;
	
	Funcionario(String n, String mat, double sal){
		setNome(n);
		setMatricula(mat);
		setSalario_base(sal);
	}
	
	public abstract double calculaSalario();
	
	public void mostraDados() {
		System.out.println("Nome: " + getNome());
		System.out.println("Matricula: " + getMatricula());
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public double getSalario_base() {
		return salario_base;
	}

	public void setSalario_base(double salario_base) {
		this.salario_base = salario_base;
	}
	
}
