package com.excel.vbs.entity;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
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
@Table(name="customer_reg")
public class CustomerReg {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer customerId;

	
	@Column(nullable = false)
	private String custName;
	
	@Column(nullable = false)
	private String custPass;
	
	@Column(nullable = false)
	private String email;
	
	@Column(nullable = false)
	private String address;
	
	@Column(nullable = false)
	private String city;
	
	@Column(nullable = false)
	private String is_active;
	
	@Column(nullable = false)
	private String vehNo;
	
	@OneToMany(fetch = FetchType.LAZY,cascade = CascadeType.ALL,mappedBy = "customer")
	private List<Vehicle> vehicle;

	@OneToOne(fetch = FetchType.LAZY,cascade = CascadeType.ALL)
	private Pincode pincode;
	
	@OneToMany(fetch = FetchType.LAZY,cascade = CascadeType.ALL,mappedBy = "customer")
	private List<BookAppointment> bookapp;
	
	@OneToOne(fetch = FetchType.LAZY,cascade = CascadeType.ALL , mappedBy = "customer")
	private UpdateStatus updatestatus;
}
