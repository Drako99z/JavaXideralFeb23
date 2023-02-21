package com.curso.v0;

public class Conexion {
	
	private String tipoCon;
	private static int contador;
	
	public Conexion(String tipoCon) {
		this.tipoCon = tipoCon;
		contador++;
	}

	public static int getContador() {
		return contador;
	}
	
	

}
