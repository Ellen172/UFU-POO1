import java.io.*;

public class Escrita implements Serializable{
	public static void main(String [] args) {
		Pessoa p1 = new Pessoa("Caio", "212.324.423-09");
		Pessoa p2 = new Pessoa("Beatriz", "145.248.953-45");
		
		FileOutputStream escritorArquivo = null;
		ObjectOutputStream escritorObj = null;
		
		try {
			escritorArquivo = new FileOutputStream("Pessoa");
			escritorObj = new ObjectOutputStream(escritorArquivo);
			
			escritorObj.writeObject("Pessoa 1\nNome: " + p1.getNome() + "\nCpf: " + p1.getCpf() + "\n");
			escritorObj.writeObject("Pessoa 2\nNome: " + p2.getNome() + "\nCpf: " + p2.getCpf() + "\n");

		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
		} catch (IOException e) {
			System.out.println(e.getMessage());
		} finally {
			try {
				if (escritorArquivo != null ) escritorArquivo.close();
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}
 	}
}
