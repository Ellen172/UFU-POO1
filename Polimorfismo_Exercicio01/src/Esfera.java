
public class Esfera extends Tridimensional{
	private double raio;
	private double PI=3.1415;
	
	Esfera(double r){
		setRaio(r);
	}
	
	public double obterArea() {
		return 4*PI*raio*raio;
	}
	public double obterVolume() {
		return (4/3)*PI*raio*raio*raio;
	}
	public void exibirDados() {
		System.out.println("Forma: Esfera");
		System.out.println("Raio: " + getRaio());
	}

	
	public double getRaio() {
		return raio;
	}
	public void setRaio(double raio) {
		this.raio = raio;
	}
	
	
}
