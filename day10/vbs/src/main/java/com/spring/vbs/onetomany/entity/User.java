package com.spring.vbs.onetomany.entity;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
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
@Table(name="user")
public class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	
	@Column(name = "user_id")
	private int user_id;
	
	@Column(name = "user_name")
	private String name;
	
	@Column(name = "user_email")
	private String email;
	
	@Column(name = "user_password_hash")
	private String password_hash;
	
	@Column(name = "user_is_admin")
	private Boolean is_admin;
	
	@Column(name = "user_create_at")
	private String create_at;

	@OneToMany(cascade = CascadeType.ALL,mappedBy = "user")
	private List<Vehicle> vehicle;
	
	@OneToMany(cascade = CascadeType.ALL,mappedBy = "user")
	private List<ServiceCenter> service;
	
	@ManyToMany(cascade = CascadeType.ALL)
	private List<Roles> roles;
	
	@OneToOne(cascade = CascadeType.ALL,mappedBy = "user")
	private Mechanic mechanic;
	
	@OneToMany(cascade = CascadeType.ALL,mappedBy = "user")
	private List<Notification> notification;

}
