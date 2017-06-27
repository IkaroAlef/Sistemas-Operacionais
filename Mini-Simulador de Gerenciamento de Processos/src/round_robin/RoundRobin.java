package round_robin;

import java.util.LinkedList;
import java.util.Queue;

public class RoundRobin {
	
	public static void main(String[] args) {
		Queue<Processo> p = new LinkedList<Processo>();
		
		p.add(new Processo(6000));
		p.add(new Processo(7000));
		p.add(new Processo(5000));
		p.add(new Processo(4000));
		p.add(new Processo(3000));
		p.add(new Processo(4000));
		p.add(new Processo(5000));
		p.add(new Processo(6000));
		p.add(new Processo(7000));
		p.add(new Processo(5000));
		
		while(!p.isEmpty()){
			Processo px = p.poll();
			px.run();
			if(px.tempo > 0) //se não finalizou o processo, 
				p.add(px);   //volta pra fila de pronto
		}
		
		System.out.println("Todos os processos foram executados.");
		
	}
	
}
