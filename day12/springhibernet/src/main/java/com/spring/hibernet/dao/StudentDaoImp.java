package com.spring.hibernet.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Component;

import com.spring.hibernet.entities.Student;


@Component("studentDao")
public class StudentDaoImp implements StudentDao{
	
	@Autowired
	private HibernateTemplate hibTemplate;

	
	public void sethTemplate(HibernateTemplate hibTemplate) { 
        this.hibTemplate = hibTemplate; 
    } 
	
	@Override
	@Transactional
	public int insert(Student student) {
		
	
		return (int) hibTemplate.save(student);
	}
	
	
	@Transactional
    public void delete(int id) { 
        Student student=hibTemplate.get(Student.class,id); 
        hibTemplate.delete(student); 
    } 
	
	 @Override
	 @Transactional
	 public void delete(Student student) { 
	     hibTemplate.delete(student); 
	    } 
	  
	 @Override
	 @Transactional
	 public void update(Student student) { 
	      hibTemplate.update(student); 
	    }

	@Override
	public Student getStudent(int id) {
		 return hibTemplate.get(Student.class,id); 
	
	}

	@Override
	public List<Student> getAllStudents() {
		 return hibTemplate.loadAll(Student.class); 
	
	}
  
	

}
