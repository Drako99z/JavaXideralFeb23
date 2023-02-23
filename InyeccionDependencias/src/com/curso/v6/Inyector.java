package com.curso.v6;

public class Inyector {
	
	static Computadora cw = new CompuWindows("Vista");
	static Computadora cl = new CompuLinux("Ubuntu 18");
	static Computadora cm = new CompuMac("Sierra");
	static Computadora cd = new CompuDummy("Pato 20");

	static Becario getBecario(String nombre,TipoComputadora tipoComp) {
		
		//VARIABLES LOCALES NO SE INICIALIZAN
		Becario b; 
		
		switch(tipoComp) {
		
		case WINDOWS: 
			return new Becario(nombre,cw);
		case MAC: 
			return new Becario(nombre,cm);
		case LINUX: 
			return new Becario(nombre,cl);
		default: 
			return new Becario(nombre,cd);
		}
		
	}
	
	static void inyectarWin(Becario b) {
		b.setComputadora(cw);
	}
	
	static void inyectarLin(Becario b) {
		b.setComputadora(cl);
	}
	
	static void inyectarMac(Becario b) {
		b.setComputadora(cm);
	}
	
	
}
