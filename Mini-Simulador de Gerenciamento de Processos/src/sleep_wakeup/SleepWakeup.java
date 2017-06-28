package sleep_wakeup;

public class SleepWakeup{
	public  static void main(String[] args) throws InterruptedException {
		Buffer buffer = new Buffer();
		Produtor p = new Produtor(buffer);
		Consumidor c = new Consumidor (buffer);
		p.start();
		c.start();
		Thread.sleep(3000);
		System.exit(0);
	}

}
