import java.util.Scanner;

public class Pedido extends Prato {
	private String cpf;
	private String data;
	private double val_taxa;
	private double val_pratos;
	private double val_total;
	
	Pedido(String c, String d){
		super(0, 0, 0);
		setCpf(c);
		setData(d);
		setVal_taxa(0);
		setVal_pratos(0);
		setVal_total(0);
	}
	
	public void addPrato(int tp) {
		Scanner entrada = new Scanner(System.in);
		setTipo(tp);
		int aux = getTipo();
		if(aux == 1) {
			System.out.println("Digite qual o molho: ");
			String m = entrada.next();
			System.out.println("Digite qual a borda: ");
			String b = entrada.next();
			System.out.println("Digite o recheio: ");
			String r = entrada.next();
		}
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
