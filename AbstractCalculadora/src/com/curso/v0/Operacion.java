package com.curso.v0;

//NO SE PUEDEN CREAR OBJETOS
public abstract class Operacion {

	int x;
	int y;
	
	public Operacion(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	//METODOS SIN COMPORTAMIENTO (METODOS abstract)
	abstract int ejecuta();

	//METODOS CON COMPORTAMIENTO
	@Override
	public String toString() {
		return this.getClass().getSimpleName()
				+" [x=" + x + ", y=" + y + "]";
	}
	

}
