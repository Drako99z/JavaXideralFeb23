package com.curso.v0;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SumaTest {

	@Test
    public void pruebaEjecuta() {
        Suma s = new Suma(5, 10);
        int resultado = s.ejecuta();
        assertEquals(15, resultado);
    }

}
