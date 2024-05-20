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
public class EmployeeTechnicalSkillDto {

	private String skillType;
	private String skillRating;
	private Integer yearOfExp;

}
