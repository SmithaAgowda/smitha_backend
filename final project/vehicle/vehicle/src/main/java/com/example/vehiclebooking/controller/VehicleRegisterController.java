package com.example.vehiclebooking.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.vehiclebooking.commonresponse.CommonResponse;
import com.example.vehiclebooking.constants.Vehicleconstants;
import com.example.vehiclebooking.dto.EmployeeRegisterDto;
import com.example.vehiclebooking.dto.VehicleListDto;
import com.example.vehiclebooking.dto.VehicleRegistrationDto;
import com.example.vehiclebooking.services.VehicleService;

@RestController
@RequestMapping(path="/addveh/api")
public class VehicleRegisterController {
	@Autowired
	private VehicleService vehicleService;
	
	@PostMapping(path="/vehicle")
	public ResponseEntity<CommonResponse<String>> postVehInfo(@RequestBody VehicleListDto dto){
		String vehId = vehicleService.saveVehicleInfo(dto);
		return ResponseEntity.status(HttpStatus.CREATED)
				.body(CommonResponse.<String>builder().data(vehId).message("vehicle info Saved")
						.build());
	}
	
	
	@GetMapping("/getvehicle")
	public ResponseEntity<List<VehicleRegistrationDto>> fetchAllVehicle(){
		return ResponseEntity.ok(vehicleService.getAllVehicles());
	}
	

	@GetMapping("/get/{id}")
	public ResponseEntity<VehicleRegistrationDto> getVehicle(@PathVariable Integer id){
		VehicleRegistrationDto emp = vehicleService.getVehicles(id);
	return ResponseEntity.status(HttpStatus.OK).body(emp);
}
	
@DeleteMapping("/delete")
	
	public void deleteEmployee(@RequestBody VehicleListDto dto){
		
	     vehicleService.deleteVehicle(dto);
		
		 ResponseEntity.ok(Vehicleconstants.DELETE_SUCCESS);
		
	}

@PutMapping("/employee")
public ResponseEntity<VehicleListDto> updateCustomer(@RequestBody VehicleListDto vehicle) {
	VehicleListDto updateVehicle = vehicleService.updateVehicle(vehicle);
    return ResponseEntity.ok(updateVehicle);
}
}
