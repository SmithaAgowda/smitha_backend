package com.example.vehiclebooking.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.vehiclebooking.commonresponse.CommonResponse;
import com.example.vehiclebooking.dto.EmployeeRegisterDto;
import com.example.vehiclebooking.dto.ServiceDetailsDto;
import com.example.vehiclebooking.dto.ServiceDetailsListDto;
import com.example.vehiclebooking.services.ServiceDetailsService;
import com.example.vehiclebooking.services.VehicleService;

@RestController
@RequestMapping
public class ServiceDetailsController {
	
	@Autowired
	private ServiceDetailsService serviceDetailsService;
	
	@PostMapping(path="/service")
	public ResponseEntity<CommonResponse<Integer>> postPinInfo(@RequestBody ServiceDetailsDto dto){
		Integer serviceId = serviceDetailsService.saveServiceInfo(dto);
		return ResponseEntity.status(HttpStatus.CREATED)
				.body(CommonResponse.<Integer>builder().data(serviceId).message("Employee info Saved")
						.build());
	}
	
}
