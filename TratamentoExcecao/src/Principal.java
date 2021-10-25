import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Principal {
	public static void main(String args[]) throws IOException {
		boolean estaCorreto = false;
		
		while(!estaCorreto) {
			try {
				BufferedReader e = new BufferedReader(new InputStreamReader(System.in));
				
				System.out.println("Entre com o numerador: ");
				int num = Integer.parseInt(e.readLine());
				System.out.println("Entre com o denominador: ");
				int den = Integer.parseInt(e.readLine());
			
				ExemploExcecao ex = new ExemploExcecao();
				ex.realizarDivisao(num, den);
				estaCorreto = true;
			}
			catch(ArithmeticException divisaoPorZero) {
				System.out.println("Erro: divisão por zero.");
			}
			catch(NumberFormatException numeroerrado) {
				System.out.println("Erro: algum numero está formatado incorretamente.");
			}
			catch (Exception e) {
				System.out.println("Ocorreu um erro: " + e.getMessage());
			}
		}
		
		
	}
}
