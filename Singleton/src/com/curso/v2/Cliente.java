package com.curso.v2;

public class Cliente {
	
	String nombre;
	Conexion con;
	
	public Cliente(String nombre) {
		this.nombre = nombre;
	}

	public static void main(String[] args) {

		Cliente cliente1 = new Cliente("Patrobas");
		cliente1.con = Conexion.getInstancia();
				
		Cliente cliente2 = new Cliente("Tercio");
		cliente2.con = Conexion.getInstancia();
		
		Cliente cliente3 = new Cliente("Andronico");
		cliente3.con = Conexion.getInstancia();
		
		Cliente cliente999 = new Cliente("Epeneto");
		cliente999.con = Conexion.getInstancia();
		
		
		System.out.println(Conexion.getContador());
		
	}


}
