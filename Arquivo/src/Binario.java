import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Binario implements Serializable {
	public static void main (String [] args) {
		File arquivo = new File("Arquivo.txt");
		criarArquivoBinarioSerializado();
		lerArquivoBinarioSerializado();
	}
	
	private static void criarArquivoBinarioSerializado() {
		Pessoa p1 = new Pessoa(1, "Fulano", 2000, "1234");
		
		FileOutputStream fos = null;
		ObjectOutputStream oos = null;
		
		try {
			// inicializando 
			fos = new FileOutputStream("arquivo.bin");
			oos = new ObjectOutputStream(fos);
			oos.writeObject(p1); // escreve o objeto p1 no arquivo
		} catch (FileNotFoundException e) {
			System.out.println("Arquivo não encontrado");
		} catch (IOException e) {
			System.out.println("Erro ao criar arquivo");
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
	
	private static void lerArquivoBinarioSerializado() {
		Pessoa p1 = null;
		FileInputStream fis = null;
		ObjectInputStream ois = null;
		
		try {
			fis = new FileInputStream("arquivo.bin");
			ois = new ObjectInputStream(fis);
			p1 = (Pessoa)ois.readObject(); // salvando como objeto o arquivo lido 
			
			// imprimindo objeto			
			System.out.printf("Id: %2d\nNome: %s\nSálario: %.2f\nSenha: %s\n", 
					p1.getIdPessoa(), p1.getNome(), p1.getSalario(), p1.getSenha());
			System.out.println();
			System.out.println("Id: " + p1.getIdPessoa() + "\nNome: " + p1.getNome() + "\nSálario: " + p1.getSalario() + "\nSenha: " + p1.getSenha());
			
		} catch (ClassNotFoundException e) {
			System.out.println("Classe não encontrado");
		} catch (IOException e) {
			System.out.println("Erro ao criar arquivo");
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
