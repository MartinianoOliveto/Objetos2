package tp7;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class PokerStatus {
	
	public String verificar(Carta c1, Carta c2, Carta c3, Carta c4, Carta c5) {
		if(this.hayPoker(c1,c2,c3,c4,c5)) {
			return "Poker";
		}else if(this.hayTrio(c1,c2,c3,c4,c5)) {
			return "Trio";
		}else{
			if(this.hayColor(c1,c2,c3,c4,c5)) {
				return "Color";
			}
			else {
				return "Nada"; 
			}
		}
	}
	
	//Las formas de tener poker son dos: buscando desde la primera, o de la ultima, si hay poker, al menos una de las indicadas esta en los "extremos" de la mano 
	private boolean hayPoker(Carta c1,Carta c2,Carta c3,Carta c4,Carta c5) {
		return this.hayPokerEnLaPrimera(c1, c2, c3, c4, c5) || this.hayPokerEnLaUltima(c1, c2, c3, c4, c5);
	}
	
	private boolean hayPokerEnLaPrimera(Carta c1, Carta c2, Carta c3, Carta c4, Carta c5) {
		List <Carta> cartas = new ArrayList<Carta>(); 
		cartas.add(c1); 
		cartas.add(c2);
		cartas.add(c3);
		cartas.add(c4);
		cartas.add(c5);
		
		return cartas.stream().filter(c->c.getValor()==c1.getValor()).count()==4; 
	}
	private boolean hayPokerEnLaUltima(Carta c1, Carta c2, Carta c3, Carta c4, Carta c5) {
		List <Carta> cartas = new ArrayList<Carta>(); 
		cartas.add(c1);
		cartas.add(c2);
		cartas.add(c3);
		cartas.add(c4);
		cartas.add(c5); 
		
		return cartas.stream().filter(c->c.getValor()==c5.getValor()).count()==4; 
	}
	//Las formas de ver el trio son las mismas que el poker, pero tambien puede pasar que este en el medio. 
	
	private boolean hayTrio(Carta c1, Carta c2, Carta c3, Carta c4, Carta c5) {
		return this.hayTrioEnLaPrimera(c1,c2,c3,c4,c5) || this.hayTrioEnLaUltima(c1,c2,c3,c4,c5) || this.hayTrioEnElMedio(c1,c2,c3,c4,c5); 
	}
	
	private boolean hayTrioEnLaPrimera(Carta c1, Carta c2, Carta c3, Carta c4, Carta c5) {
		List <Carta> cartas = new ArrayList<Carta>();
		cartas.add(c1); 
		cartas.add(c2);
		cartas.add(c3);
		cartas.add(c4);
		cartas.add(c5);
		
		return cartas.stream().filter(c->c.getValor()==c1.getValor()).count()==3; 
	}
	private boolean hayTrioEnLaUltima(Carta c1, Carta c2, Carta c3, Carta c4, Carta c5) {
		List <Carta> cartas = new ArrayList<Carta>();
		cartas.add(c1);
		cartas.add(c2);
		cartas.add(c3);
		cartas.add(c4);
		cartas.add(c5);
		
		return cartas.stream().filter(c->c.getValor()==c5.getValor()).count()==3; 
	}
	private boolean hayTrioEnElMedio(Carta c1, Carta c2, Carta c3, Carta c4, Carta c5) {
		List <Carta> cartas = new ArrayList<Carta>();
		cartas.add(c1);
		cartas.add(c2);
		cartas.add(c3);
		cartas.add(c4);
		cartas.add(c5);
		
		return cartas.stream().filter(c->c.getValor()==c2.getValor()).count() ==3; 
	}
	

	private boolean hayColor(Carta c1, Carta c2, Carta c3, Carta c4, Carta c5) {
		List <Carta> cartas = new ArrayList<Carta>(); 
		cartas.add(c1);
		cartas.add(c2);
		cartas.add(c3);
		cartas.add(c4);
		cartas.add(c5); 
		
		return cartas.stream().allMatch(c->c.getPalo()==c1.getPalo());
	}
	
}

