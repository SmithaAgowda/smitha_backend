package com.example.vehiclebooking.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.vehiclebooking.entity.VehicleRegistration;

public interface VehicleRepository  extends JpaRepository<VehicleRegistration, Integer> {
	public Optional<VehicleRegistration> findByVehicleRegId(Integer vehicleRegId);

}
