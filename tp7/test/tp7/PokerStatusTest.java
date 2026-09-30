package tp7;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PokerStatusTest {
	private PokerStatus p; 

	@BeforeEach
	public void setUp() {
		p = new PokerStatus(); 
	}	
	/*@Test 
	void verificarTest() {
		assertEquals(true, p.verificar("5P","5C","5D","5T","1D")); 
	}*/
	@Test
	void verificarPokerTest() {
		assertEquals("Poker", p.verificar("5P","5C","5D","5T","1D")); 
	}
	@Test 
	void verificarTrioTest() {
		assertEquals("Trio", p.verificar("5P","5C","5D","1D","1C")); 
	}
	@Test 
	void verificarColorTest() {
		assertEquals("Color",p.verificar("1D", "2D", "3D", "4D", "5D"));
	}
	@Test 
	void verificarNadaTest() {
		assertEquals("Nada", p.verificar("1D", "3C", "7T", "QC", "KP")); 
	}
	

}
