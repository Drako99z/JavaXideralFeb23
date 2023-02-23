package com.curso.v5;

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
			b = new Becario(nombre,cw);
			break;
		case MAC: 
			b = new Becario(nombre,cm);
			break;
		case LINUX: 
			b = new Becario(nombre,cl);
			break;
		default: 
			b = new Becario(nombre,cd);
			break;
		}
		return b;
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
