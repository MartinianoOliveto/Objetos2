package tp3;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ar.edu.unq.po2.tp3.Multioperador;

public class MultioperadorTestCase {
	private Multioperador mult; 
	private ArrayList<Integer> list; 
		
	@BeforeEach
	public void setUp() throws Exception{
		mult = new Multioperador();
		list = new ArrayList<Integer>(); 
			
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4); 	
		}
		@Test
		public void sumaTest() {
			int total = mult.suma(list);
			assertEquals(10, total);
		}
		@Test 
		public void restaTest() {
			int total = mult.resta(list);
			assertEquals(-8, total);
		}
		@Test
		public void multiplicacionTest() {
			int total = mult.multiplicacion(list);
			assertEquals(24, total); 
		}
}
