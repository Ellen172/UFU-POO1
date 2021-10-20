import java.util.Scanner;
import java.util.ArrayList;
import java.io.*;

public class Principal implements Serializable{
	public static void main(String args[]) {
		Empregado vet[] = new Empregado[5];
		vet[0] = new Empregado("123.154.124-98", 2002, 1500.60);
		vet[1] = new Empregado("154.478.487-69", 1998, 1400.30);
		vet[2] = new Empregado("678.342.657-09", 2000, 780.90);
		vet[3] = new Empregado("987.464.653-82", 1999, 1900.00);
		vet[4] = new Empregado("789.456.444-09", 2005, 576.00);
		
		DadosEmpregado dados = new DadosEmpregado();
		for(int i=0; i<5; i++) {
			dados.insere(vet[i]);
		}

		buscaVet(dados);
		escrevertexto(vet);
		escreverBinario(dados);
		lerArquivoBinario();
	}
	
	private static void buscaVet(DadosEmpregado dados) {
		Empregado e = dados.busca("987.464.653-82");
		e.mostraDados();
		
		Scanner entrada = new Scanner(System.in);
		ArrayList<Empregado> lista = new ArrayList<Empregado>();
		
		System.out.println("Digite o salario desejado: ");
		double sal = entrada.nextDouble();
		lista = dados.buscaMaior(sal);
		
		for(int i=0; i<lista.size(); i++) {
			lista.get(i).mostraDados();
		}
	}
	
	private static void escrevertexto(Empregado vet[]) {
		BufferedWriter escritor = null;
		try {
			escritor = new BufferedWriter(new FileWriter(new File("DadosEmpregados")));
			
			for(int i=0; i<5; i++) {
				escritor.write(vet[i].getCpf() + " " + vet[i].getAnoNascimento() + " " + vet[i].getSalario() + "\n");
			}
			
			escritor.flush();
			escritor.close();
			
		} catch (IOException ex){
			System.out.println(ex.getMessage());
			ex.printStackTrace();
		}
	}
	
	private static void escreverBinario(DadosEmpregado dados) {
		ArrayList lista = dados.array();
		Empregado vet[] = new Empregado[5];
		
		FileOutputStream fos = null;
		ObjectOutputStream oos = null;
		
		try {
			// inicializando 
			fos = new FileOutputStream("Dados.bin");
			oos = new ObjectOutputStream(fos);
			
			for(int i=0; i<lista.size(); i++) {
				vet[i] = (Empregado) lista.get(i);
			}
			
			for(int i=0; i<vet.length; i++) {
				oos.writeObject(vet[i]);
			}
			oos.writeObject(lista); // escreve o objeto p1 no arquivo
			
		} catch (FileNotFoundException e) {
			System.out.println("Arquivo não encontrado");
		} catch (IOException e) {
			System.out.println("Erro ao criar arquivo");
			System.out.println(e.getMessage());
		} finally { 
			if (oos != null) { // verificação do arquivo não nulo
				try {
					oos.close(); // fechar o arquivo
				} catch (IOException  e) {
					System.out.println("Erro ao fechar o arquivo");
				}
			}
		}
	}
	
	private static void lerArquivoBinario() {
		Empregado vet[] = new Empregado[5];
		FileInputStream fis = null;
		ObjectInputStream ois = null;
		
		try {
			fis = new FileInputStream("Dados.bin");
			ois = new ObjectInputStream(fis);
			vet[0] = (Empregado)ois.readObject();
			vet[1] = (Empregado)ois.readObject();
			vet[2] = (Empregado)ois.readObject();
			vet[3] = (Empregado)ois.readObject();
			vet[4] = (Empregado)ois.readObject();
			
			for(int i=0; i<vet.length; i++) {
				//System.out.println(vet[i].mostraDados());
				System.out.println("Cpf: " + vet[i].getCpf() + "\nAno de Nascimento: " + vet[i].getAnoNascimento() + "\nSalario: " + vet[i].getSalario());
				System.out.println();
			}
				
		} catch (ClassNotFoundException e) {
			System.out.println("Classe não encontrado");
		} catch (IOException e) {
			System.out.println("Erro ao criar arquivo");
			System.out.println(e.getMessage());
		} finally { 
			if (ois != null) { // verificação do arquivo não nulo
				try {
					ois.close(); // fechar o arquivo
				} catch (IOException  e) {
					System.out.println("Erro ao fechar o arquivo");
				}
			}
		}
	}
}
