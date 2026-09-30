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
	@Test 
	void verificarTest() {
		assertEquals(true, p.verificar("5P","5C","5D","5T","1D")); 
	}
	

}
