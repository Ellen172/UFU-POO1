import java.io.File;
import java.io.IOException;

public class Criar_Deletar {
	public static void main (String [] args) {
		
		// DIRETORIO
		// File file  = new File("Novo Diretorio");
		// file.mkdir(); // criar pasta
		// file.delete(); // apaga a pasta se existir
		
		// ARQUIVO
		File arquivo = new File("Arquivo.txt");
		
		try {			
			arquivo.createNewFile(); // criar arquivo
			
		} catch(IOException ex) { // erro no try
			System.out.println(ex.getMessage()); 
		}
		
		// arquivo.delete(); // apagar arquivo 
	}
}
