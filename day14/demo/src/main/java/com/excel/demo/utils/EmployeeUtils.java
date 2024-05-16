package com.excel.demo.utils;

import com.excel.demo.dto.EmployeeDto;
import com.excel.demo.entity.Employee;

public class EmployeeUtils {

	public static EmployeeDto entityToDto(Employee employee) {
		
		
		return EmployeeDto.builder().id(employee.getId()).employeeNo(employee.getEmployeeNo())
				.aadharNo(employee.getAadharNo()).firstName(employee.getFirstName()).panNo(employee.getPanNo())
				.mobileNo(employee.getMobileNo()).lastName(employee.getLastName()).build();
		
	}
	
	public static Employee updateValues(Employee employee, EmployeeDto dto) {
		
		employee.setFirstName(dto.getFirstName());
		employee.setLastName(dto.getLastName());
		employee.setAadharNo(dto.getAadharNo());
		employee.setEmployeeNo(dto.getEmployeeNo());
		employee.setMobileNo(dto.getMobileNo());
		employee.setPanNo(dto.getPanNo());
	
		return employee;
		
	}
}
