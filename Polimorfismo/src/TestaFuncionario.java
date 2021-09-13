
public class TestaFuncionario {
	public static void main(String []args) {
		
		Funcionario vet[] = new Funcionario[3];
		
		// Funcionario f1 = new Funcionario("Maria", "134.457.457-78", "RJ-54.547.874", 45, 1214);
		vet[0] = new Funcionario("Maria", "134.457.457-78", "RJ-54.547.874", 45, 1214);
		
		// Atendente f2 = new Atendente("Caio", "145.421.148-87", "MG-34.145.145", 25, 4115, 2);
		// f2.computaVendas();
		vet[1] = new Atendente("Caio", "145.421.148-87", "MG-34.145.145", 25, 4115);
		// (Atendente)vet[1] : transforma na sub classe, pode chamar metodos
		if(vet[1] instanceof Atendente) // testa se é Atendente
			((Atendente)vet[1]).computaVendas();

		// Piloto f3 = new Piloto("Fernan", "124.457.487-89", "RS-54.124.569", 36, 98558, 14);
		vet[2] = new Piloto("Fernan", "124.457.487-89", "RS-54.124.569", 36, 98558, 16);
		
		for(int i=0; i<vet.length; i++)
			System.out.println("Salario = " + vet[i].calculaSalario()); 
		System.out.println();
		
		Empresa emp = new Empresa();
		emp.addFuncionario(vet[0]);
		emp.addFuncionario(vet[1]);
		emp.addFuncionario(vet[2]);
		
		emp.imprimeSalarios();
	}
}
