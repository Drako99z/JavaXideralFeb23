package com.curso.v0;

public class Oso implements Animal {
	
	@Override
	public void getSound() {
		System.out.println("Grrr grrr");
	}
	
	@Override
	public String toString() {
		return "Oso";
	}

}
