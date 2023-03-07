package com.curso.beca.mockitoCalculadora;

public class Suma {
		//OBJECTO QUE VA A SER INYECTADO POR LA APLICACION.
		CloudSuma cloudSuma;

		int ejecuta(int x, int y) {
			//LA RESPONSABILIDAD LA REALIZA UN TERCERO
			int res = cloudSuma.ejecutaCloudSuma(x,y);
			return res;
		}
		
}
