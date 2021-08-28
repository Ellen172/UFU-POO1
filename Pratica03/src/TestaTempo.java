
public class TestaTempo {
	public static void main(String [] args) {
		Tempo t1 = new Tempo(13, 59, 45);
		Tempo t2 = new Tempo(9, 49);
		Tempo t3 = new Tempo(24);
		Tempo t4 = new Tempo(t1);
		
		t1.getTime();
		t2.getTime();
		t3.getTime();
		t4.getTime();
		
		t1.incMin();
		t2.incMin();
		t3.incMin();
		t4.incMin();
		
		System.out.println();
		t1.getTime();
		t2.getTime();
		t3.getTime();
		t4.getTime();
	}
}
