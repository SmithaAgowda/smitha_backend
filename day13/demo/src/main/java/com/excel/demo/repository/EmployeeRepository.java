package com.excel.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.excel.demo.entity.Employee;


//public interface EmployeeRepository extends CrudRepository<Employee,Integer>{

public interface EmployeeRepository extends JpaRepository<Employee,Integer>{

}
