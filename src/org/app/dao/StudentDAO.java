package org.app.dao;

import java.util.List;

import org.app.model.Student;

import org.app.model.Student;

public interface StudentDAO {
	Student addStudent(Student Student);

	void removeStudent(long id);

	Student updateStudent(Student Student);

	List<Student> listStudents();

	Student findByIdOrThrowException(long id);

	

	// void delete(AppUser appUser);

	void flush();
}
