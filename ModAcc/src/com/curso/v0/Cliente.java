package com.curso.v0;

import java.util.Date;

public class Cliente {
	
	//ENCAPSULAR
	private String nombre;
	private double sueldo;
	private int edad;
	
	//default*
	//Las clases del mismo paquete tienen acceso
	StringBuilder curp;
	
	//protected
	//Las clases del mismo paquete tienen acceso
	//Se puede tener acceso a través de Herencia
	protected Date fechaNacimiento;
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public double getSueldo() {
		//VALIDACION SOLO LO VEL ROL ADMINISTRADOR
		return sueldo;
	}
	public void setSueldo(double sueldo) {
		this.sueldo = sueldo;
	}
	public int getEdad() {
		return edad;
	}
	
//	public void setEdad(int edad) {
//		if (edad<18) {
//			System.out.println("Edad Incorrecta");
//			return;
//		}
//		this.edad = edad;
//	}
	
	public void setEdad(int edad) {
		if (edad<18) {
			System.out.println("Edad Incorrecta");
		}else {
			this.edad = edad;
		}
	}
	
	@Override
	public String toString() {
		return "Cliente [nombre=" + nombre + ", sueldo=" + sueldo + ", edad=" + edad + "]";
	}
	
	

}
