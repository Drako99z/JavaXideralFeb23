package com.curso.v5;

public class Multi extends Operacion {
	
	public Multi(int x, int y) {
		super(x,y);
	}
	
	int ejecuta() {
		return getX()*getY();
	}
	

}
