package com.curso.v1;

public class Conexion {
	
	static private Conexion conn;
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
		if (conn==null) {
			conn = new Conexion("Myslq");
		}
		return conn;
	}

}
