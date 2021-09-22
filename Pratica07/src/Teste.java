
public class Teste {
	public static void main(String [] args) {
		Funcionario vet[] = new Funcionario[5];
		
		vet[0] = new Gerente("Caio", "MT345", 1000);
		vet[1] = new Assistente("Maria", "FD09", 1000);
		vet[2] = new Assistente("Carlos", "FR987", 1000);
		vet[3] = new Vendedor("Marcos", "GR453", 1000, 20);
		vet[4] = new Vendedor("Mariana", "DFS980", 1000, 30);
		
		for(int i=0; i<vet.length; i++) {
			vet[i].mostraDados();
			System.out.println();
		}
	}
}
