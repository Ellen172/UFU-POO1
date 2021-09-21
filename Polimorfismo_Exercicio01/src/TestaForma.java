
public class TestaForma {
	public static void main(String args[]) {
		Forma vet[] = new Forma[6];
		
		vet[0] = new Circulo(3.2);
		vet[1] = new Quadrado(4);
		vet[2] = new Triangulo(4, 5.2);
		vet[3] = new Esfera(4.3);
		vet[4] = new Cubo(3.5);
		vet[5] = new Tetraedro(3.2, 2.6, 7);
		
		for(int i=0; i<vet.length; i++) {
			if(vet[i] instanceof Bidimensional) {
				double a;
				if(vet[i] instanceof Circulo) {
					((Circulo)vet[i]).exibirDados();
					 a = ((Circulo)vet[i]).obterArea();
				 }
				 else if(vet[i] instanceof Quadrado) {
					 ((Quadrado)vet[i]).exibirDados();
					 a = ((Quadrado)vet[i]).obterArea();
				 }
				 else if(vet[i] instanceof Triangulo) {
					 ((Triangulo)vet[i]).exibirDados();
					 a = ((Triangulo)vet[i]).obterArea();
				 }
				 else {
					 a = 0;
				 }
				System.out.println("Area: " + a);
			}
			else if(vet[i] instanceof Tridimensional) {
				double a, v;
				if(vet[i] instanceof Esfera) {
					((Esfera)vet[i]).exibirDados();
					a = ((Esfera)vet[i]).obterArea();
					v = ((Esfera)vet[i]).obterVolume();
				}
				else if(vet[i] instanceof Cubo) {
					((Cubo)vet[i]).exibirDados();
					a = ((Cubo)vet[i]).obterArea();
					v = ((Cubo)vet[i]).obterVolume();
				}
				else if(vet[i] instanceof Tetraedro) {
					((Tetraedro)vet[i]).exibirDados();
					a = ((Tetraedro)vet[i]).obterArea();
					v = ((Tetraedro)vet[i]).obterVolume();
				}
				else {
					v = 0;
					a = 0;
				}
				System.out.println("Area: " + a);
				System.out.println("Volume: " + v);
			}
			System.out.println();
		}
	}
}
