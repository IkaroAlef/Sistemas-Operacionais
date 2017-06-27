package round_robin;

public class Processo extends Thread{
	
	int pid;
	int tempo;
	
	static int quantum = 2000;
	static int pidCount = 1;
	static int cpu = 0;
	
	public Processo(int tempo){
		pid = pidCount++;
		this.tempo = tempo;
	}
	
	public void enterRC() throws InterruptedException{
		cpu=1;
		//System.out.println("O processo P"+pid+" entrou na RC");
		sleep(500);
	}
	
	public void outRC() throws InterruptedException{
		//System.out.println("O processo P"+pid+" saiu da RC");
		cpu=0;
		sleep(500);
	}

	@Override
	public void run() {
		int quantumL;
		try {
			quantumL = tempo>quantum? quantum: tempo;
			System.out.println("O processo P"+pid+" entrou na CPU.");
			System.out.println("Executando...");
			Thread.sleep(quantumL); //executando algo
			tempo=tempo-quantumL; // ideia de continuação
			//this.enterRC();
			//this.outRC();
			System.out.println("O processo P"+pid+" saiu da CPU. Tempo restante: "+tempo+".\n");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	
	
	}

}