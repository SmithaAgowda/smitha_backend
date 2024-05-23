package com.example.vehiclebooking.dto;



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
public class EmployeeRegisterDto {

	private Integer employeeId;
	private String employeeName;
	private String employeePassword;
	private String employeeEmail;
	private String employeePhoneNumber;
	private String employeeAddress;
	private String employeeCity;
}
