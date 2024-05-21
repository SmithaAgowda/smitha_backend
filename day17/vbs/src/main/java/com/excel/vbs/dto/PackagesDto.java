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
public class PackagesDto {
	
	private String packName;
	private String packPrice;
	private String desc;
	private String isactive;
}
