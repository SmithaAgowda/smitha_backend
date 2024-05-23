package com.example.vehiclebooking.utils;

import com.example.vehiclebooking.dto.CustomerRegistrationDto;
import com.example.vehiclebooking.dto.EmployeeRegisterDto;
import com.example.vehiclebooking.dto.ServiceDetailsDto;
import com.example.vehiclebooking.dto.ServiceDetailsListDto;
import com.example.vehiclebooking.dto.VehicleRegistrationDto;
import com.example.vehiclebooking.entity.CustomerRegistration;
import com.example.vehiclebooking.entity.EmployeeRegister;
import com.example.vehiclebooking.entity.ServiceDetails;
import com.example.vehiclebooking.entity.VehicleRegistration;

public class VehicleUtil {
	public static EmployeeRegister dtoToEntity(EmployeeRegisterDto dto)
	{
		return EmployeeRegister.builder()
				.employeeId(dto.getEmployeeId())
				.employeeName(dto.getEmployeeName())
				.employeePassword(dto.getEmployeePassword())
				.employeeEmail(dto.getEmployeeEmail())
				.employeePhoneNumber(dto.getEmployeePhoneNumber())
				.employeeCity(dto.getEmployeeCity())
				.employeeAddress(dto.getEmployeeAddress())
				.build();
	}
	
	public static CustomerRegistration dtoToEntity(CustomerRegistrationDto dto)
	{
		return CustomerRegistration.builder()
				.customerRegId(dto.getCustomerRegId())
				.customerName(dto.getCustomerName())
				.customerPassword(dto.getCustomerPassword())
				.customerEmail(dto.getCustomerEmail())
				.customerPhoneNumber(dto.getCustomerPhoneNumber())
				.customerCity(dto.getCustomerCity())
				.customerAddress(dto.getCustomerAddress())
				.build();
	}
	
	public static ServiceDetails dtoToEntity(ServiceDetailsDto dto)
	{
		return ServiceDetails.builder()
				.serviceDescription(dto.getServiceDescription())
				
	 			.packageName(dto.getPackageName())
	 			.packageCost(dto.getPackageCost())
	 			.nextServiceKms(dto.getNextServiceKms())
	 			.serviceDate(dto.getServiceDate())
				.build();
	}

	public static CustomerRegistrationDto entityToDto(CustomerRegistration cust) {
		
		return CustomerRegistrationDto.builder()
				.customerRegId(cust.getCustomerRegId())
				.customerName(cust.getCustomerName())
				.customerPassword(cust.getCustomerPassword())
				.customerEmail(cust.getCustomerEmail())
				.customerPhoneNumber(cust.getCustomerPhoneNumber())
				.customerCity(cust.getCustomerCity())
				.customerAddress(cust.getCustomerAddress()).build();
	}
	
public static EmployeeRegisterDto entityToDto(EmployeeRegister cust) {
		
		return EmployeeRegisterDto.builder()
				.employeeId(cust.getEmployeeId())
				.employeeName(cust.getEmployeeName())
				.employeePassword(cust.getEmployeePassword())
				.employeeEmail(cust.getEmployeeEmail())
				.employeePhoneNumber(cust.getEmployeePhoneNumber())
				.employeeCity(cust.getEmployeeCity())
				.employeeAddress(cust.getEmployeeAddress()).build();
	}

public static VehicleRegistrationDto entityToDto(VehicleRegistration veh) {
	
	return VehicleRegistrationDto.builder()
			.vehicleRegId(veh.getVehicleRegId())
			.vehicleModel(veh.getVehicleModel())
			.vehicleNo(veh.getVehicleNo())
			.build();
}

	
}
