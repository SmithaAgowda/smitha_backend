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

private Integer empExperienceId;
	
	private String companyName;
	private Integer yearOfPassing;
	private String dateOfJoining;
	private String dateOfRelieving;
	private String designation;
	private String location;
}
