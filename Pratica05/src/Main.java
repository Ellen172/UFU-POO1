import java.util.Scanner;

public class Main {
	public static void main(String [] args) {
		Pedido p[] = new Pedido[5];
		int i=-1;
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("==== MENU ====");
		System.out.println("1 - Ver custo dos ingredientes");
		System.out.println("2 - Adicionar pedido");
		System.out.println("3 - Adicionar prato");
		System.out.println("4 - Imprimir pedido");
		System.out.println("0 - Finalizar programa");
		int x = entrada.nextInt();
		
		while(x != 0) {	
			if(x == 1) {
				System.out.println();
				System.out.println("=== Custos ===");
				System.out.println();
				System.out.println("Sanduiches: ");
				System.out.println("Pão Hungaro = R$ 7,30");
				System.out.println("Pão Francês = R$ 4,50");
				System.out.println("Carne de Frango = R$ 2,90");
				System.out.println("Carne de Porco = R$ 5,40");
				System.out.println("Carne de Vaca = R$ 6,50");
				System.out.println("Salada de Tomate = R$ 2,00");
				System.out.println("Salada de Alface = R$ 1,20");
				System.out.println();
				System.out.println("Pizzas: ");
				System.out.println("Molho de Tomate = R$ 14,20");
				System.out.println("Molho de Maionese = R$ 9,60");
				System.out.println("Molho de Chocolate = R$ 6,80");
				System.out.println("Recheio de Mussarela = R$ 18,40");
				System.out.println("Recheio de Calabresa = R$ 12,50");
				System.out.println("Recheio de Frango = R$ 19,90");
				System.out.println("Recheio de Morango = R$ 8,50");
				System.out.println("Borda de Catupiry = R$ 6,20");
				System.out.println("Borda de Cheddar = R$ 8,50");
				System.out.println("\n");
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
					// define pão
					String pa;
					System.out.println("Escolha o pão: ");
					System.out.println("1 - Hungaro = R$ 7,30");
					System.out.println("2 - Francês = R$ 4,50");
					int xpa = entrada.nextInt();
					while(xpa<0 || xpa>2) {
						System.out.println("Opção Inválida!");
						System.out.println("Escolha o pão: ");
						System.out.println("1 - Hungaro = R$ 7,30");
						System.out.println("2 - Francês = R$ 4,50");					
						xpa = entrada.nextInt();
					}
					if(xpa == 1) {
						pa = "Hungaro";
						cs += 7.30;
					} else {
						pa = "Francês";
						cs += 4.50;
					} 
					// define carne
					String ca;
					System.out.println("Escolha a carne: ");
					System.out.println("1 - Frango = R$ 2,90");
					System.out.println("2 - Porco = R$ 5,40");
					System.out.println("3 - Vaca = R$ 6,50");
					int xca = entrada.nextInt();
					while(xca<0 || xca>3) {
						System.out.println("Opção Inválida!");
						System.out.println("Escolha a carne: ");
						System.out.println("1 - Frango = R$ 2,90");
						System.out.println("2 - Porco = R$ 5,40");
						System.out.println("3 - Vaca = R$ 6,50");
						xca = entrada.nextInt();
					}
					if(xca == 1) {
						ca = "Frango";
						cs += 2.9;
					} else if(xca == 2) {
						ca = "Porco";
						cs += 5.4;
					} else {
						ca = "Vaca";
						cs += 6.5;
					}
					// define salada
					String sa;
					System.out.println("Escolha a salada: ");
					System.out.println("1 - Tomate = R$ 2,00");
					System.out.println("2 - Alface = R$ 1,20");
					int xsa = entrada.nextInt();
					while(xsa<0 || xsa>2) {
						System.out.println("Opção Inválida!");
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
					double pr = cs + (cs*0.2); // define preço
					// inicializa sanduiche
					Sanduiche s = new Sanduiche(pa, ca, sa, cs, pr);
					p[i].addPrato(s);
				}
				if(y == 2) {
					// define molho
					String mo;
					System.out.println("Escolha o molho: ");
					System.out.println("1 - Tomate");
					System.out.println("2 - Maionese");
					System.out.println("3 - Chocolate");
					int xmo = entrada.nextInt();
					while(xmo<0 || xmo>3) {
						System.out.println("Opção Inválida!");
						System.out.println("Escolha o molho: ");
						System.out.println("1 - Tomate");
						System.out.println("2 - Maionese");
						System.out.println("3 - Chocolate");
						xmo = entrada.nextInt();
					}
					if(xmo == 1) {
						mo = "Tomate";
						cs += 14.2;
					} else if(xmo == 2) {
						mo = "Maionese";
						cs += 9.6;
					} else {
						mo = "Chocolate";
						cs += 6.8;
					}
					// define recheio
					String re;
					System.out.println("Escolha o recheio: ");
					System.out.println("1 - Mussarela");
					System.out.println("2 - Calabresa");
					System.out.println("3 - Frango");
					System.out.println("4 - Morango");
					int xre = entrada.nextInt();
					while(xre<0 || xre>4) {
						System.out.println("Opção Inválida!");
						System.out.println("Escolha o recheio: ");
						System.out.println("1 - Mussarela");
						System.out.println("2 - Calabresa");
						System.out.println("3 - Frango");
						System.out.println("4 - Morango");
						xre = entrada.nextInt();
					}
					if(xre == 1) {
						re = "Mussarela";
						cs += 18.4;
					} else if(xre == 2) {
						re = "Calabresa";
						cs += 12.5;
					} else if(xre == 3) {
						re = "Frango";
						cs += 19.9;
					} else {
						re = "Morango";
						cs += 8.5;
					}
					// define borda
					String bo;
					System.out.println("Escolha a borda: ");
					System.out.println("1 - Catupiry");
					System.out.println("2 - Cheddar");
					int xbo = entrada.nextInt();
					while(xbo<0 || xbo>2) {
						System.out.println("Opção Inválida!");
						System.out.println("Escolha a borda: ");
						System.out.println("1 - Catupiry");
						System.out.println("2 - Cheddar");
						xbo = entrada.nextInt();
					}
					if(xbo == 1) {
						bo = "Caputiry";
						cs += 6.2;
					} else {
						bo = "Cheddar";
						cs += 8.5;
					}
					double pr = cs + (cs*0.4); // define preço
					// inicializa pizza
					Pizza pz = new Pizza(mo, re, bo, cs, pr);
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
					System.out.println("Não há pedidos");
				}
			}
			
			System.out.println();
			System.out.println("==== MENU ====");
			System.out.println("1 - Ver custo dos ingredientes");
			System.out.println("2 - Adicionar pedido");
			System.out.println("3 - Adicionar prato");
			System.out.println("4 - Imprimir pedido");
			System.out.println("0 - Finalizar programa");
			x = entrada.nextInt();
		}

	}
}
