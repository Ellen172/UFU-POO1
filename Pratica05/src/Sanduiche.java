
public class Sanduiche extends Prato {
	private String pao;
	private String carne;
	private String salada;
		
	Sanduiche(String pa, String ca, String sa){
		super(12.54, 54.25, 25);
		setPao(pa);
		setCarne(ca);
		setSalada(sa);
	}
	
	public void definePreco(String pa, String ca, String sa) {
		double cs = 0.0;
		if(pa == "Hungaro") cs += 10;
		if(pa == "Francês") cs += 6.4;
		if(ca == "Frango") cs += 7.3;
		if(ca == "Porco") cs += 3.45;
		if(ca == "Vaca") cs += 5.67;
		if(sa == "Tomate") cs += 2.4;
		if(sa == "Alface") cs += 1.2;
		double pr = cs + (0.45 * cs);
		
		super.setCusto(cs);
		super.setVal_venda(pr);
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
