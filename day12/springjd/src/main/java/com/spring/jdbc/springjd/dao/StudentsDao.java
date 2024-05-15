package com.spring.jdbc.springjd.dao;



import java.util.List;
import java.util.Map;

import com.spring.jdbc.springjd.entities.Student;

public interface StudentsDao {
	
public List<Student> select();

	public Map<String, Object> select(Student student);

	public int create(Student student);

	public int delete(Student student);

	public int update(Student student);

}
