import java.util.ArrayList;

public class DadosEmpregado {
	ArrayList<Empregado> lista = new ArrayList<Empregado>();
	
	public void insere(Empregado emp) {
		if(emp != null)
			lista.add(emp);
		else 
			System.out.println("Erro ao inserir");
	}
	public Empregado busca(String cpf) {
		Empregado emp = null;
		for(Empregado objeto : this.lista) {
			if(objeto.getCpf().equals(cpf)) {
				emp = objeto;
				break;
			}
		}
		return emp;
	}
	public void remove(String cpf) {
		Empregado emp = this.busca(cpf);
		if(emp != null)
			lista.remove(emp);
		else 
			System.out.println("Erro ao remover");
	}
	public ArrayList<Empregado> buscaMaior(double salario) {
		ArrayList<Empregado> resposta = new ArrayList<Empregado>();
		for(Empregado obj : this.lista) {
			if(obj.getSalario() > salario) {
				resposta.add(obj);
			}
		}
		
		return resposta;
	}
}
