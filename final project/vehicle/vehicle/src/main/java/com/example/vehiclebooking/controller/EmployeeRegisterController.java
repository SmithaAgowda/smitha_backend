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
import com.example.vehiclebooking.dto.CustomerRegistrationDto;
import com.example.vehiclebooking.dto.EmployeeRegisterDto;
import com.example.vehiclebooking.services.EmployeeService;

@RestController
@RequestMapping(path="/addemp/api")
public class EmployeeRegisterController {
	@Autowired
	private EmployeeService employeeService;
	private Object updatedEmployee;
	
	@PostMapping(path="/emp")
	public ResponseEntity<CommonResponse<Integer>> postPinInfo(@RequestBody EmployeeRegisterDto dto){
		Integer packId = employeeService.saveEmpInfo(dto);
		return ResponseEntity.status(HttpStatus.CREATED)
				.body(CommonResponse.<Integer>builder().data(packId).message("Employee info Saved")
						.build());
	}

	@GetMapping("/getemployee")
	public ResponseEntity<List<EmployeeRegisterDto>> fetchAllEmployee(){
		return ResponseEntity.ok(employeeService.getAllEmployees());
	}
	
	
	@GetMapping("/get/{id}")
	public ResponseEntity<EmployeeRegisterDto> getEmp(@PathVariable Integer id){
		EmployeeRegisterDto emp = employeeService.getEmployee(id);
	return ResponseEntity.status(HttpStatus.OK).body(emp);
}
	
	
	@DeleteMapping("/delete")
	
	public void deleteEmployee(@RequestBody EmployeeRegisterDto dto){
		
		employeeService.deleteEmployee(dto);
		
		 ResponseEntity.ok(Vehicleconstants.DELETE_SUCCESS);
		
	}
	@PutMapping("/employee")
    public ResponseEntity<EmployeeRegisterDto> updateCustomer(@RequestBody EmployeeRegisterDto employee) {
		EmployeeRegisterDto updateEmployee = employeeService.updateEmployee(employee);
        return ResponseEntity.ok(updateEmployee);
    }
	

}
