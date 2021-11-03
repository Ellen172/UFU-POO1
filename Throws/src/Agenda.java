
public class Agenda {

	public void mostraDetalhes (String cpf) {
		if(cpf == null) {
			throw new NullPointerException("A chave informada eh nula");
		} else {
			// comandos para realizar uma busca 
			System.out.println("Os dados foram mostrados com sucesso!");
		}
	}
}
