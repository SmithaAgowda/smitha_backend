package com.spring.jdbc.springjd.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import com.spring.jdbc.springjd.entities.Student;

@Component("studentDao")
public class StudentDaoImp  implements StudentsDao{

	@Autowired
	private JdbcTemplate jdbcTemplate;

	
	@Override
	public int insertStudent(Student student) {
		
		String query = "insert into student (idstudent,name,city) values (?,?,?)";
		return jdbcTemplate.update(query,student.getId(),student.getName(),student.getCity());
	}
	
	@Override
	public int deleteStudent(Student student2) {
		
		String query1 ="delete from student where idstudent=?";
		return jdbcTemplate.update(query1,student2.getId());
	}
	
	@Override
	public boolean updateStudent(Student student)
	{
		String query2 ="update student set name = ?, city = ? where idstudent = ?";
		return jdbcTemplate.update(query2,student.getName(),student.getCity(),student.getId())>=1;
	}
	
}
