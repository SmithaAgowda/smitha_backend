package com.excel.vbs.dto;

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
public class EmployeeRegDto {
	
	private String empName;
	private String empPass;
	private String email;
	private String address;
	private String city;
	private String empType;
	private String is_active;
}
