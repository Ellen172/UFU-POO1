import java.util.Scanner;

public class Main {
	public static void main(String [] args) {
		Pedido p[] = new Pedido[5];
		int i=-1;
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("==== MENU ====");
		System.out.println("1 - Ver cardapio");
		System.out.println("2 - Adicionar pedido");
		System.out.println("3 - Adicionar prato");
		System.out.println("4 - Imprimir pedido");
		System.out.println("0 - Finalizar programa");
		int x = entrada.nextInt();
		
		while(x != 0) {	
			if(x == 1) {
				System.out.println();
				System.out.println("=== Cardapio ===");
				System.out.println();
				System.out.println("Sanduiches: ");
				System.out.println("P�o Hungaro = R$ 7,30");
				System.out.println("P�o Franc�s = R$ 4,50");
				System.out.println("Carne de Frango = R$ 2,98");
				System.out.println("Carne de Porco = R$ 5,40");
				System.out.println("Carne de Vaca = R$ 6,55");
				System.out.println("Salada de Tomate = R$ 2,00");
				System.out.println("Salada de Alface = R$ 1,20");
				System.out.println();
				System.out.println("Pizzas: ");
				System.out.println("Molho de Tomate = R$ 14,25");
				System.out.println("Molho de Maionese = R$ 9,65");
				System.out.println("Molho de Chocolate = R$ 6,87");
				System.out.println("Recheio de Mussarela = R$ 18,45");
				System.out.println("Recheio de Calabresa = R$ 12,54");
				System.out.println("Recheio de Frango = R$ 19,99");
				System.out.println("Recheio de Morango = R$ 8,54");
				System.out.println("Borda de Catupiry = R$ 6,24");
				System.out.println("Borda de Cheddar = R$ 8,54");
				System.out.println("\n\n");
			}
			
			else if(x == 2) {
				System.out.println("Insira o cpf: ");
				String c = entrada.next();
				System.out.println("Insira a data: ");
				String d = entrada.next();
				i++;
				p[i] = new Pedido(c, d);
			}
			
			else if(x == 3) {
				double cs = 0.0;
				System.out.println("Escolha o prato: ");
				System.out.println("1 - Sanduiche");
				System.out.println("2 - Pizza");
				int y = entrada.nextInt();
				
				if(y == 1) {
					// define p�o
					String pa;
					System.out.println("Escolha o p�o: ");
					System.out.println("1 - Hungaro = R$ 7,30");
					System.out.println("2 - Franc�s = R$ 4,50");
					int xpa = entrada.nextInt();
					while(xpa<0 || xpa>2) {
						System.out.println("Op��o Inv�lida!");
						System.out.println("Escolha o p�o: ");
						System.out.println("1 - Hungaro = R$ 7,30");
						System.out.println("2 - Franc�s = R$ 4,50");					
						xpa = entrada.nextInt();
					}
					if(xpa == 1) {
						pa = "Hungaro";
						cs += 7.30;
					} else {
						pa = "Franc�s";
						cs += 4.50;
					} 
					// define carne
					String ca;
					System.out.println("Escolha a carne: ");
					System.out.println("1 - Frango = R$ 2,98");
					System.out.println("2 - Porco = R$ 5,40");
					System.out.println("3 - Vaca = R$ 6,55");
					int xca = entrada.nextInt();
					while(xca<0 || xca>3) {
						System.out.println("Op��o Inv�lida!");
						System.out.println("Escolha a carne: ");
						System.out.println("1 - Frango = R$ 2,98");
						System.out.println("2 - Porco = R$ 5,40");
						System.out.println("3 - Vaca = R$ 6,55");
						xca = entrada.nextInt();
					}
					if(xca == 1) {
						ca = "Frango";
						cs += 2.98;
					} else if(xca == 2) {
						ca = "Porco";
						cs += 5.40;
					} else {
						ca = "Vaca";
						cs += 6.55;
					}
					// define salada
					String sa;
					System.out.println("Escolha a salada: ");
					System.out.println("1 - Tomate = R$ 2,00");
					System.out.println("2 - Alface = R$ 1,20");
					int xsa = entrada.nextInt();
					while(xsa<0 || xsa>2) {
						System.out.println("Op��o Inv�lida!");
						System.out.println("Escolha a salada: ");
						System.out.println("1 - Tomate = R$ 2,00");
						System.out.println("2 - Alface = R$ 1,20");
						xsa = entrada.nextInt();
					}
					if(xsa == 1) {
						sa = "Tomate";
						cs += 2;
					} else {
						sa = "Alface";
						cs += 1.2;
					}
					double pr = cs + (cs*0.2);
					System.out.println("cs = " + cs);
					System.out.println("pr = " + pr);
					Sanduiche s = new Sanduiche(pa, ca, sa, cs, pr);
					s.imprimePreco();
					p[i].addPrato(s);
				}
				if(y == 2) {
					System.out.println("Escolha o molho: ");
					System.out.println("Tomate = R$ 14,25");
					System.out.println("Maionese = R$ 9,65");
					System.out.println("Chocolate = R$ 6,87");
					String mo = entrada.next();
					System.out.println("Escolha o recheio: ");
					System.out.println("Mussarela = R$ 18,45");
					System.out.println("Calabresa = R$ 12,54");
					System.out.println("Frango = R$ 19,99");
					System.out.println("Morango = R$ 8,54");
					String re = entrada.next();
					System.out.println("Escolha a borda: ");
					System.out.println("Catupiry = R$ 6,24");
					System.out.println("Cheddar = R$ 8,54");
					String bo = entrada.next();
					Pizza pz = new Pizza(mo, re, bo);
					p[i].addPrato(pz);
				}
			}
			
			if(x == 4) {
				if(i >= 0) {
					System.out.println();
					System.out.println("=== Pedido " + (i+1) + " ===");
					System.out.println();
					System.out.println("Cpf: " + p[i].getCpf());
					System.out.println("Data: " + p[i].getData());
					System.out.println("Valor Taxa: " + p[i].getVal_taxa());
					System.out.println("Valor Pratos: " + p[i].getVal_pratos());
					System.out.println("Valor Total: " + p[i].getVal_total());
					
					System.out.println("Sanduiches: ");
					p[i].imprimeSands();
					System.out.println("Pizzas: ");
					p[i].imprimePizzas();
				}
				else {
					System.out.println("N�o h� pedidos");
				}
			}
			
			
			System.out.println();
			System.out.println("==== MENU ====");
			System.out.println("1 - Ver cardapio");
			System.out.println("2 - Adicionar pedido");
			System.out.println("3 - Adicionar prato");
			System.out.println("4 - Imprimir pedido");
			System.out.println("0 - Finalizar programa");
			x = entrada.nextInt();
		}

	}
}
