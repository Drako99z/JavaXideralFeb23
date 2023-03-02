package com.luv2code.web.jdbc;

import java.util.ArrayList;
import java.util.List;

public class StudentDbDummy {

	static List<Estudiante> students = new ArrayList<>();
	static int idContador;

	StudentDbDummy() {
		students.add(new Estudiante(++idContador, "Patrobas", "ApellidoPatrobas", "patrobas@gmail.com"));
		students.add(new Estudiante(++idContador, "Tercio", "ApellidoTercio", "tercio@gmail.com"));
		students.add(new Estudiante(++idContador, "Andronico", "ApellidoAndronico", "andronico@gmail.com"));
	}

	public List<Estudiante> getStudents() throws Exception {
		return students;
	}

	public void addStudent(Estudiante theStudent) throws Exception {
		theStudent.setId(++idContador);
		students.add(theStudent);
	}

	public Estudiante getStudent(String theStudentId) throws Exception {
		for (Estudiante e : students) {
			if (e.getId() == Integer.valueOf(theStudentId)) {
				return e;
			}
		}
		return null;
	}

	public void updateStudent(Estudiante elEstudiante) throws Exception {		
		for (Estudiante e : students) {
			if (e.getId() == elEstudiante.getId()) {
				e.setNombre(elEstudiante.getNombre());
				e.setApellido(elEstudiante.getApellido());
				e.setEmail(elEstudiante.getEmail());
			}
		}
	}

//	//NO FUNCIONA
//	public void updateStudent(Student elEstudiante) throws Exception {
//		for (Student e : students) {
//			if (e.getId() == elEstudiante.getId()) {
//				e = elEstudiante;
//			}
//		}
//	}

	public void deleteStudent(String theStudentId) throws Exception {

		for (Estudiante e : students) {
			if (e.getId() == Integer.valueOf(theStudentId)) {
				students.remove(e);
				return;
			}
		}
		
	}
}
