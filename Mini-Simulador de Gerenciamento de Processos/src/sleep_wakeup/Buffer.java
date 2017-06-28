package sleep_wakeup;

import java.util.LinkedList;
import java.util.Queue;

public class Buffer {
	Queue<Integer> p = new LinkedList<Integer>();
	int maximo = 10;
	
	public boolean isFull(){
		return p.size() == 10;
	}
	
	public boolean isEmpty(){
		return p.isEmpty();
	}
	
	public void produzir(int i){
		p.add(i);
	}
	
	public int consumir(){
		return p.poll();
	}
}
