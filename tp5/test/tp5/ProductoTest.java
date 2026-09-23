package tp5;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class ProductoTest {
	
	private Producto cerveza; 
	private Producto vino; 
	
	@BeforeEach
	public void setUp() {
		cerveza = new Producto("Cerveza", 25.5d, 10); 
		vino = new Producto("Vino", 40.8d, 10); 
	}
	
	@Test
	public void testConstructor() {
		assertEquals("Cerveza", cerveza.getNombre()); 
		assertEquals(25.5d, cerveza.getPrecio());
		assertEquals(10, cerveza.getStock()); 
		
		assertEquals("Vino", vino.getNombre());
		assertEquals(40.8d, vino.getPrecio()); 
		assertEquals(10, vino.getStock()); 
		
	}
	@Test 
	public void testDescontarStock() {
		vino.registrar(); 
		cerveza.registrar();
		
		assertEquals(9, vino.getStock());
		assertEquals(9, cerveza.getStock()); 
	}
	@Test //testeando la implementacion del metodo de interfaz 
	public void testPrecio() {
		assertEquals(25.5d, cerveza.monto());
		assertEquals(40.8, vino.monto()); 
	}
}
