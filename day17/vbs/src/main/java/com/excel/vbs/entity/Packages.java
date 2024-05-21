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
@Table(name="packages")
public class Packages {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer packId;
	
	@Column(nullable = false)
	private String packName;
	
	@Column(nullable = false)
	private String packPrice;
	
	@Column(nullable = false)
	private String desc;
	
	@Column(nullable = false)
	private String isactive;


//	@OneToOne(fetch = FetchType.LAZY,cascade = CascadeType.ALL)
//	private ServiceDetails service;
//
//	@OneToOne(fetch = FetchType.LAZY,cascade = CascadeType.ALL)
//	private EmployeeReg employee;
	
	@OneToOne(fetch = FetchType.LAZY,cascade = CascadeType.ALL , mappedBy = "packages")
	private AssignPackages assignpackages;
	
	@OneToOne(fetch = FetchType.LAZY,cascade = CascadeType.ALL , mappedBy = "packages")
	private Invoice invoice;
}
