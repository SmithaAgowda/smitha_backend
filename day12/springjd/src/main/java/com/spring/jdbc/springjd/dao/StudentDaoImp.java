package com.spring.jdbc.springjd.dao;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import com.spring.jdbc.springjd.entities.Student;

@Component("studentDao")
public class StudentDaoImp  implements StudentsDao{

	@Autowired
	private JdbcTemplate jdbcTemplate;

	
	public List<Student> select(){
		String query = "select * from student";
		List<Student>students = jdbcTemplate.query(query, new BeanPropertyRowMapper<Student>(Student.class));
		return students;
	}
	public Map<String, Object> select(Student student) {
		String query = "select * from student where idstudent = ?";
		return jdbcTemplate.queryForMap(query, student.getId());
	}
	
	public int create(Student student) {
		String query = "insert into student (idstudent, name, city) values (? , ? , ?)";
		return jdbcTemplate.update(query, student.getId(), student.getName(), student.getCity());
	}

	public int delete(Student student) {
		String query = "delete from student where idstudent = ?";
		return jdbcTemplate.update(query, student.getId());
	}

	public int update(Student student) {
		String query = "update student set city = ?  where idstudent = ?";
		return jdbcTemplate.update(query, student.getCity(),student.getId());
	}

	
}
