package com.spring.jdbc.springjd;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


import com.spring.jdbc.springjd.dao.StudentsDao;
import com.spring.jdbc.springjd.entities.Student;


public class App 
{
    public static void main( String[] args )
    {
       ApplicationContext context = new  AnnotationConfigApplicationContext(JdbcConfig.class);
       
       StudentsDao dao = context.getBean("studentDao",StudentsDao.class);
       
       Student student = new Student();
       student.setId(8);
       student.setName("john");
       student.setCity("mysore");
       
       int res = dao.insertStudent(student);
       System.out.println(res);
       
       
       Student student2 = new Student();
       student.setId(4);
       int res1 = dao.deleteStudent(student2);
      
       System.out.println(res1);
       
  
       Student student1 = new Student();
       student1.setName("Disha");
       boolean res2 = dao.updateStudent(student1);
       System.err.println(res2);
       
    }
}
