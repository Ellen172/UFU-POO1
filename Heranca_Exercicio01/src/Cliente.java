
public class Cliente extends Pessoa{
		private String cpf;
		private String endereco;
		
		public Cliente(String n, String s, int i, String r, String ln, String c, String end) {
			super(n, s, i, r, ln);
			setCpf(c);
			setEndereco(end);
		}
		
		public void info() {
			System.out.println("Cpf: " + getCpf());
			System.out.println("Endereco: " + getEndereco());
		}
		
		public String getCpf() {
			return cpf;
		}
		public void setCpf(String cpf) {
			this.cpf = cpf;
		}
		public String getEndereco() {
			return endereco;
		}
		public void setEndereco(String endereco) {
			this.endereco = endereco;
		}
}
