package tp_composite.ejercicio2;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;

class RegionTest {
	private Region region; 
	private Parcela parcelaTrigo;
	private Parcela parcelaSoja; 
	private ParcelaDividida parcelaDividida; 
	private List <Cosechable> listaParcela = new ArrayList<>(); 
	

	@BeforeEach
	void setUp(){
		parcelaTrigo = mock(Parcela.class); 
		when(parcelaTrigo.ganancia()).thenReturn(300);

		parcelaSoja = mock(Parcela.class); 
		when(parcelaSoja.ganancia()).thenReturn(500);
		
		parcelaDividida = mock(ParcelaDividida.class); 
		when(parcelaDividida.ganancia()).thenReturn(1800); 
		
		listaParcela.add(parcelaSoja);
		listaParcela.add(parcelaTrigo);
		listaParcela.add(parcelaSoja);
		listaParcela.add(parcelaSoja);
		
		region = new Region(); 
		region.agregarParcela(parcelaSoja);
		region.agregarParcela(parcelaTrigo);
		region.agregarParcela(parcelaDividida);
	}

	@Test
	void totalGananciasTest() {
		assertEquals(2600, region.totalGanancias());
	}

}
