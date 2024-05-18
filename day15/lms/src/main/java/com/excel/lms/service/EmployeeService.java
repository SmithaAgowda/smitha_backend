package com.excel.lms.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.excel.lms.dto.EducationListDto;
import com.excel.lms.dto.EmployeeBankDetailsDto;
import com.excel.lms.dto.EmployeePrimaryInfoDto;
import com.excel.lms.dto.EmployeeSecondaryInfoDto;
import com.excel.lms.entity.EmployeeBankDetails;
import com.excel.lms.entity.EmployeeEducationDetails;
import com.excel.lms.entity.EmployeePrimaryInfo;
import com.excel.lms.entity.EmployeeSecondaryInfo;
import com.excel.lms.exception.EmployeeExistance;
import com.excel.lms.repository.EmployeeBankRepository;
import com.excel.lms.repository.EmployeeRepository;
import com.excel.lms.repository.EmployeeSecondaryRepository;
import com.excel.lms.repository.EmpoyeeEducationRepository;
import com.excel.lms.utils.EmployeeUtil;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class EmployeeService {

	@Autowired
	private EmployeeRepository employeeRepository;
	@Autowired
	private EmployeeSecondaryRepository employeeSecRepository;
	@Autowired
	private EmployeeBankRepository employeeBankRepository;
	@Autowired
	private EmpoyeeEducationRepository empoyeeEducationRepository;

	public String savePrimaryInfo(EmployeePrimaryInfoDto dto) {

		if (!employeeRepository.findByEmployeeId(dto.getEmployeeId()).isPresent()) {
			EmployeePrimaryInfo emp = EmployeeUtil.dtoToEntity(dto);
			EmployeePrimaryInfo emp1 = employeeRepository.save(emp);
			return emp1.getEmployeeId();
		}
		throw new EmployeeExistance("Check");

	}

	public String saveSecondaryInfo(EmployeeSecondaryInfoDto dto) {
		Optional<EmployeePrimaryInfo> optional = employeeRepository.findByEmployeeId(dto.getEmployeeId());

		if (optional.isPresent()) {

			EmployeePrimaryInfo employee = optional.get();
			if (employee.getSecondaryInfo() == null) {
				EmployeeSecondaryInfo employeeSecondaryInfo = EmployeeUtil.dtoToEntity(dto);

				employee.setSecondaryInfo(employeeSecondaryInfo);
				employeeSecondaryInfo.setEmployee(employee);

				return employeeRepository.save(employee).getEmployeeId();
//				employeeSecRepository.save(employeeSecondaryInfo).getEmployee().getEmployeeId();
			} else {
				EmployeeSecondaryInfo secondaryInfo = employee.getSecondaryInfo();

				secondaryInfo.setPanNo(dto.getPanNo());
				secondaryInfo.setAadharNo(dto.getAadharNo());
				secondaryInfo.setFatherName(dto.getFatherName());
				secondaryInfo.setMotherName(dto.getMotherName());
				secondaryInfo.setMaritalStatus(dto.getMaritalStatus());
				secondaryInfo.setPassportNo(dto.getPassportNo());
				secondaryInfo.setSpouseName(dto.getSpouseName());

				return employeeRepository.save(employee).getEmployeeId();
			}
//			return emp1.getEmpSecondaryId();
		}

		throw new EmployeeExistance("Check");

	}

	public String saveBankInfo(EmployeeBankDetailsDto dto) {

		Optional<EmployeePrimaryInfo> optional = employeeRepository.findByEmployeeId(dto.getEmployeeId());
		if (optional.isPresent()) {
			EmployeePrimaryInfo employee = optional.get();
			if (employee.getBankInfo() == null) {
				EmployeeBankDetails employeeBankDetails = EmployeeUtil.dtoToEntity(dto);

				employee.setBankInfo(employeeBankDetails);
				employeeBankDetails.setEmployee(employee);

				return employeeRepository.save(employee).getEmployeeId();
			} else {
				EmployeeBankDetails bankDetails = employee.getBankInfo();
				bankDetails.setAccountNo(dto.getAccountNo());
				bankDetails.setBankName(dto.getBankName());
				bankDetails.setAccountType(dto.getAccountType());
				bankDetails.setIfscCode(dto.getIfscCode());
				bankDetails.setBranch(dto.getBranch());
				bankDetails.setState(dto.getState());

				return employeeRepository.save(employee).getEmployeeId();
			}
		}

		throw new EmployeeExistance("Check");
	}

	public String addEducations(EducationListDto dto) {
		Optional<EmployeePrimaryInfo> optional = employeeRepository.findByEmployeeId(dto.getEmployeeId());
		
		if(optional.isPresent()) {
			EmployeePrimaryInfo employee = optional.get();
			List<EmployeeEducationDetails> educations = dto.getEducations().stream()
					.map(edu->EmployeeEducationDetails.builder()
							.educationType(edu.getEducationType())
							.yearOfPass(edu.getYearOfPass())
							.percentage(edu.getPercentage())
							.universityName(edu.getUniversityName())
							.instituteName(edu.getInstituteName())
							.specialization(edu.getSpecialization())
							.state(edu.getState())
							.build()).toList();
			
			if(employee.getEmployeeEducationDetails() !=null) {
				employee.getEmployeeEducationDetails().stream().forEach(empoyeeEducationRepository::delete);
				employee.setEmployeeEducationDetails(null);
			}
			employee.setEmployeeEducationDetails(educations);
			educations.stream().forEach(edu->edu.setEmployee(employee));
		   return 	employeeRepository.save(employee).getEmployeeId();
		}
		throw new EmployeeExistance("Check");
	}

}
