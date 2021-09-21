
public class Veiculo {
	private String placa;
	private int ano;
	
	Veiculo(){
		
	}
	Veiculo(String p, int a){
		setPlaca(p);
		setAno(a);
	}
	
	public void exibirDados() {
		System.out.println("Placa: " + getPlaca());
		System.out.println("Ano: " + getAno());
	}
	public String getPlaca() {
		return placa;
	}
	public void setPlaca(String placa) {
		this.placa = placa;
	}
	public int getAno() {
		return ano;
	}
	public void setAno(int ano) {
		this.ano = ano;
	}
	public void setAno(String ano) {
		// verificar
	}
	
	
}
