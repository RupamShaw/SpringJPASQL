package org.app.service;

import java.util.List;

import org.app.model.Student;
import org.app.model.StudentStatus;

public interface StudentMgr {
	public List<Student> getAllStudents() ;
	public Student getStudentbyId(long id);
	public StudentStatus getStudentStatusbyId(long id);
	public Student addStudent(Student student) ;
	public Student updateStudent(Student student);
	
	public void removeStudent(long id);
}
