package com.curso.v0;

public class PredicadoMayorDeEdad 
		implements PredicadoEmpleado  {

	@Override
	public boolean probar(Empleado e) {
		return e.getEdad()>=18;
	}

}
