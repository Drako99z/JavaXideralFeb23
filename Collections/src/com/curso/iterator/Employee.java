package com.curso.iterator;

import java.util.Objects;

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

	@Override
	public int hashCode() {
		return Objects.hash(id, nombre, salary);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		return id == other.id && Objects.equals(nombre, other.nombre)
				&& Double.doubleToLongBits(salary) == Double.doubleToLongBits(other.salary);
	}

	


	
	
}
