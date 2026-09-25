package tp5;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CajaTest {
	private Producto cerveza; 
	private Producto vino;
	private ProductoCooperativa arroz; 
	private ProductoCooperativa leche; 
	private FacturaServicio servicio; 
	private FacturaImpuesto impuesto;
	private Agencia agencia; 
	private Caja caja; 
	
	@BeforeEach
	public void setUp() {
		agencia = new AgenciaRecaudadora("GARCA","Capital Federal"); 
		cerveza = new Producto("Cerveza", 25.5d, 10); 
		vino = new Producto("Vino", 40.8d, 10);
		arroz = new ProductoCooperativa("Arroz",10.0d,10); 
		leche = new ProductoCooperativa("Leche",5.0d,10); 
		servicio = new FacturaServicio(agencia,5,10);
		impuesto = new FacturaImpuesto(agencia,35.5d); 
		caja = new Caja(); 
		caja.agregarACaja(cerveza);
		caja.agregarACaja(leche);
		caja.agregarACaja(servicio);
		caja.agregarACaja(arroz);
		caja.agregarACaja(impuesto);
		caja.agregarACaja(vino);
	}
	@Test
	public void testRegistrar() {
		caja.registrarProductos();
		assertEquals(9,cerveza.getStock());
		assertEquals(9,vino.getStock());
		assertEquals(9,arroz.getStock());
		assertEquals(9,leche.getStock());
		assertEquals(true,servicio.estaPago());
		assertEquals(true,impuesto.estaPago());
	}
	@Test 
	public void testMontoTotal() {
		assertEquals(caja.getMontoTotal(), 166,8); 
	}
	
}
