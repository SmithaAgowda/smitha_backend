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
@Table(name="task_table")
public class TaskTable {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	
	@Column(name = "task_id")

	private int task_id;
	
	@Column(name = "bookin_id")
	private int booking_id;
	
	@Column(name = "mechanic_id")
	private int mechanic_id;
	
	@Column(name = "task_description")
	private String task_description;
	
	@Column(name = "status")
	private String status;
	
	@Column(name = "start_date")
	private String start_date;
	
	@Column(name = "end_time")
	private String end_time;
	
	@OneToOne(cascade = CascadeType.ALL)
	private Mechanic mechanic;
	
	@OneToMany(cascade = CascadeType.ALL,mappedBy = "tasktable")
	private List<ServiceBooking> servicebooking;

}
