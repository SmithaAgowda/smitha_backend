package com.example.vehiclebooking.services;

import java.util.List;

import com.example.vehiclebooking.dto.CustomerRegistrationDto;
import com.example.vehiclebooking.dto.EmployeeRegisterDto;

public interface EmployeeService {

	public Integer saveEmpInfo(EmployeeRegisterDto dto);
	public List<EmployeeRegisterDto> getAllEmployees();
	public EmployeeRegisterDto getEmployee(Integer id);
	
	public void deleteEmployee(EmployeeRegisterDto dto);
	public EmployeeRegisterDto updateEmployee(EmployeeRegisterDto customerDetails);
	public Object getAllEmployee();


}
