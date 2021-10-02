import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Scanner;

public class Pedido {
	private String cod;
	private double total_pag;
	private int tipo_pag;
	
	Scanner entrada = new Scanner(System.in);
	DecimalFormat df = new DecimalFormat("R$ #,###0.00");	
	ArrayList<Produto> itens = new ArrayList<Produto>();
	
	Pedido(String c){
		setCod(c);
	}
	public void inserePag() {
		int t=0;
		while(t<1 || t>3) {
			System.out.println("Insira a forma de pagamento: ");
			System.out.println("1 - Dinheiro");
			System.out.println("2 - Cheque");
			System.out.println("3 - Cartão");
			t = entrada.nextInt();
			setTipo_pag(t);
			
			if(t == 1) {
				System.out.println("Insira o valor recebido: ");
				double r = entrada.nextDouble();
				System.out.println("Troco = " + df.format(r-getTotal_pag()));
			}
			else if(t == 2) {
				System.out.println("Pagamento realizado com Cheque!");
			}
			else if(t == 3) {
				System.out.println("Pagamento realizado com Cartão!");
			}
			else {
				System.out.println("Valor inserido incorreto!");
			}
		}
	}
	public void mostraDados() {
		System.out.println("Cod-" + getCod());
		for(int i=0; i<itens.size(); i++) {
			System.out.println(itens.get(i).getNome() + "\t" + df.format(itens.get(i).getPreco()));
		}
		System.out.println();
		System.out.println("Total da Compra: " + df.format(getTotal_pag()));
	}
	
	public void addProduto(Produto p) {
		p.dec_qtd();
		itens.add(p);
		total_pag += p.getPreco();
	}
	
	public int getTipo_pag() {
		return tipo_pag;
	}
	public void setTipo_pag(int tipo_pag) {
		// 1-dinheiro; 2-cheque; 3-cartão
		if(tipo_pag<1 || tipo_pag>3)
			this.tipo_pag = 1;
		else this.tipo_pag = tipo_pag;
	}
	public String getCod() {
		return cod;
	}
	public void setCod(String cod) {
		this.cod = cod;
	}

	public double getTotal_pag() {
		return total_pag;
	}

	public void setTotal_pag(double total_pag) {
		if(total_pag<0)
			this.total_pag = 0;
		else this.total_pag = total_pag;
	}
}
