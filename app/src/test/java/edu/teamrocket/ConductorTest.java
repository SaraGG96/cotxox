package edu.teamrocket;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ConductorTest {

	@Test
	public void testValoracionMedia() {
        Conductor conductor = new Conductor("Juan");
        conductor.setValoracion((byte) 4);
        conductor.setValoracion((byte) 5);
        conductor.setValoracion((byte) 3);
        
        double valoracionMedia = conductor.getValoracion();
        double valoracionCalculada = (4 + 5 + 3) / 3.0;
        
        assertEquals(valoracionCalculada, valoracionMedia, 0.01);
	}
}
