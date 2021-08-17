
public class TestaConta {
	public static void main(String args[]) {
		Conta c1 = new Conta("Ellen", 3000, -12);
		System.out.println("Saldo: " + c1.getSaldo());
		
		Conta c2 = new Conta(1010);
		c2 = new Conta("Ana", 234, 33); 
		// Substitui os elementos de c2 já armazenados
		
		
	}
}
