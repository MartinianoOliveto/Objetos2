package tp5;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ProductoCooperativaTest {
	private ProductoCooperativa arroz; 
	private ProductoCooperativa leche; 
	
	@BeforeEach 
	public void setUp() {
		arroz = new ProductoCooperativa("Arroz",10.0d,10); 
		leche = new ProductoCooperativa("Leche",5.0d,10); 
	}

	@Test
	public void testConstructores() {
		assertEquals("Arroz",arroz.getNombre());
		assertEquals(9, arroz.getPrecio()); 
		assertEquals(10, arroz.getStock());
		assertEquals(0.1d, arroz.getDescuento()); 
		
		assertEquals("Leche", leche.getNombre());
		assertEquals(4.5d, leche.getPrecio()); 
		assertEquals(10, leche.getStock()); 
		assertEquals(0.1d, leche.getDescuento()); 
	}
	
	@Test
	public void testDescontarStock() {
		leche.registrar();
		arroz.registrar();
		
		assertEquals(9,leche.getStock());
		assertEquals(9,arroz.getStock()); 
	}
	@Test 
	public void testPrecio() {
		assertEquals(9, arroz.monto());
		assertEquals(4.5d, leche.monto()); 
	}

}
