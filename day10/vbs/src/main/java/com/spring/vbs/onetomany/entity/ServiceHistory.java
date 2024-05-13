package com.spring.vbs.onetomany.entity;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table (name="servicehistory")
public class ServiceHistory {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	
	@Column(name = "service_id")
	private int service_id;
	
	@Column(name = "service_date")
	private String service_date;
	
	@Column(name = "service_details")
	private String service_details;
	
	@Column(name = "invoice_number")
	private int invoice_number;
	
	@Column(name = "total_cost")
	private int total_cost;
	
	@ManyToOne(cascade = CascadeType.ALL)
	private Vehicle vehicle;
	
	@ManyToOne(cascade = CascadeType.ALL)
	private ServiceCenter servicecenter;
}
