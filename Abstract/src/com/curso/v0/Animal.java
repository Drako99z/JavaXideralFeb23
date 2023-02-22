package com.curso.v0;

public abstract class Animal {
	
	void getSound() {
		System.out.println("Sin sonido");
	}

	@Override
	public String toString() {
		return this.getClass().getSimpleName();
	}
}
