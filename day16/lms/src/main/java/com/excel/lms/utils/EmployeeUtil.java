package com.excel.lms.utils;

import java.util.ArrayList;

import com.excel.lms.dto.EmployeeBankDetailsDto;
import com.excel.lms.dto.EmployeePrimaryInfoDto;
import com.excel.lms.dto.EmployeeSecondaryInfoDto;
import com.excel.lms.dto.EmployeeTechnicalSkillDto;
import com.excel.lms.entity.EmployeeBankDetails;
import com.excel.lms.entity.EmployeePrimaryInfo;
import com.excel.lms.entity.EmployeeSecondaryInfo;
import com.excel.lms.entity.EmployeeTechnicalSkill;



public class EmployeeUtil {
	
	public static EmployeePrimaryInfo dtoToEntity(EmployeePrimaryInfoDto dto)
	{
		return EmployeePrimaryInfo.builder()
				.employeeId(dto.getEmployeeId())
				.employeeName(dto.getEmployeeName())
				.dateOfJoining(dto.getDateOfJoining())
				.dateOfBirth(dto.getDateOfBirth())
				.bloodGroup(dto.getBloodGroup())
				.designation(dto.getDesignation())
				.email(dto.getEmail())
				.gender(dto.getGender())
				.nationality(dto.getNationality())
				.employeeStatus(dto.getEmployeeStatus())
				.build();
	}
	

	public static EmployeeSecondaryInfo dtoToEntity(EmployeeSecondaryInfoDto dto) {
		
		return EmployeeSecondaryInfo.builder()
				.panNo(dto.getPanNo())
				.aadharNo(dto.getAadharNo())
				.fatherName(dto.getFatherName())
				.motherName(dto.getMotherName())
				.spouseName(dto.getSpouseName())
				.passportNo(dto.getPassportNo())
				.maritalStatus(dto.getMaritalStatus()).build();
		
	}
	
	public static EmployeeBankDetails dtoToEntity(EmployeeBankDetailsDto dto) {
		return EmployeeBankDetails.builder()
				.accountNo(dto.getAccountNo())
				.bankName(dto.getBankName())
				.accountType(dto.getAccountType())
				.ifscCode(dto.getIfscCode())
				.branch(dto.getBranch())
				.state(dto.getState())
				.build();
		
	}
	
	public static EmployeeTechnicalSkill dtoToEntity(EmployeeTechnicalSkillDto dto) {
		return EmployeeTechnicalSkill.builder()
				.skillType(dto.getSkillType())
				.skillRating(dto.getSkillRating())
				.yearOfExp(dto.getYearOfExp()).employee(new ArrayList<>())
				.build();
		
	}

}
