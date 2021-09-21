
public class Tetraedro extends Tridimensional{
	private double lado, altura, Abase;
	
	Tetraedro(double l, double a, double b){
		setLado(l);
		setAltura(a);
		setAbase(b);
	}
	
	public double obterArea() {
		return lado*lado*Math.sqrt(3);
	}
	public double obterVolume() {
		return (Abase*altura)/3;
	}
	public void exibirDados() {
		System.out.println("Forma: Tetraedro");
		System.out.println("Lado: " + getLado());
		System.out.println("Altura: " + getAltura());
		System.out.println("Area da Base: " + getAbase());
	}

	
	public double getLado() {
		return lado;
	}
	public void setLado(double lado) {
		this.lado = lado;
	}
	public double getAltura() {
		return altura;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}
	public double getAbase() {
		return Abase;
	}
	public void setAbase(double abase) {
		Abase = abase;
	}
	
}
