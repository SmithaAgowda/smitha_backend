package com.spring.jdbc.springjd;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


import com.spring.jdbc.springjd.dao.StudentsDao;
import com.spring.jdbc.springjd.entities.Student;


public class App 
{
	private static ApplicationContext act;
	
    public static void main( String[] args )
    {
       ApplicationContext context = new  AnnotationConfigApplicationContext(JdbcConfig.class);
       
       act = new AnnotationConfigApplicationContext(JdbcConfig.class);
       //insertion
//       StudentsDao dao = context.getBean("studentDao",StudentsDao.class);
       
//       Student student = new Student();
//
//       student.setId(5);
//       student.setName("Yatharth");
//       student.setCity("mysore");
//
//		int res = dao.create(student);
//
//		if (res != 0) {
//			System.out.println("Inserted Successfully");
//		} else {
//			System.out.println("Insertion Failed");
//		}
//
//		act = new AnnotationConfigApplicationContext(JdbcConfig.class);

       //select using list
		StudentsDao dao1 = act.getBean("studentDao", StudentsDao.class);
		System.out.println(dao1.select());
       
       
       //maping by id
//      Student student = new Student();
//      student.setId(4);
//		StudentsDao dao1 = act.getBean("studentDao", StudentsDao.class);
//		System.out.println(dao1.select(student));

       
       //deleting
//       Student student = new Student();
//       student.setId(4);
//       StudentsDao dao1 = act.getBean("studentDao", StudentsDao.class);   
//       System.out.println(dao1.delete(student)); 
//       
       //update
//       Student student = new Student();
//       student.setCity("Bangalore");
//       student.setId(1);
//       
//       StudentsDao dao1 = act.getBean("studentDao", StudentsDao.class); 
//       System.out.println(dao1.update(student)); 
       
      
       
       
		
	}
       
}
