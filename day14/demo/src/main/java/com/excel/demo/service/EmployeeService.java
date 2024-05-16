package com.excel.demo.service;

import java.util.List;

import com.excel.demo.dto.EmployeeDto;
import com.excel.demo.entity.Employee;

public interface EmployeeService {
	




	public EmployeeDto addEmployee(EmployeeDto dto);
	
	public List<EmployeeDto> getAllEmployee();
	
    public EmployeeDto updateEmployee(EmployeeDto employee);

    public void deleteEmployee(EmployeeDto dto);

	public EmployeeDto getEmployee(Integer id);

}
