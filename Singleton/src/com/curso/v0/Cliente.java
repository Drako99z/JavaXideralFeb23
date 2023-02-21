package com.curso.v0;

public class Cliente {
	
	String nombre;
	Conexion con;
	
	public Cliente(String nombre) {
		this.nombre = nombre;
	}

	public static void main(String[] args) {

		Cliente cliente1 = new Cliente("Patrobas");
		cliente1.con = new Conexion("Mysql");
		
		Cliente cliente2 = new Cliente("Tercio");
		cliente2.con = new Conexion("Mysql");
		
		Cliente cliente3 = new Cliente("Andronico");
		cliente3.con = new Conexion("Mysql");
		
		System.out.println(Conexion.getContador());
		
	}


}
