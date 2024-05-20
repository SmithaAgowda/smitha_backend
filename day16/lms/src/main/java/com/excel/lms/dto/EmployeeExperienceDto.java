package com.excel.lms.dto;



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
public class EmployeeExperienceDto {


	
	private String companyName;
	private Integer yearOfExperience;
	private String dateOfJoining;
	private String dateOfRelieving;
	private String designation;
	private String location;
}
