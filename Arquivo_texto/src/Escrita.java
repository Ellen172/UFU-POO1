import java.io.*;

public class Escrita {
	public static void main(String [] args) {
		Pessoa p1 = new Pessoa("Caio", "212.324.423-09");
		Pessoa p2 = new Pessoa("Beatriz", "145.248.953-45");
		
		BufferedWriter escritor = null; // objeto descritor
		try {
			escritor = new BufferedWriter(new FileWriter(new File("Pessoa"))); // instanciação do obj descritor
			
			// escrita no arquivo
			escritor.write("Pessoa 1\nNome: " + p1.getNome() + "\nCpf: " + p1.getCpf() + "\n");
			escritor.write("Pessoa 2\nNome: " + p2.getNome() + "\nCpf: " + p2.getCpf() + "\n");

			escritor.flush(); // descarrega buffer
			escritor.close(); // fecha descritor
		} catch(IOException e) {
			e.printStackTrace();
		}
	}
}
