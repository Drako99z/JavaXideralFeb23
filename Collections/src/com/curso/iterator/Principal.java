package com.curso.iterator;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.Queue;

public class Principal {

	public static void main(String[] args) {
		
		Iterator<Employee> iteratorEmployees;

		Employee e1 = new Employee(1, "Patrobas", 500.0);
		Employee e2 = new Employee(1, "Tercio", 200.0);
		Employee e3 = new Employee(2, "Andronico", 300.0);
		Employee e4 = new Employee(3, "Epeneto", 400.0);
		Employee e5 = new Employee(1, "Patrobas", 500.0);
		Employee e6 = new Employee(4, "Filologo", 500.0);

		Set<Employee> setEmpleados = new HashSet<>();

		setEmpleados.add(e1);
		setEmpleados.add(e2);
		setEmpleados.add(e3);
		setEmpleados.add(e4);
		setEmpleados.add(e5);
		setEmpleados.add(e6);

		iteratorEmployees = setEmpleados.iterator();
		
		showCollection(iteratorEmployees);
		
		List<Employee> listEmpleados = new ArrayList<>();

		listEmpleados.add(e1);
		listEmpleados.add(e2);
		listEmpleados.add(e3);
		listEmpleados.add(e4);
		listEmpleados.add(e5);
		listEmpleados.add(e6);
		
		iteratorEmployees = listEmpleados.iterator();
		
		showCollection(iteratorEmployees);

		Queue<Employee> queueEmpleados = new LinkedList<>();

		queueEmpleados.add(e1);
		queueEmpleados.add(e2);
		queueEmpleados.add(e3);
		queueEmpleados.add(e4);
		queueEmpleados.add(e5);
		queueEmpleados.add(e6);
		
		iteratorEmployees = queueEmpleados.iterator();
		
		showCollection(iteratorEmployees);

	}

	static void showCollection(Iterator<Employee> iterator) {
		System.out.println("*****************");
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}

	}

}
