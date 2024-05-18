package com.excel.lms.entity;

import com.excel.lms.enums.AccountType;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
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
@Entity
@Table(name="employee_bank_details")

public class EmployeeBankDetails {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer empBankId;
	
	private Long accountNo;
	private String bankName;
	
	@Enumerated(EnumType.STRING)
	private AccountType accountType;
	private String ifscCode;
	private String branch;
	private String state;
	
	@OneToOne(fetch = FetchType.LAZY , cascade = CascadeType.ALL )
	private EmployeePrimaryInfo employee;
}
