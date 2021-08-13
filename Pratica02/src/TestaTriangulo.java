
public class TestaTriangulo {
	public static void main(String [] args) {
		Triangulo t1 = new Triangulo();
		t1.setLado1(3.2);
		t1.setLado2(-4.3);
		t1.setLado3(4.5);
		
		System.out.println("Lado 1 = " + t1.getLado1());
		System.out.println("Lado 2 = " + t1.getLado2());
		System.out.println("Lado 3 = " + t1.getLado3());
		
		t1.alteraLado1(9.6);
		t1.alteraLado2(-1.5);
		t1.alteraLado1(1.5);
		
		System.out.println("Lado 1 = " + t1.getLado1());
		System.out.println("Lado 2 = " + t1.getLado2());
		System.out.println("Lado 3 = " + t1.getLado3());
		
		System.out.println("Perimetro = " + t1.perimetro());
		
		int res;
		res = t1.tipo();
		
		if(res == 0) {
			System.out.println("Triangulo escaleno");
		} 
		else if(res == 2) {
			System.out.println("Triangulo isosceles");
		} 
		else {
			System.out.println("Triangulo equilatero");
		}
		
	}
}	
