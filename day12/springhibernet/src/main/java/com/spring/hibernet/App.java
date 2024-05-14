package com.spring.hibernet;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.spring.hibernet.dao.StudentDao;
import com.spring.hibernet.entities.Student;

public class App 
{
    public static void main( String[] args )
    {
       ApplicationContext context = new AnnotationConfigApplicationContext(HibernateConfig.class);
       
       StudentDao dao = context.getBean("studentDao",StudentDao.class);
       
       
       //insert
//       Student student=new Student(2,"Disha"); 
//       dao.insert(student); 
//       
       //delete
//       dao.delete(); 
       
     //update
//      Student student=dao.getStudent(5); 
//      student.setName("Priya"); 
//      dao.update(student); 
       
       //display by id
//      Student student=dao.getStudent(1); 
//      System.out.println(student); 
       
       
       //list students
       dao.insert(new Student(102,"Danish")); 
       dao.insert(new Student(103,"Sneha")); 
 
     
       List<Student> students=dao.getAllStudents(); 
       for(Student student:students) 
       { 
           System.out.println(student); 
       } 
      
    }
}
