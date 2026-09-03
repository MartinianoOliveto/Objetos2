package tp3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import ar.edu.unq.po2.tp3.Counter;

public class CounterTestCase{
	private Counter counter; 
	@Nested 
	public class PuntoUnoTest{
		@BeforeEach 
		public void setUp() throws Exception{
			counter = new Counter(); 
			counter.addNumber(1);
			counter.addNumber(3);
			counter.addNumber(5);
			counter.addNumber(7);
			counter.addNumber(9);
			counter.addNumber(1);
			counter.addNumber(1);
			counter.addNumber(1);
			counter.addNumber(1);
			counter.addNumber(4);
		}
		@Test 
		public void testEvenNumbers() {
			int amount = counter.getEvenOcurrences();
			assertEquals(amount, 1); 
		}
		@Test 
		public void testOddNumbers() {
			int amount = counter.getOddOcurrences();
			assertEquals(amount, 9); 
		}
		@Test 
		public void testMultipleOcurrences() {
			int amount = counter.getMultipleOcurrences(2);
			assertEquals(amount, 1);
		}
	}
	@Nested
	public class PuntoDosTest{
		@BeforeEach
		public void setUp() throws Exception{
			counter = new Counter();
			counter.addNumber(64);
			counter.addNumber(1024);
			counter.addNumber(1056);
		}
		@Test 
		public void testMaxNumber() {
			int n = counter.conMasNumerosPares();
			assertEquals(n, 1024);
		}
	}
	@Nested 
	public class PuntoTresTest{
		@Test
		public void testMayorMultiplo() {
			counter = new Counter(); 
			int n = counter.mayorMultiplo(3, 9);
			assertEquals(n,999); 
		}
	}
}
