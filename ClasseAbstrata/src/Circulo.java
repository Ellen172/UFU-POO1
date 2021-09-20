
public class Circulo extends Forma {
	private float raio;
	
	private static final float PI = 3.1415927f;
	@Override
	public float calculaArea() {
		// TODO Auto-generated method stub
		return PI * raio * raio;
	}
	
	public float getRaio() {
		return raio;
	}
	public void setRaio(float raio) {
		this.raio = raio;
	}
}
