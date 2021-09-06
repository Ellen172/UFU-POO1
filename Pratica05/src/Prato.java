
public class Prato {	
	private double custo;
	private double val_venda;
	private int tempo_prep;
	private int tipo;

	Prato(double ct, double v, int t){
		setCusto(ct);
		setVal_venda(v);
		setTempo_prep(t);
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
	public int getTipo() {
		return tipo;
	}
	public void setTipo(int tipo) {
		this.tipo = tipo;
	}
	
}
