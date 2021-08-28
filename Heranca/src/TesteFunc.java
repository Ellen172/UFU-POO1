
public class TesteFunc {
	public static void main(String args[]) {
		
		FuncComiss f1 = new FuncComiss("Elaine", 0.05, 1000);
		System.out.println("Salario " + f1.getNome() + " : " + f1.calculaSalario());
		
		FuncComissAss f2 = new FuncComissAss("Ana Maria", 0.05, 1000, 100);
		System.out.println("Salario " + f2.getNome() + " : " + f2.calculaSalario());
	}
}
