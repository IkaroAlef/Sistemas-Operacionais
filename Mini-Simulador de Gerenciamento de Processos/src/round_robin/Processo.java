package round_robin;

public class Processo extends Thread{
	
	int pid;
	int tempo;
	
	static int quantum = 2000;
	static int pidCount = 1;
	
	public Processo(int tempo){
		pid = pidCount++;
		this.tempo = tempo;
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
			System.out.println("O processo P"+pid+" saiu da CPU. Tempo restante: "+tempo+".\n");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	
	
	}

}