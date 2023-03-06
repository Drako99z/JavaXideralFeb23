package com.curso.v0;

public class PredicadoRico 
		implements PredicadoEmpleado  {

	@Override
	public boolean probar(Empleado e) {
		return e.getSueldo()>500;
	}

}
