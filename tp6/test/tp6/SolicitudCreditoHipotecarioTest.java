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
		solicitudAceptable = new SolicitudCreditoHipotecario(clienteAceptable, 00.0d, 24, propiedadGarantia);
		
	}
	@Test
	public void constructorTest() {
		assertEquals("Cliente",solicitudAceptable.getCliente());
		assertEquals(propiedadGarantia, solicitudAceptable.getGarantia());
		assertEquals(0.00d, solicitudAceptable.getMontoSolicitado()); 
		assertEquals(0, solicitudAceptable.getPlazo());
	}

	@Test
	public void esAceptableTest() {
		assertEquals(true,solicitudAceptable.esAceptable());
		assertEquals(false,solicitudNoAceptable.esAceptable()); 
	}
	@Test 
	public void cuotaMensualTest() {
		assertEquals(00.0d, solicitudAceptable.cuotaMensual()); 
	}
}
