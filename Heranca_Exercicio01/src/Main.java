
public class Main {
	public static void main(String [] args) {
		Cliente c1 = new Cliente("Ana", "Souza", 45, "MG-20.154.145", "Brasil", "135.541.47", "Rua dos Patos, 345 - Jardim Horlandia");
		c1.infoPessoal();
		c1.info();
		System.out.println("\n");
		Fornecedor f1 = new Fornecedor("Luiz Gustavo", "Novaes", 32, "MG-78.908.234", "Brasil", "123.548.74", "Av. Caio Castro, 1098 - Centro", "Melhor do Mundo");
		f1.infoPessoal();
		f1.info();
	}
}
