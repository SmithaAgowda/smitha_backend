package com.example.vehiclebooking.dto;

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

	
	private String serviceDescription;
	private String packageName;
	private String packageCost;
	private String nextServiceKms;
	private LocalDate serviceDate;
	private Integer vehicleRegId;
	private Integer employeeId;
}
