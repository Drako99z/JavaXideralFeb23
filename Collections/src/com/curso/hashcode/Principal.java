package com.curso.hashcode;

public class Principal {

	public static void main(String[] args) {

		Employee e1 = new Employee(1, "Patrobas", 500.0);
		Employee e2 = new Employee(1, "Patrobas", 500.0);
		//Employee e3 = e1;
		
		System.out.println(e1.equals(e2));  //true
		//System.out.println(e1.equals(e3));  //true

		
	}

}
