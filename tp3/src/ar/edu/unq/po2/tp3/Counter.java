package ar.edu.unq.po2.tp3;

import java.util.ArrayList;
import java.util.List;


public class Counter {
	private List<Integer> numbers = new ArrayList<Integer>(); 
	
	public List<Integer> getNumbers() {
		return numbers; 
	}
	public void addNumber(Integer i) {
		numbers.add(i); 
	}
	public Integer getEvenOcurrences() {
		int amount = 0; 
		for(int i=0; i<numbers.size(); i++) {
			if(numbers.get(i)%2==0) {
				amount++; 
			}
		}
		return amount; 
	}
	public Integer getOddOcurrences() {
		int amount = 0; 
		for(int i=0; i<numbers.size(); i++) {
			if(numbers.get(i)%2!=0) {
				amount++; 
			}
		}
		return amount; 
	}
	public Integer getMultipleOcurrences(Integer div) {
		int amount = 0; 
		for(Integer number : numbers) {
			if(number%div==0) {
				amount++;
			}
		}
		return amount; 
	}
	public Integer conMasNumerosPares() {
		int maximo = numbers.getFirst();
		int cantParesMaxima = contarPares(numbers.getFirst());

		numbers.removeFirst();
		
		for(int number:numbers) {
			int cantParesActual = contarPares(number);
			if(cantParesActual > cantParesMaxima) {
				maximo = number; 
				cantParesMaxima = cantParesActual; 
			}
		}
		return maximo; 
	}
	public Integer contarPares(int n) {
		int cantPares = 0; 
		while(n >0) {
			if(n%2==0) {
				cantPares++; 
			}
			n = n/10; 
		}
		return cantPares; 
	}
	public Integer mayorMultiplo(Integer x, Integer y) {
		int m = 1000; 
		while(!esMultiplo(m,x) && !esMultiplo(m,y) && m>0) {
			m = m-1; 
		}
		if(m == 0) {
			m = -1; 
		}
		return m; 
	}
	public Boolean esMultiplo(Integer x, Integer y) {
		return x%y==0; 
	}
}