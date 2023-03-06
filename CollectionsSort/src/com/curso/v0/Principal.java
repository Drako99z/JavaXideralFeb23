package com.curso.v0;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Principal {

	public static void main(String[] args) {
		
		List<Empleado> listEmpleados = Arrays.asList(
				new Empleado("Patrobas", 20, 567.89),
				new Empleado("Tercio", 18, 167.89),
				new Empleado("Andronico", 30, 267.89),
				new Empleado("Epeneto", 22, 967.89)			
		);
		
		System.out.println("-------POR EDAD--------");
		
		Collections.sort(listEmpleados,(o1,o2)->o1.getEdad()-o2.getEdad());
		
		for (Empleado e: listEmpleados) {
			System.out.println(e);
		}
		
		System.out.println("-------POR SUELDO--------");
	
		Collections.sort(listEmpleados,(x,y)->(int)(y.getSueldo()-x.getSueldo()));
		
		for (Empleado e: listEmpleados) {
			System.out.println(e);
		}
		
		System.out.println("-------POR NOMBRE--------");
		
		Collections.sort(listEmpleados,(emp1,emp2)->emp2.getNombre().compareTo(emp1.getNombre()));
		
		for (Empleado e: listEmpleados) {
			System.out.println(e);
		}
		
	}

}
