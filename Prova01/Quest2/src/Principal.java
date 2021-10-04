
public class Principal {
	public static void main(String [] args) {
		Artefato a1[] = new Artefato[3];
		
		a1[0] = new Livro("Orgulho e Preconceito", "Jane Austen");
		a1[1] = new Livro("Cinderela", "Irmãos Grinm");
		a1[2] = new Artefato("Santo Graal");
		
		for(int i=0; i<a1.length; i++) {
			a1[i].imprimeNome();
		}
		
	}
}
