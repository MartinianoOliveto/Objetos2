package tp5;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class AgenciaRecaudadoraTest {
	private AgenciaRecaudadora agencia; 
	
	@BeforeEach
	public void setUp() {
		agencia = new AgenciaRecaudadora("GARCA", "Capital Federal"); 
	}
	
	@Test
	public void testConstructores() {
		assertEquals("GARCA", agencia.getNombre());
		assertEquals("Capital Federal", agencia.getLocalidad()); 
	}

}
