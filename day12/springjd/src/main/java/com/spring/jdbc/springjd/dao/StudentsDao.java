package com.spring.jdbc.springjd.dao;



import com.spring.jdbc.springjd.entities.Student;

public interface StudentsDao {
	


	public int insertStudent(Student student);

	public int deleteStudent(Student student);

	public boolean updateStudent(Student student1);

}
