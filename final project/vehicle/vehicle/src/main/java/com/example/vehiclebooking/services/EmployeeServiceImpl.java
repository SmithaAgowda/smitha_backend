package com.example.vehiclebooking.services;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.vehiclebooking.constants.Vehicleconstants;
import com.example.vehiclebooking.dto.CustomerRegistrationDto;
import com.example.vehiclebooking.dto.EmployeeRegisterDto;
import com.example.vehiclebooking.entity.CustomerRegistration;
import com.example.vehiclebooking.entity.EmployeeRegister;
import com.example.vehiclebooking.exception.EmployeeExistance;
import com.example.vehiclebooking.repository.EmployeeRepository;
import com.example.vehiclebooking.utils.VehicleUtil;


@Service
public class EmployeeServiceImpl implements EmployeeService{
	@Autowired
	private EmployeeRepository employeeRepository;

	@Override
	public Integer saveEmpInfo(EmployeeRegisterDto dto) {
		if (!employeeRepository.findByEmployeeId(dto.getEmployeeId()).isPresent()) {
			EmployeeRegister emp = VehicleUtil.dtoToEntity(dto);
			EmployeeRegister emp1 = employeeRepository.save(emp);
			return emp1.getEmployeeId();
		}
		throw new EmployeeExistance("Check");
}

	@Override
	public List<EmployeeRegisterDto> getAllEmployee() {
		return employeeRepository.findAll().stream().map(e->EmployeeRegisterDto.builder()
				.employeeId(e.getEmployeeId())
				.employeeName(e.getEmployeeName())
				.employeePassword(e.getEmployeePassword())
				.employeeAddress(e.getEmployeeAddress())
				.employeeCity(e.getEmployeeCity())
				.employeePhoneNumber(e.getEmployeePhoneNumber())
				.employeeAddress(e.getEmployeeAddress())
				.build()).toList();
				
	}

	@Override
	public EmployeeRegisterDto getEmployee(Integer id) {
		try {
			Optional<EmployeeRegister> optional = employeeRepository.findById(id);
			if (optional.isPresent()) {
				EmployeeRegister cust = optional.get();
				return VehicleUtil.entityToDto(cust);
			}
			throw new EmployeeExistance("Employee Not Found with ID:" + id);
		} catch (EmployeeExistance e) {
			throw e;
		} catch (Exception e) {
			throw new EmployeeExistance("invali id");
		}
	}

	@Override
	public void deleteEmployee(EmployeeRegisterDto dto) {
		Optional<EmployeeRegister> optional = employeeRepository.findById(dto.getEmployeeId());

		if (optional.isPresent()) {
			employeeRepository.delete(optional.get());
		} else {
			throw new EmployeeExistance(Vehicleconstants.PinNOT_FOUND);
		}
		
	}

	@Override
	public EmployeeRegisterDto updateEmployee(EmployeeRegisterDto employeeDetails) {
		Optional<EmployeeRegister> optional = employeeRepository.findByEmployeeId(employeeDetails.getEmployeeId());
		if (optional.isPresent()) {
			EmployeeRegister customerOptional = optional.get();
		
			customerOptional.setEmployeeId(employeeDetails.getEmployeeId());
	        
			EmployeeRegister save = employeeRepository.save(customerOptional);
			
			return EmployeeRegisterDto.builder()
					.employeeName(save.getEmployeeName())
					.employeePassword(save.getEmployeePassword())
					.employeeEmail(save.getEmployeeEmail())
					.employeeCity(save.getEmployeeCity())
					.employeePhoneNumber(save.getEmployeePhoneNumber())
					.employeeAddress(save.getEmployeeAddress())
					.build();
		}
		throw new EmployeeExistance(Vehicleconstants.PinNOT_FOUND);
	}

	@Override
	public List<EmployeeRegisterDto> getAllEmployees() {
		// TODO Auto-generated method stub
		return null;
	}

	
	}
	
	
			
