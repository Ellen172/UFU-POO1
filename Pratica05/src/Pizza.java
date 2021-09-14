
public class Pizza extends Prato {
	private String molho;
	private String recheio; 
	private String borda;
	
	public Pizza(String ml, String re, String bd){
		super(35);
		setMolho(ml);
		setRecheio(re);
		setBorda(bd);
	}
	
	public void definePreco(String mo, String re, String bo) {
		double cs=0;
		if(mo == "Tomate") cs += 14.25;
		if(mo == "Maionese") cs += 9.65;
		if(mo == "Chocolate") cs += 6.87;
		if(re == "Mussarela") cs += 18.45;
		if(re == "Calabresa") cs += 12.54;
		if(re == "Frango") cs += 19.99;
		if(re == "Morango") cs += 8.54;
		if(bo == "Catupiry") cs += 6.24;
		if(bo == "Cheddar") cs += 8.54;
		double pr = cs + (cs * 0.8);
		
		super.setCusto(cs);
		super.setVal_venda(pr);
	}
	
	public String getMolho() {
		return molho;
	}
	public void setMolho(String molho) {
		this.molho = molho;
	}
	public String getRecheio() {
		return recheio;
	}
	public void setRecheio(String recheio) {
		this.recheio = recheio;
	}
	public String getBorda() {
		return borda;
	}
	public void setBorda(String borda) {
		this.borda = borda;
	}
	
	
}
