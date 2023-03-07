package com.curso.v2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SumaTest {

	@Test
    public void pruebaEjecuta() {
        Suma s = new Suma(5, 10);
        
        //MALA PRACTICA
        //NO DEBEMOS TOMAR LA RESPONSABILIDAD
        CloudSuma cloudSumaAnonima = new CloudSuma() {
			@Override
			public int ejecuta(int x, int y) {
				return x+y;
			}
        };
        
        s.cloudSuma = cloudSumaAnonima;
        
        int resultado = s.ejecuta();
        assertEquals(15, resultado);
    }

}
