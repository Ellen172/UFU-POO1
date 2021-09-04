
public class Horista extends Professor{
	private int horas;
	private double salario;
	
	public Horista(String n, String mat, int i, int h) {
		super(n, mat, i);
		setHoras(h);
		double s = calculaSalario(h);
		setSalario(s);
	}
	
	public double calculaSalario(int horas){
		return horas*50;
	}
	
	public int getHoras() {
		return horas;
	}
	public void setHoras(int horas) {
		if(horas < 0) 
			this.horas = 0;
		else this.horas = horas;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}
	
		
}
