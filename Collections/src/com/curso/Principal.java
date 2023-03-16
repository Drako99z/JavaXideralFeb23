package com.curso;

import java.util.*;


public class Principal {

	public static void main(String[] args) {

		List<Employee> list = new ArrayList<>();
		
		list.add(new Employee(0, "Patrobas", 100.0));
		list.add(new Employee(1, "Tercio", 200.0));
		list.add(new Employee(2, "Andronico", 300.0));
		list.add(new Employee(3, "Epeneto", 400.0));
		
		Employee e = new Employee(4, "Filologo", 500.0);
		
		list.add(1, e);

		System.out.println(list.get(4));
		
	}

}
