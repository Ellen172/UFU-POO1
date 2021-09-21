
public class Cubo extends Tridimensional{
	private double lado;
	
	Cubo(double l){
		setLado(l);
	}
	
	public double obterArea() {
		return 6*lado*lado;
	}
	public double obterVolume() {
		return lado*lado*lado;
	}
	public void exibirDados() {
		System.out.println("Forma: Cubo");
		System.out.println("Lado: " + getLado());
	}

	
	public double getLado() {
		return lado;
	}
	public void setLado(double lado) {
		this.lado = lado;
	}
	
	
}
