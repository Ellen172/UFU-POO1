
public class Pizza extends Prato {
	private String molho;
	private String recheio; 
	private String borda;
	
	public Pizza(String ml, String re, String bd, double ct, double v, int tm, String c, String d, double tx, double p, double t){
		super(ct, v, tm, c, d, tx, p, t);
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
