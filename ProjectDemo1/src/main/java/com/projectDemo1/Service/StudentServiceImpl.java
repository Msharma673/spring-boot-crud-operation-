package com.projectDemo1.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.projectDemo1.Entity.Student;
import com.projectDemo1.Repository.StudentRepository;


@Service
public class StudentServiceImpl implements StudentService{

	@Autowired
	private StudentRepository studentrepo;
	
	@Override
	public Student saveStudent(Student request) {
		// TODO Auto-generated method stub
		return studentrepo.save(request);
	}

	@Override
	public List<Student> getAllStudent() {
		// TODO Auto-generated method stub
		return studentrepo.findAll();
	}

	@Override
	public Student getStudentById(Long id) {
		// TODO Auto-generated method stub
		return studentrepo.findById(id).get();
	}

	@Override
	public String deleteStudent(Long id) {
		
		Student std= studentrepo.findById(id).get();
		if (std !=null) {
			
			studentrepo.delete(std);
			return "deleted successfully";
		}
		return "deleted successfully";
	}

	

	@Override
	public Student updateStudent(Long id) {
		// TODO Auto-generated method stub
		
		Student std= studentrepo.findById(id).get();
		
		return studentrepo.save(std);
	}
	
	
}
