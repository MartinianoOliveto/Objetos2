package tp7;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PokerStatusTest {
	private PokerStatus p; 

	@BeforeEach
	public void setUp() {
		p = new PokerStatus(); 
		p.agregarALaMano("5P");
		p.agregarALaMano("5C");
		p.agregarALaMano("5D");
		p.agregarALaMano("5T");
		p.agregarALaMano("1D"); 
	}

	@Test
	void verificarTest() {
		assertEquals(true, p.hayPoker()); 
	}

}
