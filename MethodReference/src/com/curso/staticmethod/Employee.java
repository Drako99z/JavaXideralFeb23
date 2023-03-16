package com.curso.staticmethod;

public class Employee {
	
	private int id;
	private String nombre;
	private double salary;
	
	public Employee(int id, String nombre, double salary) {
		this.id = id;
		this.nombre = nombre;
		this.salary = salary;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", nombre=" + nombre + ", salary=" + salary + "]";
	}
	
	public static void incrementarSalario(Employee emp) {
		emp.setSalary(emp.getSalary()*1.10);
	}
	
	public static Employee decrementarSalario(Employee emp,double dec) {
		emp.setSalary(emp.getSalary()-(emp.getSalary()*dec));
		return emp;
	}
}








