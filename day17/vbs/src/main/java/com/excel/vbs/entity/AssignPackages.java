package com.excel.vbs.entity;

import java.time.LocalDate;

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
@Table(name="assign_packages")
public class AssignPackages {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer assignpackId;
	
	@Column(nullable = false)
	private LocalDate selectDate;
	
	@OneToOne(fetch = FetchType.LAZY,cascade = CascadeType.ALL)
	private EmployeeReg employee;
	
	@OneToOne(fetch = FetchType.LAZY,cascade = CascadeType.ALL)
	private Packages packages;
	
}
