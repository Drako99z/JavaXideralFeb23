package com.curso.v1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SumaTest {

	@Test
    public void pruebaEjecuta() {
        Suma s = new Suma(5, 10);
        //NullPointerException
        //Porque suma delega a un servicio externo el calculo
        //que no ha sido instanceado.
        int resultado = s.ejecuta();
        assertEquals(15, resultado);
    }

}
