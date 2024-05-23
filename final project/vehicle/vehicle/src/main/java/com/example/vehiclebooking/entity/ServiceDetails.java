package com.example.vehiclebooking.entity;

import java.time.LocalDate;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
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
@Table(name="service_Details")
public class ServiceDetails {
	

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer serviceId;
	
	@Column(nullable = false)
	private String serviceDescription;
	
	@Column(nullable = false)
	private String packageName;
	
	@Column(nullable = false)
	private String packageCost;
	
	@Column(nullable = false)
	private String nextServiceKms;
	
	@Column(nullable = false)
	private LocalDate serviceDate;
	
	@ManyToOne(fetch = FetchType.LAZY,cascade = CascadeType.ALL)
	private EmployeeRegister employeeRegister;
	
	@ManyToOne(fetch = FetchType.LAZY,cascade = CascadeType.ALL)
	private VehicleRegistration vehicleRegister;

}
