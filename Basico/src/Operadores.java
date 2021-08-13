public class Operadores {
	
	public static void main(String[] args) {
		int op1, op2, res;
		
		op1 = 10; 
		op2 = 0;
		
		if(op2!=0) {
			res = op1 / op2;
			System.out.println("O resultado e: " + res);
		} else {
			System.out.println("A operacao nao pode ser realizada");
		}
		
		int vet [] = new int [10];
		vet[0] = 1;
		vet[1] = 2;
		vet[2] = 3;
		
		for(int i=0; i<3; i++) {
			System.out.println(vet[i]);
		}
		
		int j=0;
		while(j<3) {
			System.out.println(vet[j]);
			j++;
		}
		
		char operador;
		operador = '+';
		switch(operador) {
		case '+':
			res = op1 + op2;
			System.out.println("O resultado e: " + res);
			break;
		case '-': 
			res = op1 - op2;
			System.out.println("O resultado e: " + res);
			break;
		default: 
			System.out.println("Operador invalido");
		}
	}
}