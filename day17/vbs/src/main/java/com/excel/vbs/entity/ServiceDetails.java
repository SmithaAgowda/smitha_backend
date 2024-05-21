package com.excel.vbs.entity;

import java.time.LocalDate;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
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
@Table(name="service_details")
public class ServiceDetails {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer serviceId;
	
	@Column(nullable = false)
	private String serviceDetails;
	
	@Column(nullable = false)
	private LocalDate serviceDate;
	
	@Column(nullable = false)
	private String partDesc;
	
	@Column(nullable = false)
	private String totalPartCost;
	

	@OneToOne(fetch = FetchType.LAZY,cascade = CascadeType.ALL , mappedBy = "service")
	private Invoice invoice;
	
	@OneToOne(fetch = FetchType.LAZY,cascade = CascadeType.ALL , mappedBy = "service")
	private AssignMech assignmech;
	
	@OneToOne(fetch = FetchType.LAZY,cascade = CascadeType.ALL , mappedBy = "service")
	private BookAppointment bookappointment;
	
//	@OneToOne(fetch = FetchType.LAZY,cascade = CascadeType.ALL , mappedBy = "service")
//	private Packages packages;
}
