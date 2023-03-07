package com.curso.v2;

public class Suma {
	
	//OBJECTO QUE VA A SER INYECTADO POR LA APLICACION.
	CloudSuma cloudSuma;

	int x;
	int y;
	
	public Suma(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	int ejecuta() {
		//LA RESPONSABILIDAD LA REALIZA UN TERCERO
		int res = cloudSuma.ejecuta(x,y);
		return res;
	}
	
	
	
}
