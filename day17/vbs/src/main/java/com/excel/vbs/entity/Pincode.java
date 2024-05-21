package com.excel.vbs.entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
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
@Table(name="pincode")
public class Pincode {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer pinId;
	
	@Column(nullable = false)
	private String pincode;

	@OneToOne(fetch = FetchType.LAZY,cascade = CascadeType.ALL, mappedBy = "pincode")
	private CustomerReg customer;
	
	@OneToOne(fetch = FetchType.LAZY,cascade = CascadeType.ALL, mappedBy = "pincode")
	private EmployeeReg employee;
}
