import java.util.Scanner;
import java.util.ArrayList;
import java.io.*;

public class Principal {
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
		
		// escrevendo text
		BufferedWriter escritor = null;
		try {
			escritor = new BufferedWriter(new FileWriter(new File("DadosEmpregados")));
			
			for(int i=0; i<5; i++) {
				escritor.write(vet[i].getCpf() + " " + vet[i].getAnoNascimento() + " " + vet[i].getSalario() + "\n");
			}
			
			escritor.flush();
			escritor.close();
			
		} catch (IOException ex){
			ex.printStackTrace();
		}
		
		// escrevendo binario
		
		
	}
}
