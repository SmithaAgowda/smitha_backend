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
@Table(name="Invoice")
public class Invoice {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer invoiceId;
	
	@Column(nullable = false)
	private LocalDate invoiceDate;
	

	
	@OneToOne(fetch = FetchType.LAZY,cascade = CascadeType.ALL)
	private ServiceDetails service;
	
	@OneToOne(fetch = FetchType.LAZY,cascade = CascadeType.ALL)
	private Packages packages;
	
	@OneToOne(fetch = FetchType.LAZY,cascade = CascadeType.ALL)
	private Vehicle vehicle;
}
