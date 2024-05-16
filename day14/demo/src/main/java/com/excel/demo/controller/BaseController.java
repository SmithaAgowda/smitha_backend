package com.excel.demo.controller;

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

import com.excel.demo.commonresponse.CommonResponse;
import com.excel.demo.constant.EmployeeConstant;
import com.excel.demo.dto.EmployeeDto;
import com.excel.demo.entity.Employee;
import com.excel.demo.service.EmployeeService;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
@RequestMapping("/employee")
@RequiredArgsConstructor
public class BaseController {
	
	@Autowired
	private EmployeeService employeeService;

	@GetMapping("/home")
	public ResponseEntity<String> homeGetReq(){
		return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Hello");
		
	}
	
	@PostMapping("/add")
	public ResponseEntity<CommonResponse<EmployeeDto>> addEmployee(@RequestBody EmployeeDto employee){
	
		EmployeeDto dto = employeeService.addEmployee(employee);
		return ResponseEntity.status(HttpStatus.OK).body(CommonResponse.<EmployeeDto>builder().data(dto)
				.isError(false).message(EmployeeConstant.EMPLOYEE_ADDED_MESSAGE).build());
	}
	
	@DeleteMapping("/delete")
	
	public void deleteEmployee(@RequestBody EmployeeDto dto){
		
		employeeService.deleteEmployee(dto);
		
		 ResponseEntity.ok(EmployeeConstant.EMPLOYEE_DELETE_SUCCESS);
		
	}
	
	@GetMapping("/getAll")
	public ResponseEntity<List<EmployeeDto>> fetchAllEmployees(){
		return ResponseEntity.ok(employeeService.getAllEmployee());
	}
	
	
		@GetMapping("/get/{id}")
		public ResponseEntity<EmployeeDto> getEmployee(@PathVariable Integer id){
		EmployeeDto employee = employeeService.getEmployee(id);
		return ResponseEntity.status(HttpStatus.OK).body(employee);
	}
	
	@PutMapping("/update")
		public ResponseEntity<EmployeeDto> updateEmployee(@RequestBody EmployeeDto employee){
		EmployeeDto updateEmployee  = employeeService.updateEmployee(employee);
		return ResponseEntity.status(HttpStatus.OK).body(updateEmployee);
	}
}
	
//	@PostMapping("/home/{str}")
//	public ResponseEntity<String> homePostReq(@PathVariable String str){
//		return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(str);
//	}
//	
//	@DeleteMapping("/home{str}")
//	public ResponseEntity<String> homeDeleteReq(@PathVariable String str){
//		return ResponseEntity.ok(null);
//	}
//	
//
//	
//	@PutMapping("/home/{str}")
//	public ResponseEntity<String> homePutReq(){
//		return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Hello");
//	}
	

	

