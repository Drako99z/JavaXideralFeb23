package com.curso.v1;

public abstract class Animal {
	
	abstract void getSound();

	@Override
	public String toString() {
		return this.getClass().getSimpleName();
	}
}
