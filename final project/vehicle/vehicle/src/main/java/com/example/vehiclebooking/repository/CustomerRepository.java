package com.example.vehiclebooking.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.vehiclebooking.entity.CustomerRegistration;


public interface CustomerRepository extends JpaRepository<CustomerRegistration, Integer>{
	public Optional<CustomerRegistration> findByCustomerRegId(Integer customerRegId);
}
