import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Test;

public class testeCalculadora {

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testSomar() {
		assertEquals(10, Calculadora.somar(5, 5));
	}

}
