package com.excel.vbs.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.excel.vbs.commonresponse.CommonResponse;
import com.excel.vbs.dto.CustomerRegDto;
import com.excel.vbs.dto.PincodeDto;
import com.excel.vbs.service.PincodeService;

public class PincodeController {

	@Autowired
	private PincodeService pincodeService;
	
	@PostMapping(path="/pinfo")
	public ResponseEntity<CommonResponse<String>> postPinInfo(@RequestBody PincodeDto dto){
		String pinId = pincodeService.savePinInfo(dto);
		return ResponseEntity.status(HttpStatus.CREATED)
				.body(CommonResponse.<String>builder().data(pinId).message("Pincode info Saved")
						.build());
	}
}
