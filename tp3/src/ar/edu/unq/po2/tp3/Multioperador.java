package ar.edu.unq.po2.tp3;

import java.util.ArrayList;

public class Multioperador {
	
	public Integer suma(ArrayList<Integer> list) {
		int suma = list.getFirst(); 
		int i = 1; 
		
		while(i < list.size()) {
			suma = suma + list.get(i); 
			i++; 
		}
		return suma; 
	}
	public Integer resta(ArrayList<Integer> list) {
		int resta = list.getFirst(); 
		int i = 1; 
		
		while(i < list.size()) {
			resta = resta - list.get(i); 
			i++; 
		}
		return resta; 
	}
	public Integer multiplicacion(ArrayList<Integer> list) {
		int mult = list.getFirst(); 
		int i = 1; 
		
		while(i < list.size()) {
			mult = mult * list.get(i); 
			i++; 
		}
		return mult; 
	}
	
}