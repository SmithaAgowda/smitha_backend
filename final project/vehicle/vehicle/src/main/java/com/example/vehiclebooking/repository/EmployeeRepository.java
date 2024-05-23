package com.example.vehiclebooking.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.vehiclebooking.entity.EmployeeRegister;

public interface EmployeeRepository extends JpaRepository<EmployeeRegister, Integer> {
	public Optional<EmployeeRegister> findByEmployeeId(Integer employeeId);
}
