package com.curso.map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import com.curso.iterator.Employee;

public class MapDemos {
	
	public static void main(String[] args) {
		
		Employee e1 = new Employee(1, "Patrobas", 500.0);
		Employee e2 = new Employee(1, "Tercio", 200.0);
		Employee e3 = new Employee(2, "Andronico", 300.0);
		Employee e4 = new Employee(3, "Epeneto", 400.0);
		Employee e5 = new Employee(1, "Patrobas", 500.0);
		Employee e6 = new Employee(4, "Filologo", 500.0);

		Map<String,Employee> mapaEmpleados = new HashMap<>();
		
		mapaEmpleados.put("X400", e1);
		mapaEmpleados.put("X401", e1);
		mapaEmpleados.put("X402", e2);
		mapaEmpleados.put("X403", e3);
		mapaEmpleados.put("X404", e4);
		mapaEmpleados.put("X405", e5);
		mapaEmpleados.put("X406", e6);

		mapaEmpleados.forEach((k,v)->System.out.println(k+": "+v));
		
		Set<String> setString = mapaEmpleados.keySet();
		
		setString.forEach(System.out::println);
		
		Collection<Employee> colValores = mapaEmpleados.values();
		
		colValores.forEach(System.out::println);
		
		System.out.println(colValores.getClass().getName());
		
	}

}
