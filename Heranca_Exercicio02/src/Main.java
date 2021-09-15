import java.util.ArrayList;

public class Main {
	public static void main(String []args) {
		Horista p1 = new Horista("Carlos Antonio Souza", "GBF1245", 55, 45);
		DedExclusiva p2 = new DedExclusiva("Mariana Abdala", "FMG8797", 34, 1542.23);
		Horista p3 = new Horista("Maria Carla Fernandes", "NHG2548", 48, 12);

		ArrayList <Horista> prof_hora = new ArrayList<>();
		ArrayList <DedExclusiva> prof_ex = new ArrayList<>();
		
		prof_hora.add(p1);
		prof_ex.add(p2);
		prof_hora.add(p3);
		
		System.out.println("=== Professores Horistas ===");
		for(int i=0; i<prof_hora.size(); i++) {
			System.out.println("Nome: " + prof_hora.get(i).getNome());
			System.out.println("Matricula: " + prof_hora.get(i).getMatricula());
			System.out.println("Idade: " + prof_hora.get(i).getIdade());
			System.out.println("Horas Trabalhadas: " + prof_hora.get(i).getHoras());
			System.out.println("Salario: " + prof_hora.get(i).getSalario());
			System.out.println();
		}
		System.out.println("=== Professores Dedicacao Exclusiva ===");
		for(int i=0; i<prof_ex.size(); i++) {
			System.out.println("Nome: " + prof_ex.get(i).getNome());
			System.out.println("Matricula: " + prof_ex.get(i).getMatricula());
			System.out.println("Idade: " + prof_ex.get(i).getIdade());
			System.out.println("Salario: " + prof_ex.get(i).getSalario());
			System.out.println();
		}
	}
}
