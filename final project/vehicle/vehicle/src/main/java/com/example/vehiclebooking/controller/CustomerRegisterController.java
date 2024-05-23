package com.example.vehiclebooking.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
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
import com.example.vehiclebooking.dto.CustomerRegistrationDto;
import com.example.vehiclebooking.dto.EmployeeRegisterDto;
import com.example.vehiclebooking.services.CustomerService;


@CrossOrigin
@RestController
@RequestMapping(path="/addcust/api")
public class CustomerRegisterController {
	@Autowired
	private CustomerService customerService;
	
	@PostMapping(path="/cust")
	public ResponseEntity<CommonResponse<Integer>> postPinInfo(@RequestBody CustomerRegistrationDto dto){
		Integer custId = customerService.saveCustInfo(dto);
		return ResponseEntity.status(HttpStatus.CREATED)
				.body(CommonResponse.<Integer>builder().data(custId).message("customer info Saved")
						.build());
	}
	
	@GetMapping("/getcustomer")
	public ResponseEntity<List<CustomerRegistrationDto>> fetchAllCustomer(){
		return ResponseEntity.ok(customerService.geAllCustomer());
	}
	
	
	@GetMapping("/get/{id}")
	public ResponseEntity<CustomerRegistrationDto> getPins(@PathVariable Integer id){
		CustomerRegistrationDto pins = customerService.getCustomer(id);
	return ResponseEntity.status(HttpStatus.OK).body(pins);
}
	
	
	@DeleteMapping("/delete/{id}")
	
	public ResponseEntity<CommonResponse<Integer>> deleteEmployee(@PathVariable Integer id){
		
		customerService.deleteCustomer(id);
		
		 ResponseEntity.ok(Vehicleconstants.DELETE_SUCCESS);
		 return ResponseEntity.status(HttpStatus.ACCEPTED)
					.body(CommonResponse.<Integer>builder().data(id).message("deleted info Saved")
							.build());
		
	}
	@PutMapping("/customer")
    public ResponseEntity<CustomerRegistrationDto> updatePincode(@RequestBody CustomerRegistrationDto customerDetails) {
		CustomerRegistrationDto updatedCustomer = customerService.updateCustomer(customerDetails);
        return ResponseEntity.ok(updatedCustomer);
    }
	
}
