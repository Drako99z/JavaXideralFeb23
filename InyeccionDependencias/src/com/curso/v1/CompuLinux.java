package com.curso.v1;

public class CompuLinux {
	
	String version;

	public CompuLinux(String version) {
		this.version = version;
	}
	
	void encender() {
		System.out.println("Encender computadora Linux "+version);
	}

}
