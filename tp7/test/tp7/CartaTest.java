package tp7;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CartaTest {
	private Carta asDiamantes;
	private Carta dosPicas; 

	@BeforeEach
	void setUp(){
		asDiamantes = new Carta(JerarquiaPoker.A,"Diamante");
		dosPicas = new Carta(JerarquiaPoker.Dos, "Picas"); 
	}
	
	@Test 
	void constructoresTest() {
		assertEquals(JerarquiaPoker.A, asDiamantes.getValor());
		assertEquals("Diamante", asDiamantes.getPalo()); 
	}
	@Test
	void asMayorQueDosTest() {
		assertEquals(true, asDiamantes.esMayor(dosPicas));
	}

}
