package com.excel.demo.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.excel.demo.dto.EmployeeDto;
import com.excel.demo.entity.Employee;
import com.excel.demo.repository.EmployeeRepository;




@Service
public class EmployeeServiceImpl  implements EmployeeService{
	
	@Autowired
	private EmployeeRepository employeeRepository;
	//	List<Employee> employees = new ArrayList<>();

	@Override
	public EmployeeDto addEmployee(EmployeeDto dto) {
		
		Employee employee = Employee.builder().firstName(dto.getFirstName()).lastName(dto.getLastName()).mobileNo(dto.getMobileNo())
				.aadharNo(dto.getAadharNo()).panNo(dto.getPanNo()).employeeNo(dto.getEmployeeNo()).build();
		
		Employee save = employeeRepository.save(employee);
//		employee.setId((int)(Math.random()*10));
//		employees.add(employee);
		
		
		return EmployeeDto.builder().id(save.getId()).employeeNo(save.getEmployeeNo())
				.aadharNo(save.getAadharNo()).firstName(save.getFirstName()).panNo(save.getPanNo())
				.mobileNo(save.getMobileNo()).lastName(save.getLastName()).build();
	 
	}
	
		
	

	@Override
	public List<EmployeeDto> getAllEmployee() {
		return employeeRepository.findAll().stream()
				.map(e->EmployeeDto.builder().id(e.getId()).aadharNo(e.getAadharNo()).firstName(e.getFirstName()).lastName(e.getLastName()).panNo(e.getPanNo())
						.mobileNo(e.getMobileNo()).build()).toList();
				
	
	}




	@Override
	public void deleteEmployee(EmployeeDto dto) {
	
		optional<Employee> optional
		
	}



}