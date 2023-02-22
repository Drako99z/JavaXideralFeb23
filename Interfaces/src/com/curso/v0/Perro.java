package com.curso.v0;

public class Perro implements Animal {
	
	public void getSound() {
		System.out.println("Guau guau");
	}
	
	@Override
	public String toString() {
		return "Perro";
	}

}
