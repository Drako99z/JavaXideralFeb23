package com.curso.v2;

public class Conexion {
	
	static private Conexion conn = new Conexion("Mysql");
	private String tipoCon;
	private static int contador;
	
	private Conexion(String tipoCon) {
		this.tipoCon = tipoCon;
		contador++;
	}

	public static int getContador() {
		return contador;
	}
	
	public static Conexion getInstancia() {
		return conn;
	}

}
