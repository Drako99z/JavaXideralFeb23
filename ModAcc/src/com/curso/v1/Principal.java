package com.curso.v1;

import java.util.Date;

import com.curso.v0.Cliente;

public class Principal {
	
	public static void main(String[] args) {
		Cliente c1 = new Cliente();
		
		//c1.nombre = "Patrobas";
		//c1.edad = -50;
		//c1.sueldo = 456.78;
		
		c1.setNombre("Patrobas");
		c1.setEdad(19);
		c1.setSueldo(567.98);
		
		//System.out.println(c1);
		
		System.out.println(c1.getSueldo());
		
		//No esta en mismo paquete
		//StringBuilder curp = c1.curp;
		//Date fecha = c1.fechaNacimiento;
		
	}

}
