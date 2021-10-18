import java.lang.Comparable;

public class Empregado implements Comparable {
	private String cpf;
	private int anoNascimento;
	private double salario;
	
	Empregado(String cpf, int anoNascimento, double salario){
		setCpf(cpf);
		setAnoNascimento(anoNascimento);
		setSalario(salario);
	}
	
	Empregado(String cpf, int anoNascimento){
		setCpf(cpf);
		setAnoNascimento(anoNascimento);
		
	}
	
	public void mostraDados() {
		System.out.println("Cpf: " + getCpf());
		System.out.println("Ano de Nascimento: " + getAnoNascimento());
		System.out.println("Salario: " + getSalario());
	}
	
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public int getAnoNascimento() {
		return anoNascimento;
	}
	public void setAnoNascimento(int anoNascimento) {
		if(anoNascimento > 0)
			this.anoNascimento = anoNascimento;
		else 
			this.anoNascimento = 1990;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		if(salario > 500)
			this.salario = salario;
		else 
			this.salario = 500;
	}

	// 1-true 0-false
	public int compareTo(Empregado emp) {
		if(this.anoNascimento > emp.anoNascimento)
			return 1;
		else return 0;
	}

	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		return 0;
	}
		
}
