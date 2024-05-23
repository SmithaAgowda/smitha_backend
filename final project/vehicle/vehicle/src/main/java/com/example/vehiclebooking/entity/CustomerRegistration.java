package com.example.vehiclebooking.entity;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
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
@Table(name="customer_registration")
public class CustomerRegistration {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer customerRegId;
	
	@Column(nullable = false)
	private String customerName;
	
	@Column(nullable = false)
	private String customerPassword;
	
	
	@Column(nullable = false)
	private String customerEmail;
	
	@Column(nullable = false)
	private String customerPhoneNumber;
	
	@Column(nullable = false)
	private String customerAddress;
	
	@Column(nullable = false)
	private String customerCity;
	
	@OneToMany(fetch = FetchType.LAZY,cascade = CascadeType.ALL,mappedBy = "customerRegister")
	private List<VehicleRegistration> vehicleRegister;

}
