package com.curso.beca.mockitoCalculadora.difficult;

public class Suma {
		//OBJECTO QUE VA A SER INYECTADO POR LA APLICACION.
		CloudDifficult cloudDifficult;

		int ejecuta(int x, int y) {
			
			int res = cloudDifficult.ejecutaCloudDifficult(x-3,y-5);
			res = res - 7;
			
			return res;
		}
		
}
