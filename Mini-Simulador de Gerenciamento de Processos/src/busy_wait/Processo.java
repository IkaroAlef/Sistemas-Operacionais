package busy_wait;

public class Processo implements Runnable{
	
	int pid;
	
	static int pidCount = 1;
	static int turn = 0;
	
	public Processo(){
		pid = pidCount++;
	}
	
	public void tryRC(){
		while(turn == 1){
			System.out.println("O processo P"+pid+"esta tentando entrar na RC");
		}
		turn=1;
	}
	
	public void enterRC(){
		System.out.println("O processo P"+pid+" entrou na RC");
	}
	
	public outRC(){
		
	}

	@Override
	public void run() {
		this.tryRC();
		this.enterRC();
		
		this.outRC();
		
	}
	
	
}
