package sleep_wakeup;

public class Produtor extends Thread{
	Buffer buffer;
	
	public Produtor(Buffer buffer){
		this.buffer = buffer;
	}
	
	@Override
	public void run() {
		while(true){
			try {
				synchronized(buffer){
					if(buffer.isFull()){
						System.out.println("Buffer cheio. Produtor está dormindo.");
						buffer.wait();
					}else{
						int dado = (int) Math.round(Math.random()*10);
						buffer.produzir(dado);
						System.out.println("Produtor produziu: "+ dado);
						buffer.notifyAll();
					}
				}
			} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
			}
		}
	}
	
}
