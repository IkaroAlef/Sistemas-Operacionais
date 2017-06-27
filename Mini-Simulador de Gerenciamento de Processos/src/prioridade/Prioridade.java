package prioridade;

import java.util.Comparator;
import java.util.PriorityQueue;

public class Prioridade {
	public static void main(String[] args) {
	PriorityQueue<Processo> p = new PriorityQueue<Processo>(10, new Comparator<Processo>() {
		@Override
		public int compare(Processo p1, Processo p2) {
			return p2.prioridade - p1.prioridade;
		}
	});
		
		p.add(new Processo(6000, 1));
		p.add(new Processo(7000, 2));
		p.add(new Processo(5000, 3));
		p.add(new Processo(4000, 4));
		p.add(new Processo(3000, 2));
		p.add(new Processo(4000, 1));
		p.add(new Processo(5000, 3));
		p.add(new Processo(6000, 1));
		p.add(new Processo(7000, 4));
		p.add(new Processo(5000, 2));

		while(!p.isEmpty()){
			Processo px = p.poll();
			px.run();
			if(px.tempo > 0) //se não finalizou o processo,  ROUND ROBIN na fila
				p.add(px);   //volta pra fila de pronto
		}
		
		System.out.println("Todos os processos foram executados.");
		
	}
}
