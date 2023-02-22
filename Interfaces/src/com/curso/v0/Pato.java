package com.curso.v0;

public class Pato implements Animal {
	
	public void getSound() {
		System.out.println("Kuaq kuaq");
	}
	
	@Override
	public String toString() {
		return "Pato";
	}

}
