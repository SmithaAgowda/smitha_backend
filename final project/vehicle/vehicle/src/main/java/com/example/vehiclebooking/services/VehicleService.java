package com.example.vehiclebooking.services;

import java.util.List;

import com.example.vehiclebooking.dto.EmployeeRegisterDto;
import com.example.vehiclebooking.dto.VehicleListDto;
import com.example.vehiclebooking.dto.VehicleRegistrationDto;

public interface VehicleService {

	public String saveVehicleInfo(VehicleListDto dto);
	
	public List<VehicleRegistrationDto> getAllVehicles();

	public VehicleRegistrationDto getVehicles(Integer id);

	public void deleteVehicle(VehicleListDto dto);

	

	public VehicleListDto updateVehicle(VehicleListDto employee);
	





}
