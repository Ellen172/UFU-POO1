
public class Quadrado extends Bidimensional {
	private double lado;
	
	Quadrado(double l){
		setLado(l);
	}
	
	public double obterArea(){
		double l = getLado();
		return l*l;
	}
	public void exibirDados() {
		System.out.println("Forma: Quadrado");
		System.out.println("Lado: " + getLado());
	}

	public double getLado() {
		return lado;
	}

	public void setLado(double lado) {
		if(lado < 0)
			this.lado = 0;
		else this.lado = lado;
	}
}
