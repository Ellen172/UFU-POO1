import java.io.*;

public class Texto {
	public static void main (String [] args) {
		File arquivo = new File("arquivo.txt");
		
		try {		
			arquivo.createNewFile(); // criar arquivo
			
			// ESCREVER NO ARQUIVO 
			
			// FileWriter escrever = new FileWriter(arquivo);
			// BufferedWriter escreverbuff = new BufferedWriter(escrever);
			BufferedWriter escrever = new BufferedWriter(new FileWriter(arquivo));
			
			escrever.write("Escrevendo no documento");
			escrever.close(); // fecha o arquivo e salva alterações
			
			// LER ARQUIVO
			
			// FileReader ler = new FileReader(arquivo); // no lugar de arquivo pode ser passado "arquivo.txt"
			// BufferedReader lerbuffer = new BufferedReader(ler);
			BufferedReader ler = new BufferedReader(new FileReader(arquivo));
			
			String linha = ler.readLine(); // le a primeira linha do arquivo
			while(linha != null) {
				System.out.println(linha);
				linha = ler.readLine(); // le cada linha do arquivo
			}
			
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
		
		
	}
}
