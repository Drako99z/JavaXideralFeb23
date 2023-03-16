package com.curso.hashcode.v1;

import java.util.HashSet;
import java.util.Set;

public class Principal {

	public static void main(String[] args) {

		Employee e1 = new Employee(1, "Patrobas", 500.0);
		Employee e2 = new Employee(1, "Tercio", 200.0);
		Employee e3 = new Employee(2, "Andronico", 300.0);
		Employee e4 = new Employee(3, "Epeneto", 400.0);
		Employee e5 = new Employee(1, "Patrobas", 500.0);
		Employee e6 = new Employee(4, "Filologo", 500.0);
		
		Set<String> setNombres = new HashSet<>();
		
		setNombres.add(e1.getNombre());
		setNombres.add(e2.getNombre());
		setNombres.add(e3.getNombre());
		setNombres.add(e4.getNombre());
		setNombres.add(e5.getNombre());
		setNombres.add(e6.getNombre());
		
		setNombres.forEach(System.out::println);
		
		System.out.println("***************");
		
		System.out.println(e1.equals(e5));
		
		Set<Employee> setEmpleados = new HashSet<>();
		
		setEmpleados.add(e1);
		setEmpleados.add(e2);
		setEmpleados.add(e3);
		setEmpleados.add(e4);
		setEmpleados.add(e5);
		setEmpleados.add(e6);
		
		setEmpleados.forEach(System.out::println);
		
	}

}
