import java.text.*;

public class Principal {
	public static void main(String [] args) {	
		Viagem v1 = new Viagem("Caio", "123.123.123.09", "GR-23.234.231", "Havaí", "São Paulo", "Nova York", "23/11/2020", 12, 0);
		ViagensAereas v2 = new ViagensAereas("Carla", "123.123.123.09", "BH-23.234.231", "João Pessoa", "Estados Unidos", "Havaí", "15/07/2021", 15, 2, 5521, "Voooar");
		
		System.out.println(v1.retornaDados());
		System.out.println(v2.retornaDados());
		
	}
}	
