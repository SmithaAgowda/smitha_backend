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
@Table(name="emp_reg")
public class EmployeeReg {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer empId;
	
	@Column(nullable = false)
	private String empName;
	
	@Column(nullable = false)
	private String empPass;
	
	@Column(nullable = false)
	private String email;
	
	@Column(nullable = false)
	private String address;
	
	@Column(nullable = false)
	private String city;
	
	@Column(nullable = false)
	private String empType;
	
	@Column(nullable = false)
	private String isactive;
	
	@OneToOne(fetch = FetchType.LAZY,cascade = CascadeType.ALL )
	private Pincode pincode;
	
//	@OneToOne(fetch = FetchType.LAZY,cascade = CascadeType.ALL,mappedBy = "employee" )
//	private Packages packages;
	
	@OneToOne(fetch = FetchType.LAZY,cascade = CascadeType.ALL , mappedBy = "employee")
	private AssignPackages assignpackages;
	
	@OneToOne(fetch = FetchType.LAZY,cascade = CascadeType.ALL , mappedBy = "employee")
	private AssignMech assignmech;

}
