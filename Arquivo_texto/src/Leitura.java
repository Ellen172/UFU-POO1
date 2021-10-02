import java.io.*;

public class Leitura {
	public static void main(String [] args) {
		String linha;
		BufferedReader arquivo = null; // objeto leitor
		try {
			arquivo = new BufferedReader( new FileReader (new File ("Pessoa"))); // instanciação do objeto leitor
			
			linha = arquivo.readLine();
			while(linha != null ) {
				// Leitura de um linha do arquivo
				System.out.println(linha);
				linha = arquivo.readLine();
			}
			
			arquivo.close(); // fecha arquivo
		} catch (java.io.IOException e) {
			System.out.println("File error: " + e.toString());
		}
	}
}
