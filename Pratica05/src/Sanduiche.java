
public class Sanduiche extends Prato {
	private String pao;
	private String carne;
	private String salada;
		
	Sanduiche(String pa, String ca, String sa){
		super(25);
		setPao(pa);
		setCarne(ca);
		setSalada(sa);
	}
	
	public void imprimePreco() {
		double a = super.getCusto();
		System.out.println("custo = " + a);
		double b = super.getVal_venda();
		System.out.println("venda = " + b);
		double c = super.getTempo_prep();
		System.out.println("tempo = " + c);
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
