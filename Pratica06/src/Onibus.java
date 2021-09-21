
public class Onibus extends Veiculo {
	private int assentos;
	
	Onibus(String p, int a, int as){
		super(p, a);
		setAssentos(as);
	}

	public void exibirDados() {
		super.exibirDados();
		System.out.println("Assentos: " + getAssentos());
	}
	
	public int getAssentos() {
		return assentos;
	}
	public void setAssentos(int assentos) {
		this.assentos = assentos;
	}
	
}
