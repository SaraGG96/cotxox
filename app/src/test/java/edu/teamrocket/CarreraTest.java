package edu.teamrocket;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CarreraTest {
	
	@Test
	public void testCosteEsperado() {
		Carrera carrera = new Carrera("4916119711304546");
		carrera.setDistancia(7.75);
		carrera.setTiempoEsperado(10);
		
		double costeEsperado = carrera.getCosteEsperado();
		double costeCalculado = 2.5 + (7.75 * 1.5) + (10 * 0.25);
		assertEquals(costeCalculado, costeEsperado, 0.01);
	}

}
