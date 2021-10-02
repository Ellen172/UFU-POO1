import java.io.*;

public class Leitura {
	public static void main(String [] args) {
		ObjectInputStream leitorObj = null;
		FileInputStream leitorArquivo = null;
		try {
			leitorArquivo = new FileInputStream("Pessoa");
			leitorObj = new ObjectInputStream(leitorArquivo);
			Object x = (Object)leitorObj.readObject();
			
			//System.out.println(x);
			
		} catch (EOFException e) {
			try {
				if (leitorArquivo != null) leitorArquivo.close();
			} catch(IOException ex) {
				System.out.println(e.getMessage());
			} catch(Exception ex) {
				System.out.println(e.getMessage());
			} finally {
				try {
					if (leitorArquivo != null) leitorArquivo.close();
				} catch (Exception e) {
					System.out.println(e.getMessage());
				}
			}
		}
	}
}
