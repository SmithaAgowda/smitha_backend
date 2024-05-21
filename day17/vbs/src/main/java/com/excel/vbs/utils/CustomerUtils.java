package com.excel.vbs.utils;

import com.excel.vbs.dto.CustomerRegDto;
import com.excel.vbs.dto.PincodeDto;
import com.excel.vbs.entity.CustomerReg;
import com.excel.vbs.entity.Pincode;

public class CustomerUtils {
	
	public static CustomerReg dtoToEntity(CustomerRegDto dto) {
		return CustomerReg.builder()
				.custName(dto.getCustName())
				.custPass(dto.getCustPass())
				.email(dto.getEmail())
				.address(dto.getAddress())
				.city(dto.getCity())
				.is_active(dto.getIs_active())
				.vehNo(dto.getVehNo())
				.build();
		
	}
	public static Pincode dtoToEntity(PincodeDto dto) {
		return Pincode.builder()
				.pincode(dto.getPincode())
				.build();
		
	}

}
