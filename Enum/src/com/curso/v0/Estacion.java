package com.curso.v0;

public enum Estacion {
	
	INVIERNO("no hay visitantes"),
	OTOÑO("pocos visitantes"),
	VERANO("muchos visitantes"),
	PRIMAVERA("depende número de visitantes");
	
	String visitantes;
	
	private Estacion(String visitantes) {
		this.visitantes = visitantes;
	}
	
	public void showVisitantes() {
		System.out.println(visitantes);
	}

}
