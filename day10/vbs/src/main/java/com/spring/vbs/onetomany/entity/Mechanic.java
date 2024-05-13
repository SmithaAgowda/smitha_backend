package com.spring.vbs.onetomany.entity;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
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
@Table (name="mechanic")
public class Mechanic {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "mechanic_id")
	private int mechanic_id;
	
	@Column(name = "name")
	private String name;
	
	@Column(name = "expertise")
	private String expertise;
	
	@Column(name = "contact_num")
	private int contact_num;
	
	@OneToOne(cascade = CascadeType.ALL,mappedBy = "mechanic")
	private TaskTable tasktable;
	
	@OneToOne(cascade = CascadeType.ALL)
	private ServiceCenter servicecenter;
	
	@OneToOne(cascade=CascadeType.ALL)
	private User user;
	
}
