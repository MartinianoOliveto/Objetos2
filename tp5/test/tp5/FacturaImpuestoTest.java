package tp5;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class FacturaImpuestoTest {
	private FacturaImpuesto impuesto; 
	private Agencia agencia; 
	
	@BeforeEach
	public void setUp() {
		agencia = new AgenciaRecaudadora("GARCA","Capital Federal"); 
		impuesto = new FacturaImpuesto(agencia,35.5d); 
	}
	
	@Test
	public void testConstructores() {
		assertEquals(35.5d, impuesto.getPrecio());
		assertEquals(agencia, impuesto.getAgencia()); 
		assertEquals(false, impuesto.estaPago()); 
	}
	@Test 
	public void testComportamiento() {
		impuesto.pagarse(); 
		assertEquals(true,impuesto.estaPago());
	}
	@Test 
	public void testComportamientoInterfaz() {
		impuesto.registrar();
		assertEquals(true,impuesto.estaPago()); 
	}
}
