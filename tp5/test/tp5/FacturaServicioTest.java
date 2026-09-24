package tp5;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class FacturaServicioTest {
	private FacturaServicio servicio; 
	private AgenciaRecaudadora agencia; 
	
	@BeforeEach 
	public void setUp() {
		agencia = new AgenciaRecaudadora("GARCA","Capital Federal"); 
		servicio = new FacturaServicio(agencia,5,10);
	}

	@Test
	public void testConstructores() {
		assertEquals(50, servicio.getPrecio());
		assertEquals(agencia, servicio.getAgencia()); 
		assertEquals(false, servicio.estaPago()); 
	}
	@Test 
	public void testComportamiento() {
		servicio.pagarse(); 
		assertEquals(true,servicio.estaPago());
	}
	@Test 
	public void testComportamientoInterfaz() {
		servicio.registrar();
		assertEquals(true,servicio.estaPago()); 
	}

}
