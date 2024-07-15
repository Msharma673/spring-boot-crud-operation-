package com.projectDemo1.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projectDemo1.Entity.Student;



public interface StudentRepository  extends JpaRepository<Student ,Long>{

}
