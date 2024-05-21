package com.excel.vbs.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class CustomerRegDto {
	
	
	private String custName;
	private String custPass;
	private String email;
	private String address;
	private String city;
	private String is_active;
	private String vehNo;
}
