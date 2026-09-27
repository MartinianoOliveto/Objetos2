package tp6;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class SolicitudCreditoHipotecarioTest {
	
	private SolicitudCreditoHipotecario solicitudAceptable; 
	private SolicitudCreditoHipotecario solicitudNoAceptable; 
	private Propiedad propiedadGarantia; 
	private Cliente clienteAceptable; 
	private Cliente clienteNoAceptable;

	@BeforeEach
	public void setUp() {
		clienteAceptable = new Cliente("Juan Perez", 40, 2000000d); 
		propiedadGarantia = new Propiedad("Casa", "Calle Falsa 123", 10000000d); 
		solicitudAceptable = new SolicitudCreditoHipotecario(clienteAceptable, 6000000, 240, propiedadGarantia);
		
	}
	@Test
	public void esAceptableTest() {
		assertEquals(true,solicitudAceptable.esAceptable());
		//assertEquals(false,solicitudNoAceptable.esAceptable()); 
	}
	@Test 
	public void cuotaMensualTest() {
		assertEquals(25000.0d, solicitudAceptable.cuotaMensual()); 
	}
}
