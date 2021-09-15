
public class Triangulo extends Bidimensional {
	private double base, altura;
	
	Triangulo(double b, double h){
		setBase(b);
		setAltura(h);
	}
	
	public double obterArea() {
		double b = getBase();
		double h = getAltura();
		return b*h;
	}

	public double getBase() {
		return base;
	}

	public void setBase(double base) {
		if(base<0)
			this.base = 0;
		else this.base = base;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		if(altura<0)
			this.altura = 0;
		else this.altura = altura;
	}
	
	
}
