package com.spring.vbs.onetomany.entity;


import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
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
@Table (name ="servicecenter")
public class ServiceCenter {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	
	@Column(name = "center_id")
	private int center_id;
	
	@Column(name = "user_id")
	private int user_id;
	
	@Column(name = "center_name")
	private String center_name;
	
	@Column(name = "loaction")
	private String location;
	
	@Column(name = "contact_phone")
	private int contact_phone;
	
	@Column(name = "contact_email")
	private String contact_email;
	
	@ManyToOne(cascade = CascadeType.ALL)
	private User user;
	
	@OneToMany(cascade = CascadeType.ALL,mappedBy = "servicecenter")
	private List<ServiceBooking> servicebooking;
	
	@OneToOne(cascade = CascadeType.ALL,mappedBy = "servicecenter")
	private Mechanic mechanic;
	
	@OneToMany(cascade = CascadeType.ALL,mappedBy="servicecenter")
	private List<ServiceHistory> servicehistory;
}
