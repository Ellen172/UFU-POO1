
public class Pedido{
	private String cpf;
	private String data;
	private double val_taxa;
	private double val_pratos;
	private double val_total;
	
	Pedido(String c, String d, double tx, double p, double t){
		setCpf(c);
		setData(d);
		setVal_taxa(tx);
		setVal_pratos(p);
		setVal_total(t);
	}
	
	Pedido(String c, String d){
		setCpf(c);
		setData(d);
		setVal_taxa(5.25);
		setVal_pratos(0);
		setVal_total(0);
	}
	
	public void addPrato(Sanduiche s) {
		double a = s.getVal_venda();
		double b = getVal_pratos();
		setVal_pratos(a+b);
	}
	
	public void addPrato(Pizza p) {
		double a = p.getVal_venda();
		double b = getVal_pratos();
		setVal_pratos(a+b);
	}
	
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getData() {
		return data;
	}
	public void setData(String data) {
		this.data = data;
	}
	public double getVal_taxa() {
		return val_taxa;
	}
	public void setVal_taxa(double val_taxa) {
		if(val_taxa < 0)
			this.val_taxa = 0;
		else this.val_taxa = val_taxa;
	}
	public double getVal_pratos() {
		return val_pratos;
	}
	public void setVal_pratos(double val_pratos) {
		if(val_pratos < 0)
			this.val_pratos = 0;
		else this.val_pratos = val_pratos;
	}
	public double getVal_total() {
		return val_total;
	}
	public void setVal_total(double val_total) {
		if(val_total < 0)
			this.val_total = 0;
		else this.val_total = val_total;
	}
	
	
}
