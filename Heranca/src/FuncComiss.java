
public class FuncComiss {
	private String nome;
	private double vendasBrutas;
	private double porcComiss;
	
	public FuncComiss(String n, double v, double p) {
		setNome(n);
		setVendasBrutas(v);
		setPorcComiss(p);
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getVendasBrutas() {
		return vendasBrutas;
	}
	public void setVendasBrutas(double vendasBrutas) {
		if(vendasBrutas <= 0)
			this.vendasBrutas = 0;
		else this.vendasBrutas = vendasBrutas;
	}
	public double getPorcComiss() {
		return porcComiss;
	}
	public void setPorcComiss(double porcComiss) {
		if(porcComiss <=0)
			this.porcComiss = 0;
		else this.porcComiss = porcComiss;
	}
	
	public double calculaSalario() {
		return porcComiss * vendasBrutas;
	}
	
	
}
