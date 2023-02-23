package com.curso.v1;

public class Becario {
	
	String nombre;
	//ALTO ACOPLAMIENTO
	CompuWindows compuWin;
	CompuLinux compuLin;

	public Becario(String nombre) {
		this.nombre = nombre;
	}
	
	void encenderComputadora(String tipo) {
		System.out.println(nombre);
		if (tipo == "WINDOWS") {
			compuWin = new CompuWindows("Vista");
			compuWin.encender();
		}else {
			compuLin = new CompuLinux("Ubutu 18");
			compuLin.encender();
		}
		
	}
	

}
