package sleep_wakeup;

public class Consumidor extends Thread {
Buffer buffer;
	
	public Consumidor(Buffer buffer){
		this.buffer = buffer;
	}
	
	@Override
	public  void run() {
		while(true){
		try{
			synchronized(buffer){
			if(buffer.isEmpty()){
					System.out.println("Buffer vazio. Consumidor esta esperando.");
					buffer.wait();
			}
			else{
					System.out.println("Consumidor consumiu: "+ buffer.consumir());
					buffer.notifyAll();
				}
			}
		}catch(InterruptedException e){
			e.printStackTrace();
		}
		}
	}
}
