package com.excel.lms.entity;

import com.excel.lms.enums.AddressType;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
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
@Table(name="employee_address_details")

public class EmployeeAddressDetails {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer empAddrsId;
	
	@Enumerated(EnumType.STRING)
	private AddressType addressType;
	private String doorNo;
	private String street;
	private String locality;
	private String city;
	private String state;
	private String pincode;
	private String landMark;
	
	@ManyToOne(fetch = FetchType.LAZY,cascade = CascadeType.ALL)
	private EmployeePrimaryInfo employee;
}
