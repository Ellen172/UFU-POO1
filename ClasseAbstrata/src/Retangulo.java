
public class Retangulo extends Forma {
	private float base, altura;

	@Override
	public float calculaArea() {
		// TODO Auto-generated method stub
		return base*altura;
	}

	public float getBase() {
		return base;
	}

	public void setBase(float base) {
		this.base = base;
	}

	public float getAltura() {
		return altura;
	}

	public void setAltura(float altura) {
		this.altura = altura;
	}
	
	
}
