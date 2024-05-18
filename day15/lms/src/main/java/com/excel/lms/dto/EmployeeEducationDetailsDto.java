package com.excel.lms.dto;

import com.excel.lms.enums.Contact;
import com.excel.lms.enums.Education;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class EmployeeEducationDetailsDto {

	private Education educationType;
	private Integer yearOfPass;
	private Double percentage;
	private String universityName;
	private String instituteName;
	private String specialization;
	private String state; 	
}
