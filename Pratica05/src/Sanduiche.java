
public class Sanduiche extends Prato {
	private String pao;
	private String carne;
	private String salada;
	
	Sanduiche(double ct, double v, int t, String p, String cr, String s){
		super(ct, v, t);
		setPao(p);
		setCarne(cr);
		setSalada(s);
	}
	
	public String getPao() {
		return pao;
	}
	public void setPao(String pao) {
		this.pao = pao;
	}
	public String getCarne() {
		return carne;
	}
	public void setCarne(String carne) {
		this.carne = carne;
	}
	public String getSalada() {
		return salada;
	}
	public void setSalada(String salada) {
		this.salada = salada;
	}
	
	
}
