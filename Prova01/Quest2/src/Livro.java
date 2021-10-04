
public class Livro extends Artefato {
	private String autor;
	
	Livro(String n, String a){
		super(n);
		setAutor(a);
	}
	
	public void imprimeNome() {
		super.imprimeNome();
		System.out.println("Autor: " + getAutor());
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}
	
}
