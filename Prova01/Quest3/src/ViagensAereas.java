
public class ViagensAereas extends Viagem {
	private int nroVoo;
	private String companhia;
	
	ViagensAereas(String n, String c, String r, String ud, String o, String d, String p, int du, int m, int nv, String co){
		super(n, c, r, ud, o , d, p, du, m);
		setNroVoo(nv);
		setCompanhia(co);
	}
	
	public String retornaDados() {
		String text = super.retornaDados() + "Numero do voo: " + getNroVoo() + "\nCompanhia Aerea: " + getCompanhia() + "\n";
		return text;
	}
	
	public int getNroVoo() {
		return nroVoo;
	}
	public void setNroVoo(int nroVoo) {
		this.nroVoo = nroVoo;
	}
	public String getCompanhia() {
		return companhia;
	}
	public void setCompanhia(String companhia) {
		this.companhia = companhia;
	}
	
	
}
