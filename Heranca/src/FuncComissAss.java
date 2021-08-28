
public class FuncComissAss extends FuncComiss{
	// extends -> herdado de ...
	
	private double salBase;

	public FuncComissAss(String n, double v, double p, double s) {
		super(n, v, p);
		setSalBase(s);
	}
	
	public double getSalBase() {
		return salBase;
	}

	public void setSalBase(double salBase) {
		if(salBase < 0)
			this.salBase = 0;
		else this.salBase = salBase;
	}
	
	public double calculaSalario() {
		return salBase + super.calculaSalario(); // super chama uma função da superclasse 
		// return salBase + (getPorcComiss() * getVendasBrutas());
	}

}
