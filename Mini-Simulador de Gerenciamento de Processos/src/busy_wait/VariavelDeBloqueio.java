package busy_wait;

public class VariavelDeBloqueio {
	
	public static void main(String[] args) {
		Processo p1 = new Processo();
		Processo p2 = new Processo();
		Processo p3 = new Processo();
		Processo p4 = new Processo();
		Processo p5 = new Processo();
		
		p1.start();
		p2.start();
		p3.start();
		p4.start();
		p5.start();
	}
	
	
}
