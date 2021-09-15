
public class Fornecedor extends Pessoa {
	private String cnpj;
	private String endereco;
	private String empresa;
	
	public Fornecedor(String n, String s, int i, String r, String ln, String c, String end, String emp) {
		super(n, s, i, r, ln);
		setCnpj(c);
		setEndereco(end);
		setEmpresa(emp);
	}
	
	public void info() {
		System.out.println("Cnpj: " + getCnpj());
		System.out.println("Empresa: " + getEmpresa());
		System.out.println("Endereco: " + getEndereco());
	}
	
	public String getCnpj() {
		return cnpj;
	}
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getEmpresa() {
		return empresa;
	}

	public void setEmpresa(String empresa) {
		this.empresa = empresa;
	}
	
	
}
