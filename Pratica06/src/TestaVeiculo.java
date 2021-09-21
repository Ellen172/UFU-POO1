
public class TestaVeiculo {
	public static void main(String [] args) {
		Veiculo vet[] = new Veiculo[3];
		
		vet[0] = new Caminhao("PGI3425", 1994, 25);
		vet[1] = new Onibus("GF4FDK2", 2014, 35);
		vet[2] = new Veiculo("JKJ466K", 2003);
		
		for(int i=0; i<vet.length; i++) {
			if(vet[i] instanceof Caminhao)
				((Caminhao)vet[i]).exibirDados();
			else if(vet[i] instanceof Onibus)
				((Onibus)vet[i]).exibirDados();
			else 
				vet[i].exibirDados();
			System.out.println();
		}
	}
}
