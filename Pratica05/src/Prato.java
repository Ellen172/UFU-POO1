
public class Prato extends Pedido {	
	private double custo;
	private double val_venda;
	private int tempo_prep;

	Prato(double ct, double v, int tm){
		super();
		setCusto(ct);
		setVal_venda(v);
		setTempo_prep(tm);
	}
	
	public double defineCusto(Sanduiche s) {
		double cs = 0;
		String pa = s.getPao();
		String ca = s.getCarne();
		String sa = s.getSalada();
		if(pa == "Hungaro") cs += 7.3;
		if(pa == "Frances") cs += 4.5;
		if(ca == "Frango") cs += 2.98;
		if(ca == "Porco") cs += 5.4;
		if(ca == "Vaca") cs += 6.55;
		if(sa == "Tomate") cs += 2;
		if(sa == "Alface") cs += 1.2;
		double pr = cs + (0.45*cs);
		return cs;
	}
	
	public double getCusto() {
		return custo;
	}
	public void setCusto(double custo) {
		if(custo < 0)
			this.custo = 0;
		else this.custo = custo;
	}
	public double getVal_venda() {
		return val_venda;
	}
	public void setVal_venda(double val_venda) {
		if(val_venda < 0)
			this.val_venda = 0;
		else this.val_venda = val_venda;
	}
	public int getTempo_prep() {
		return tempo_prep;
	}
	public void setTempo_prep(int tempo_prep) {
		if(tempo_prep < 0)
			this.tempo_prep = 0;
		else this.tempo_prep = tempo_prep;
	}
	
}
