package com.curso.v1;

public class Gato extends Animal {

	@Override
	void getSound() {
		System.out.println("Miua miau");
	}
	
	@Override
	public String toString() {
		return "Gatito";
	}

}
