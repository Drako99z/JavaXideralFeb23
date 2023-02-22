package com.curso.v5;

public class Division extends Operacion {
	
	public Division(int x, int y) {
		super(x,y);
	}
	
	int ejecuta() {
		return getX()/getY();
	}
	

}
