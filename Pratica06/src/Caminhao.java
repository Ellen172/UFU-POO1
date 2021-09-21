
public class Caminhao extends Veiculo {
	private int eixos;

	Caminhao(String p, int a, int e){
		super(p, a);
		setEixos(e);
	}
	
	public void exibirDados() {
		super.exibirDados();
		System.out.println("Eixos: " + getEixos());
	}
	
	public int getEixos() {
		return eixos;
	}
	public void setEixos(int eixos) {
		this.eixos = eixos;
	}
	
	
}
