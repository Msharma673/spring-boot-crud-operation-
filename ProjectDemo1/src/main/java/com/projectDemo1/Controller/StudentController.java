package com.projectDemo1.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.projectDemo1.Entity.Student;
import com.projectDemo1.Service.StudentService;



@RestController
public class StudentController {
	
	@Autowired
	private StudentService service;
	
	@PostMapping("/saveStudent")
	public ResponseEntity<?> saveStudent(@RequestBody Student request){
		
		return new ResponseEntity<> (service.saveStudent(request), HttpStatus.CREATED);
		
	}
	
	@GetMapping("/getAllStudent")
	public ResponseEntity<?> getAllStudent(){
		
		return new ResponseEntity<> (service.getAllStudent(), HttpStatus.OK);
		
	}
	
	@GetMapping("/deletStudent/{id}")
	public ResponseEntity<?> deleteStudent(@PathVariable Long id){
		
		return new ResponseEntity<> (service.deleteStudent(id), HttpStatus.OK);
		
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<?> getStudentById(@PathVariable Long id){
		
		return new ResponseEntity<> (service.getStudentById(id), HttpStatus.OK);
		
	}
	
	@PutMapping("/update/{id}")
	public ResponseEntity<?> updateStudent(@PathVariable Long id){
		
		return new ResponseEntity<> (service.updateStudent(id), HttpStatus.OK);
		
	}
	}
	