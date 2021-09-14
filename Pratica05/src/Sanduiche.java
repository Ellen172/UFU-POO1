
public class Sanduiche extends Prato {
	private String pao;
	private String carne;
	private String salada;
	
	Sanduiche(String pa, String ca, String sa, String c, String d){
		super(10.50, 22.90, 25, c, d);
		setPao(pa);
		setCarne(ca);
		setSalada(sa);
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
