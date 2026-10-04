package tp7;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PokerStatusTest {
	private PokerStatus p; 
	private Carta asC;
	private Carta asD;
	private Carta asP;
	private Carta asT;
	private Carta cincoC;
	private Carta cincoD; 
	
	@BeforeEach
	public void setUp() {
		p = new PokerStatus(); 
		asC = mock(Carta.class);
		when(asC.getValor()).thenReturn(JerarquiaPoker.A); 
		when(asC.getPalo()).thenReturn("Corazones");
		asD = mock(Carta.class);
		when(asD.getValor()).thenReturn(JerarquiaPoker.A); 
		when(asD.getPalo()).thenReturn("Diamantes");
		asP = mock(Carta.class); 
		when(asP.getValor()).thenReturn(JerarquiaPoker.A);
		when(asP.getPalo()).thenReturn("Picas");
		asT = mock(Carta.class);
		when(asT.getValor()).thenReturn(JerarquiaPoker.A);
		when(asT.getPalo()).thenReturn("Treboles");
		cincoC = mock(Carta.class); 
		when(cincoC.getValor()).thenReturn(JerarquiaPoker.Cinco);
		when(cincoC.getPalo()).thenReturn("Corazones");
		cincoD = mock(Carta.class);
		when(cincoD.getValor()).thenReturn(JerarquiaPoker.Cinco);
		when(cincoD.getPalo()).thenReturn("Diamantes");
		
		
		
	}	
	/*@Test 
	void verificarTest() {
		assertEquals(true, p.verificar("5P","5C","5D","5T","1D")); 
	}*/
	/*@Test
	void verificarPokerTest() {
		assertEquals("Poker", p.verificar("5P","5C","5D","5T","1D")); 
	}
	@Test 
	void verificarTrioTest() {
		assertEquals("Trio", p.verificar("5P","5C","5D","1D","1C")); 
	}
	@Test 
	void verificarColorTest() {
		assertEquals("Color",p.verificar("1D", "2D", "3D", "4D", "5D"));
	}
	@Test 
	void verificarNadaTest() {
		assertEquals("Nada", p.verificar("1D", "3C", "7T", "QC", "KP")); 
	}*/
	
	@Test 
	void verificarPokerEnPrimeraTest() {
		String resultado = p.verificar(asC, asD, asP, asT, cincoC); 
		assertEquals("Poker", resultado); 
	}
	@Test
	void verificarPokerEnUltimaTest() {
		String resultado = p.verificar(cincoC, asT, asP, asD, asC);
		assertEquals("Poker",resultado); 
	}
	@Test 
	void verificarColorTest() {
		when(asP.getPalo()).thenReturn("Corazones");
		when(asD.getPalo()).thenReturn("Corazones");
		when(asT.getPalo()).thenReturn("Corazones");
		
		String resultado = p.verificar(cincoC, asT, asP, asD, asC);
		assertEquals("Poker",resultado); 
	}
	@Test 
	void verificarTrioPrimeraTest(){
		String resultado = p.verificar(asC, asT, asP, cincoC, cincoD);
		assertEquals("Trio",resultado); 
	}
	@Test 
	void verificarTrioUltimaTest() {
		String resultado = p.verificar(cincoC, asT, asP, cincoD, asC);
		assertEquals("Trio",resultado); 
	}
	@Test 
	void verificarTrioMedioTest() {
		String resultado = p.verificar(cincoC, asT, asP, asD, cincoD);
		assertEquals("Trio",resultado); 
	}
	

}
