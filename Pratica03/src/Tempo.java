
public class Tempo {
	private int hora, min, seg;
	
	public Tempo(int h, int m, int s) {
		setHora(h);
		setMin(m);
		setSeg(s);
	}
	
	public Tempo(int h, int m) {
		setHora(h);
		setMin(m);
	}
	
	public Tempo(int h) {
		setHora(h);
	}
	
	public void incMin() {
		int m = getMin();
		setMin(m+1);
		m = getMin();
		if(m == 0) {
			// se o valor incrementado for 0, o valor foi maior que 59
			int h = getHora();
			setHora(h+1);
		}
	}
	
	public void getTime() {
		if(getHora() > 9 && getMin() > 9 && getSeg() > 9) {			
			System.out.println(getHora() + ":" + getMin() + ":" + getSeg());
		}
		else if(getHora() <= 9 && getMin() > 9 && getSeg() > 9) {			
			System.out.println("0" + getHora() + ":" + getMin() + ":" + getSeg());
		}
		else if(getHora() > 9 && getMin() <= 9 && getSeg() > 9) {			
			System.out.println(getHora() + ":0" + getMin() + ":" + getSeg());
		}
		else if(getHora() > 9 && getMin() > 9 && getSeg() <= 9) {			
			System.out.println(getHora() + ":" + getMin() + ":0" + getSeg());
		}
		else if(getHora() <= 9 && getMin() <= 9 && getSeg() > 9) {			
			System.out.println("0" + getHora() + ":0" + getMin() + ":" + getSeg());
		}
		else if(getHora() <= 9 && getMin() > 9 && getSeg() <= 9) {			
			System.out.println("0" + getHora() + ":" + getMin() + ":0" + getSeg());
		}
		else if(getHora() > 9 && getMin() <= 9 && getSeg() <= 9) {			
			System.out.println(getHora() + ":0" + getMin() + ":0" + getSeg());
		}
		else {
			System.out.println("0" + getHora() + ":0" + getMin() + ":0" + getSeg());
		}
	}

	public int getHora() {
		return hora;
	}

	public void setHora(int hora) {
		if(hora < 0 || hora > 23) {
			this.hora = 0;
		}
		else {			
			this.hora = hora;
		}
	}

	public int getMin() {
		return min;
	}

	public void setMin(int min) {
		if(min < 0 || min > 59) {
			this.min = 0;
		}
		else {			
			this.min = min;
		}
	}

	public int getSeg() {
		return seg;
	}

	public void setSeg(int seg) {
		if(seg < 0 || seg > 59) {
			this.seg = 0;
		}
		else {			
			this.seg = seg;
		}
	}
	
	
}
