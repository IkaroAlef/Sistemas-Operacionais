package busy_wait;

public class Processo extends Thread{
	
	int pid;
	
	static int pidCount = 1;
	static int turn = 0;
	
	public Processo(){
		pid = pidCount++;
	}
	
	public void enterRC() throws InterruptedException{
		turn=1;
		System.out.println("O processo P"+pid+" entrou na RC");
		sleep(2000);
	}
	
	public void outRC() throws InterruptedException{
		System.out.println("O processo P"+pid+" saiu da RC");
		turn=0;
		sleep(2000);
	}

	@Override
	public void run() {
		try {
			while(turn == 1){
				System.out.println("O processo P"+pid+" esta tentando entrar na RC");
				Thread.sleep(2000);
			}
			this.enterRC();
			this.outRC();
			
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	
	
	}

}