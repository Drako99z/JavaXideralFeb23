package com.curso.v4;

public class CompuDummy extends Computadora {
	
	String version;

	public CompuDummy(String version) {
		this.version = version;
	}
	
	@Override
	public void encender(){
		System.out.println("Encender computadora Dummy "+version);
	}

}
