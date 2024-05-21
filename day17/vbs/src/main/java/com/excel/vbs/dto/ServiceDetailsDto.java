package com.excel.vbs.dto;

import java.time.LocalDate;

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
public class ServiceDetailsDto {


	private String serviceDetails;
	private LocalDate serviceDate;
	private String partDesc;
	private String totalPartCost;
}
