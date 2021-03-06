
public class Circulo extends Bidimensional{
	private double raio;
	
	Circulo(double r){
		setRaio(r);
	}
	
	public double obterArea() {
		double r = getRaio();
		return 3.14*r*r;
	}
	public void exibirDados() {
		System.out.println("Forma: Circulo");
		System.out.println("Raio: " + getRaio());
	}

	public double getRaio() {
		return raio;
	}

	public void setRaio(double raio) {
		if(raio<0)
			this.raio = 0;
		else this.raio = raio;
	}
}
