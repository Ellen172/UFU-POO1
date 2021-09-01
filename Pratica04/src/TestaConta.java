// Crie um programa principal que utilize um vetor de 5 contas poupança e outro vetor de 5 contas especiais.
// Receba os dados dessas contas via usuário, e teste os métodos criados.

import java.util.Scanner; // biblioteca para leitura

public class TestaConta {
	public static void main (String args[]) {
		Scanner entrada = new Scanner(System.in);
		
		ContaPoupa[] c1 = new ContaPoupa[5];
		System.out.println("\n");
		System.out.println("=== Contas Poupança ===");
		for(int i=0; i<c1.length; i++) {			
			System.out.println("Digite o cpf do cliente: ");
			String a = entrada.next();
			System.out.println("Digite o nro da conta: ");
			int n = entrada.nextInt();
			System.out.println("Digite o saldo inicial: ");
			double s = entrada.nextDouble();
			System.out.println("Digite o rendimento da conta: ");
			double r = entrada.nextDouble();
			
			c1[i] = new ContaPoupa(a, n, s, r);
			if(i%2 == 0) {
				System.out.println("Digite o saque: ");
				double sq = entrada.nextDouble();
				c1[i].saque(sq);
			}
			else {
				System.out.println("Digite o deposito: ");
				double d = entrada.nextDouble();
				c1[i].deposito(d);
			}
			
			System.out.println("\n");
			System.out.println("Cpf: " + c1[i].getCpf() + " Nro da conta: " + c1[i].getNro());
			System.out.println("Saldo: " + c1[i].getSaldo());
			c1[i].calculaNovoSaldo();
			System.out.println("Saldo com Rendimento: " + c1[i].getSaldo());
			System.out.println("\n");
		}
		
		ContaEspecial[] c2 = new ContaEspecial[5];
		System.out.println("=== Contas Especiais ===");
		for(int i=0; i<c2.length; i++) {			
			System.out.println("Digite o cpf do cliente: ");
			String a = entrada.next();
			System.out.println("Digite o nro da conta: ");
			int n = entrada.nextInt();
			System.out.println("Digite o saldo inicial: ");
			double s = entrada.nextDouble();
			System.out.println("Digite o limite da conta: ");
			double l = entrada.nextDouble();
			System.out.println("Digite o saque: ");
			double sq = entrada.nextDouble();
			
			c2[i] = new ContaEspecial(a, n, s, l);
			c2[i].saque(sq);
			
			System.out.println("\n");
			System.out.println("Cpf: " + c2[i].getCpf() + " Nro da conta: " + c2[i].getNro());
			System.out.println("Limite: " + c2[i].getLimite());
			System.out.println("Saldo: " + c2[i].getSaldo());
			System.out.println("\n");
		}
		
		entrada.close();
	}
}
