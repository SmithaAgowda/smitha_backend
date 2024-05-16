package com.excel.demo.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.excel.demo.constant.EmployeeConstant;
import com.excel.demo.dto.EmployeeDto;
import com.excel.demo.entity.Employee;
import com.excel.demo.exception.EmployeeExceptionHandler;
import com.excel.demo.exception.EmployeeNotFound;
import com.excel.demo.repository.EmployeeRepository;
import com.excel.demo.utils.EmployeeUtils;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeRepository employeeRepository;
	// List<Employee> employees = new ArrayList<>();
	private Employee Empsave;

	@Override
	public EmployeeDto addEmployee(EmployeeDto dto) {

		Employee employee = Employee.builder().firstName(dto.getFirstName()).lastName(dto.getLastName())
				.mobileNo(dto.getMobileNo()).aadharNo(dto.getAadharNo()).panNo(dto.getPanNo())
				.employeeNo(dto.getEmployeeNo()).build();

		Employee save = employeeRepository.save(employee);
		return EmployeeUtils.entityToDto(employee);

	}

	@Override
	public List<EmployeeDto> getAllEmployee() {
		return employeeRepository.findAll().stream()
				.map(e -> EmployeeDto.builder().id(e.getId()).aadharNo(e.getAadharNo()).firstName(e.getFirstName())
						.lastName(e.getLastName()).panNo(e.getPanNo()).mobileNo(e.getMobileNo()).build())
				.toList();

	}

	@Override
	public void deleteEmployee(EmployeeDto dto) {

		Optional<Employee> optional = employeeRepository.findById(dto.getId());

		if (optional.isPresent()) {
			employeeRepository.delete(optional.get());
		} else {
			throw new EmployeeNotFound(EmployeeConstant.EMPLOYEE_NOT_FOUND);
		}

	}

	@Override
	public EmployeeDto updateEmployee(EmployeeDto dto) {

		Optional<Employee> optional = employeeRepository.findById(dto.getId());
		if (optional.isPresent()) {
			Employee employeeOptional = optional.get();
//				Employee updateValues = EmployeeUtils.updateValues(employee2, employee);
			employeeOptional.setFirstName(dto.getFirstName());
			employeeOptional.setLastName(dto.getLastName());
			employeeOptional.setMobileNo(dto.getMobileNo());
			Employee save = employeeRepository.save(employeeOptional);
			
			return EmployeeDto.builder()
					.id(save.getId())
					.aadharNo(save.getAadharNo())
					.firstName(save.getFirstName())
					.lastName(save.getLastName())
					.panNo(save.getPanNo())
					.mobileNo(save.getMobileNo())
					.build();
		}
		return null;
	}

	@Override
	public EmployeeDto getEmployee(Integer id) {
		try {
			Optional<Employee> optional = employeeRepository.findById(id);
			if (optional.isPresent()) {
				Employee employee = optional.get();
				return EmployeeUtils.entityToDto(employee);
			}
			throw new EmployeeNotFound("Employee Not Found with ID:" + id);
		} catch (EmployeeNotFound e) {
			throw e;
		} catch (Exception e) {
			throw new EmployeeNotFound("invali di");
		}
	}

}
