import java.util.ArrayList;

public class Empresa {
	private ArrayList<Funcionario> arr;
	
	public void addFuncionario(Funcionario f) {
		arr.add(f);
	}
	public void imprimeSalarios() {
		for(int i=0; i<arr.size(); i++) {			
			System.out.println(arr.get(i).calculaSalario());
		}
	}
}
