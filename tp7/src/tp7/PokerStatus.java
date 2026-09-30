package tp7;

import java.util.ArrayList;
import java.util.List;

public class PokerStatus {
	//private List<String> cartas = new ArrayList<String>(); 
	
	/*public void agregarALaMano(String c) {
		cartas.add(c); 
	}*/
	/*public boolean hayPoker() {
		return this.hay4ConMismoNumero();
	}*/
	/*private boolean hay4ConMismoNumero() {
		//return cartas.stream().map(c ->c.substring(0, c.length()-1)).count() == 4; 	
		return this.cantCartasConElMismoNumeroQueLaPrimera() == 4; 
	}
	private int cantCartasConElMismoNumeroQueLaPrimera() {
		String primeraCarta = cartas.getFirst();
		String numeroPrimeraCarta = primeraCarta.substring(0, primeraCarta.length()-1); 
		
		int cartasConElMismoNumero = 1; //siempre la primera es el numero que husco 
		
		for(int i=1; i<cartas.size(); i++) {
			String cartaActual = cartas.get(i);
			if(cartaActual.substring(0,cartaActual.length()-1).equals(numeroPrimeraCarta)){
				cartasConElMismoNumero++; 
			}
		}
		return cartasConElMismoNumero; 
	}*/
	public boolean verificar(String c1, String c2, String c3, String c4, String c5) {
		List<String> cartas = new ArrayList<String>();
		cartas.add(c2);
		cartas.add(c3);
		cartas.add(c4);
		cartas.add(c5); 
		
		String primeraCarta = c1; 
		String numeroPrimeraCarta = primeraCarta.substring(0, primeraCarta.length()-1); 
		
		int cartasConElMismoNumero = 1; //siempre la primera es el numero que husco 
		
		for(int i=0; i<cartas.size(); i++) {
			String cartaActual = cartas.get(i);
			if(cartaActual.substring(0,cartaActual.length()-1).equals(numeroPrimeraCarta)){
				cartasConElMismoNumero++; 
			}
		}
		return cartasConElMismoNumero == 4; 
		
	}
}

