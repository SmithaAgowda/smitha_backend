package com.excel.lms.entity;

import java.time.LocalDate;
import java.util.List;

import com.excel.lms.enums.Designation;
import com.excel.lms.enums.EmployeeStatus;
import com.excel.lms.enums.Gender;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name="employee_primary_info")
public class EmployeePrimaryInfo {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer empPrimaryId;
	
	
	private String employeeId;
	private String employeeName;
	private LocalDate dateOfJoining;
	private LocalDate dateOfBirth;
	private String email;
	private String bloodGroup;
	
	@Enumerated(EnumType.STRING)
	private Designation designation;
	
	@Enumerated(EnumType.STRING)
	private Gender gender;
	private String nationality;
	
	@Enumerated(EnumType.STRING)
	private EmployeeStatus employeeStatus;
	
	@OneToOne(fetch = FetchType.LAZY,cascade = CascadeType.ALL , mappedBy = "employee")
	private EmployeeSecondaryInfo secondaryInfo;
	
	@OneToOne(fetch = FetchType.LAZY,cascade = CascadeType.ALL , mappedBy = "employee")
	private EmployeeBankDetails bankInfo;
	
	@OneToMany(fetch = FetchType.LAZY,cascade = CascadeType.ALL,mappedBy = "employee")
	private List<EmployeeExperience> employeeExperience;
	
	@OneToMany(fetch = FetchType.LAZY,cascade = CascadeType.ALL,mappedBy = "employee")
	private List<EmployeeAddressDetails> employeeAddress;
	
	@OneToMany(fetch = FetchType.EAGER,cascade = CascadeType.ALL,mappedBy = "employee")
	private List<EmployeeEducationDetails> employeeEducationDetails;
	
	@ManyToMany(fetch = FetchType.LAZY,cascade = CascadeType.ALL,mappedBy = "employee")
	private List<EmployeeTechnicalSkill> employeeSkill;
	
	@OneToMany(fetch = FetchType.LAZY,cascade = CascadeType.ALL,mappedBy = "employee")
	private List<EmployeeContact> contactInfo;

}
