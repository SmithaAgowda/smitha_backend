package com.excel.demo.service;

import java.util.List;

import com.excel.demo.dto.EmployeeDto;
import com.excel.demo.entity.Employee;

public interface EmployeeService {
	




	public EmployeeDto addEmployee(EmployeeDto dto);
	


	

	void deleteEmployee(EmployeeDto dto);





	public List<EmployeeDto> getAllEmployee();

}
