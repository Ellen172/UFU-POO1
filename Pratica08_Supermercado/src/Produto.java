
public class Produto {
	private String nome;
	private double preco;
	private int qtd;
	
	Produto(String n, double p, int q){
		setNome(n);
		setPreco(p);
		setQtd(q);
	}
	
	public void dec_qtd() {
		qtd--;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		if(preco<0)
			this.preco = 1.99; // preco minimo dos produtos
		else this.preco = preco;
	}
	public int getQtd() {
		return qtd;
	}
	public void setQtd(int qtd) {
		if(qtd<0)
			this.qtd = 0;
		else this.qtd = qtd;
	}
	public String getNome() {
		return nome;
	}
	public boolean setNome(String nome) {
		if(nome.length()<0) {			
			return false;
		}
		else {
			this.nome = nome;
			return true;
		}
	}	
}
