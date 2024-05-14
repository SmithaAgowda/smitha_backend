package com.spring.hibernet.dao;

import java.util.List;

import com.spring.hibernet.entities.Student;

public interface StudentDao {

	 public int insert(Student student);

	 public void delete(int i); 
	 
	 public void delete(Student student); 
	 
	    public void update(Student student); 
	    
	    public Student getStudent(int id); 
	    
	    public List<Student> getAllStudents(); 


}
