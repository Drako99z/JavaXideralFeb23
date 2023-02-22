package com.curso.v0;

//IS-A
public class Gato implements Animal {
	
	@Override
	public void getSound() {
		System.out.println("Miua miau");
	}

	@Override
	public String toString() {
		return "Gato";
	}
	
	

}
