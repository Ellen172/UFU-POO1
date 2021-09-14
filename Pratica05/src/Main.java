
public class Main {
	public static void main(String [] args) {
		
		
		Pedido p1 = new Pedido("137.451.457-98", "10/09/2021");
		
		System.out.println("=== Pedido 01 ===");
		System.out.println();
		System.out.println("Cpf: " + p1.getCpf());
		System.out.println("Data: " + p1.getData());
		System.out.println("Valor Taxa: " + p1.getVal_taxa());
		System.out.println("Valor Pratos: " + p1.getVal_pratos());
		System.out.println("Valor Total: " + p1.getVal_total());

		
		Sanduiche s1 = new Sanduiche("Hungaro", "Frango", "Alface", "137.451.457-98", "10/09/2021");
		p1.addPrato(s1);
		
		System.out.println();
		System.out.println("=== Pedido 01 ===");
		System.out.println();
		System.out.println("Cpf: " + p1.getCpf());
		System.out.println("Data: " + p1.getData());
		System.out.println("Valor Taxa: " + p1.getVal_taxa());
		System.out.println("Valor Pratos: " + p1.getVal_pratos());
		System.out.println("Valor Total: " + p1.getVal_total());
		System.out.println("Sanduiche: " + s1.getPao() + ", " + s1.getCarne() + ", " + s1.getSalada());
	}
}
