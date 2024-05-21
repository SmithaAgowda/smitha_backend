//package com.excel.vbs.controller;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//
//import com.excel.vbs.commonresponse.CommonResponse;
//import com.excel.vbs.dto.CustomerRegDto;
//import com.excel.vbs.service.CustomerService;
//
//public class CustomerRegController {
//	@Autowired
//	private  CustomerService customerService;
//	
//	@PostMapping(path="/pinfo")
//	public ResponseEntity<CommonResponse<String>> postPrimaryInfo(@RequestBody CustomerRegDto dto){
//		String custId = customerService.saveCustInfo(dto);
//		return ResponseEntity.status(HttpStatus.CREATED)
//				.body(CommonResponse.<String>builder().data(custId).message("Customer info Saved")
//						.build());
//	}
//}
