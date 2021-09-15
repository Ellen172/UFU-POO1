
public class Sanduiche extends Prato {
	private String pao;
	private String carne;
	private String salada;
		
	Sanduiche(String pa, String ca, String sa, double cs, double pr){
		super(cs, pr, 25);
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
