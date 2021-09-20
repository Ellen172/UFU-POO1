
public abstract class Forma {
	private String cor;
	
	public void alteraCor(String cor) {
		this.cor = cor;
	}
	
	public abstract float calculaArea();

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}
	
	
}
