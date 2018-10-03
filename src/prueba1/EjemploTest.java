package prueba1;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class EjemploTest {

	Ejemplo e = new Ejemplo();
	@Test
	void test() {
		//fail("Not yet implemented");
	}
	
	@Test
	void suma() {
		assertTrue(4==e.suma(2, 2));
		
	}

}
