package com.excel.lms.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.excel.lms.commonresponse.CommonResponse;
import com.excel.lms.dto.AddressListDto;
import com.excel.lms.dto.ContactInfoListDto;
import com.excel.lms.dto.EducationListDto;
import com.excel.lms.dto.EmployeeAddressDetailsDto;
import com.excel.lms.dto.EmployeeBankDetailsDto;
import com.excel.lms.dto.EmployeePrimaryInfoDto;
import com.excel.lms.dto.EmployeeSecondaryInfoDto;
import com.excel.lms.dto.ExperienceListDto;
import com.excel.lms.dto.SkillListDto;
import com.excel.lms.service.EmployeeService;

import lombok.Builder;
import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping(path="/api/v1/employee")

 public class EmployeeRegisterController {
	
	@Autowired
	private  EmployeeService employeeService;
	
	@PostMapping(path="/pinfo")
	public ResponseEntity<CommonResponse<String>> postPrimaryInfo(@RequestBody EmployeePrimaryInfoDto dto){
		String employeeId = employeeService.savePrimaryInfo(dto);
		return ResponseEntity.status(HttpStatus.CREATED)
				.body(CommonResponse.<String>builder().data(employeeId).message("employee info Saved")
						.build());
	}
	
	@PostMapping(path="/sinfo")
	public ResponseEntity<CommonResponse<String>> postSecondaryInfo(@RequestBody EmployeeSecondaryInfoDto dto){
		
		String employeeId = employeeService.saveSecondaryInfo(dto);
		
		return ResponseEntity.status(HttpStatus.ACCEPTED).body(CommonResponse.<String>builder().data(employeeId).message("employee info Saved").build());
		
	}
	@PostMapping(path="/binfo")
	public ResponseEntity<CommonResponse<String>> postBankInfo(@RequestBody EmployeeBankDetailsDto dto){
		String employeeId = employeeService.saveBankInfo(dto);
		return ResponseEntity.status(HttpStatus.ACCEPTED).body(CommonResponse.<String>builder().data(employeeId).message("employee bank info saved").build());	
	}
	
	@PostMapping(path="/einfo")
	public ResponseEntity<CommonResponse<String>> addEducationDetails(@RequestBody EducationListDto dto){
		String employeeId = employeeService.addEducations(dto);
		return ResponseEntity.ok(CommonResponse.<String>builder().data(employeeId).isError(false).message("education details add successfully").build());
	}
	
	@PostMapping(path="/ainfo")
	public ResponseEntity<CommonResponse<String>> addAddressDeatails(@RequestBody AddressListDto dto){
		String employeeId=employeeService.addAddress(dto);
		
		return ResponseEntity.ok(CommonResponse.<String>builder().data(employeeId).isError(false).message("address added successfully").build());
		
	}
	@PostMapping(path="/exinfo")
	public ResponseEntity<CommonResponse<String>> addExperienceDetails(@RequestBody ExperienceListDto dto){
		String employeeId=employeeService.addExperience(dto);
		
		return ResponseEntity.ok(CommonResponse.<String>builder().data(employeeId).isError(false).message("add experience successfully").build());
		
	}
	
	@PostMapping(path="/cinfo")
	public ResponseEntity<CommonResponse<String>> addContactInfo(@RequestBody ContactInfoListDto dto){
		String employeeId=employeeService.addContactInfo(dto);
		
		return ResponseEntity.ok(CommonResponse.<String>builder().data(employeeId).isError(false).message("add contact successfully").build());
		
	}
	
	@PostMapping(path="/skillinfo")
	public ResponseEntity<CommonResponse<String>> addSkills(@RequestBody SkillListDto dto){
		String employeeId = employeeService.addSkills(dto);
		return ResponseEntity.ok(CommonResponse.<String>builder().data(employeeId).isError(false).message("skills added successfully").build());
		
	}

}
