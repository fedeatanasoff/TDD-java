package Test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import Main.NumerosRomanos;

class NumerosRomanosTest {
	
	private NumerosRomanos numRomanos = new NumerosRomanos();

	@Test
	public void pasar1aRomano() {
		String romano = numRomanos.convertirARomanos(1);
		assertEquals(romano,  "I");
	}
	
	@Test
	public void pasar2aRomano() {
		String romano = numRomanos.convertirARomanos(2);
		assertEquals(romano,  "II");
	}

	@Test
	public void pasar3aRomano() {
		String romano = numRomanos.convertirARomanos(3);
		assertEquals(romano,  "III");
	}
	
	@Test
	public void pasar4aRomano() {
		String romano = numRomanos.convertirARomanos(4);
		assertEquals(romano,  "IV");
	}
	
	@Test
	public void pasar5aRomano() {
		String romano = numRomanos.convertirARomanos(5);
		assertEquals(romano,  "V");
	}
	
	@Test
	public void pasar6aRomano() {
		String romano = numRomanos.convertirARomanos(6);
		assertEquals(romano,  "VI");
	}
	
	@Test
	public void pasar7aRomano() {
		String romano = numRomanos.convertirARomanos(7);
		assertEquals(romano,  "VII");
	}
}
