package com.projectDemo1.Service;

import java.util.List;

import com.projectDemo1.Entity.Student;



public interface StudentService {
	
	public Student saveStudent (Student request);
	
	public List<Student> getAllStudent();
	
	public Student getStudentById(Long id);
	
	public String deleteStudent(Long id);
	
	public Student updateStudent(Long id);
	
	
	

}
