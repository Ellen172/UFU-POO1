
public class Piloto extends Funcionario {
	private int nHoras;
	
	Piloto(String n, String c, String r, int i, int m, double s, int nh){
		super(n, c, r, i, m, s);
		setnHoras(nh);
	}
	
	public double calculaSalario() {
		return salarioBase + 10*nHoras;
	}

	public int getnHoras() {
		return nHoras;
	}

	public void setnHoras(int nHoras) {
		this.nHoras = nHoras;
	}
	
}
