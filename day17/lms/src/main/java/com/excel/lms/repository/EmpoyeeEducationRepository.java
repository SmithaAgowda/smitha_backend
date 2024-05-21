package com.excel.lms.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.excel.lms.entity.EmployeeEducationDetails;

public interface EmpoyeeEducationRepository extends JpaRepository<EmployeeEducationDetails, Integer> {

}
