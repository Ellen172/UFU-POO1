
public class Pizza extends Prato {
	private String molho;
	private String recheio; 
	private String borda;
	
	public Pizza(String ml, String re, String bd, double cs, double pr){
		super(cs, pr, 35);
		setMolho(ml);
		setRecheio(re);
		setBorda(bd);
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
