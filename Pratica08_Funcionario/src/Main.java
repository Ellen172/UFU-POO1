import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		ArrayList<Funcionario> func = new ArrayList<Funcionario>();
		Scanner entrada = new Scanner(System.in);
		
		int x = 5;
		while(x != 0) {
			System.out.println("Escolha a opção desejada: ");
			System.out.println("1 - Inserir Funcionario");
			System.out.println("0 - Encerrar Programa");
			x = entrada.nextInt();
			
			if(x == 1) {
				int y = 5;
				while(y<1 || y>2) {
					System.out.println("Escolha qual funcionario será inserido:");
					System.out.println("1 - Piloto");
					System.out.println("2 - Atendente");
					y = entrada.nextInt();
					
					if(y == 1) {
						System.out.println("Insira o nome: ");
						String nome = entrada.next();
						System.out.println("Insira o cpf: ");
						String cpf = entrada.next();
						System.out.println("Insira o rg: ");
						String rg = entrada.next();
						System.out.println("Insira a idade: ");
						int idade = entrada.nextInt();
						System.out.println("Insira a matricula: ");
						int mat = entrada.nextInt();
						double salBase = 1200;
						System.out.println("Insira o n° de horas trabalhadas: ");
						int nHoras = entrada.nextInt();
						Piloto p = new Piloto(nome, cpf, rg, idade, mat, salBase, nHoras);
						func.add(p);
					}
					else if(y == 2) {
						System.out.println("Insira o nome: ");
						String nome = entrada.next();
						System.out.println("Insira o cpf: ");
						String cpf = entrada.next();
						System.out.println("Insira o rg: ");
						String rg = entrada.next();
						System.out.println("Insira a idade: ");
						int idade = entrada.nextInt();
						System.out.println("Insira a matricula: ");
						int mat = entrada.nextInt();
						double salBase = 1000;
						System.out.println("Insira o n° de vendas: ");
						int nVendas = entrada.nextInt();
						Atendente a = new Atendente(nome, cpf, rg, idade, mat, salBase, nVendas);
						func.add(a);
						
					}
					else {
						System.out.println("Opção inválida!");
					}
					
				}
				
				
				
			}
			else if(x != 0) {
				System.out.println("Opção inválida!");
			}
		}
		
		// inserindo no arquivo 
		
		BufferedWriter escritor = null;
		try {
			escritor = new BufferedWriter(new FileWriter(new File("Funcionarios"))); // iniciando arquivo	
			
			for(int i=0; i<func.size(); i++) {
				escritor.write("Nome: " + func.get(i).getNome() + "\n");
				escritor.write("Cpf: " + func.get(i).getCpf() + "\n");
				escritor.write("Rg: " + func.get(i).getRg() + "\n");
				escritor.write("Idade: " + func.get(i).getIdade() + "\n");
				escritor.write("Matricula: " + func.get(i).getMatricula() + "\n");
				if(func.get(i) instanceof Piloto) {
					escritor.write("Numero de horas: " + ((Piloto)func.get(i)).getnHoras() + "\n");
					double sal = ((Piloto)func.get(i)).calculaSalario();
					String str = Double.toString(sal);
					escritor.write("Salario: R$ " + str + "\n");
				}
				if(func.get(i) instanceof Atendente) {
					escritor.write("Numero de vendas: " + ((Atendente)func.get(i)).getnVendas() + "\n");
					double sal = ((Atendente)func.get(i)).calculaSalario();
					String str = Double.toString(sal);
					escritor.write("Salario: R$ " + str + "\n");
				}
				escritor.write("\n");
				
			}
			
			escritor.flush(); // descarrega o buffer de escrita
			escritor.close(); // fecha o arquivo
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
