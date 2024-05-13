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
@Table (name="servicebooking")
public class ServiceBooking {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	
	@Column(name = "booking_id")
	private int booking_id;
	
	@Column(name = "booking_date")
	private String booking_date;
	
	@Column(name = "service_package")
	private String service_package;
	
	@Column(name = "status")
	private int status;
	
	@OneToOne(cascade = CascadeType.ALL)
	private Vehicle vehicle;
	
	@ManyToOne(cascade = CascadeType.ALL)
	private ServiceCenter servicecenter;
	
	@OneToMany(cascade = CascadeType.ALL)
	private List<TaskTable> tasktable;
	
	
}
