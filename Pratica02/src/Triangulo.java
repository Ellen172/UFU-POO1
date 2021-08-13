
public class Triangulo {
	private double lado1, lado2, lado3;

	public double getLado1() {
		return lado1;
	}

	public void setLado1(double lado1) {
		if(lado1 > 0) {			
			this.lado1 = lado1;
		} else {
			this.lado1 = 0;
		}
	}

	public double getLado2() {
		return lado2;
	}

	public void setLado2(double lado2) {
		if(lado2 > 0) {			
			this.lado2 = lado2;
		} else {
			this.lado2 = 0;
		}
	}

	public double getLado3() {
		return lado3;
	}

	public void setLado3(double lado3) {
		if(lado3 > 0) {			
			this.lado3 = lado3;
		} else {
			this.lado3 = 0;
		}
	}
	
	public void alteraLado1(double valor) {
		if(valor > 0) {
			lado1 = valor;
		} else {
			lado1 = 0;
		}
	}
	
	public void alteraLado2(double valor) {
		if(valor > 0) {
			lado2 = valor;
		} else {
			lado2 = 0;
		}
	}
	
	public void alteraLado3(double valor) {
		if(valor > 0) {
			lado3 = valor;
		} else {
			lado3 = 0;
		}
	}
	
	public double perimetro() {
		return lado1 + lado2 + lado3;
	}
	
	// 3 = equilatero
	// 2 = isosceles
	// 0 = escaleno
	public int tipo() {
		if(lado1 == lado2 && lado2 == lado3) {
			return 3;
		}
		else if(lado1 == lado2 || lado2 == lado3 || lado1 == lado3) {
			return 2;
		}
		else {
			return 0;
		}
	}
	
}
