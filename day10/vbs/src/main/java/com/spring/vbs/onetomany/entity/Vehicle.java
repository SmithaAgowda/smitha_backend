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
@Table(name="vehicle")
public class Vehicle {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	
	@Column(name = "vehicle_id")
	private int vehicle_id;
	
	
	
	@Column(name = "vehicle_make")
	private String make;
	
	@Column(name = "vehicle_model")
	private String model;
	
	@Column(name = "vehicle_year")
	private Long year;
	
	@Column(name = "vin_number")
	private int vin_number;
	
	@Column(name = "license_number")
	private int license_number;
	
	@ManyToOne(cascade = CascadeType.ALL)
	private User user;
	
	@OneToMany(cascade = CascadeType.ALL,mappedBy = "vehicle")
	private List<ServiceBooking> serviceBooking;
	
	@OneToMany(cascade = CascadeType.ALL,mappedBy="vehicle")
	private List<ServiceHistory> servicehistory;
}
