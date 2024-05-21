package com.excel.vbs.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.excel.vbs.entity.Pincode;

public interface PincodeRepository extends JpaRepository<Pincode, Integer>{

	Optional<Pincode> findByPincode(String pincode);
}
