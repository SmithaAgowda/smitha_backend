package com.excel.lms.dto;

import com.excel.lms.enums.AccountType;
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
public class EmployeeBankDetailsDto {

	private String employeeId;
	private Long accountNo;
	private String bankName;
	private AccountType accountType;
	private String ifscCode;
	private String branch;
	private String state;
}
