package com.excel.lms.dto;


import com.excel.lms.enums.Contact;

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
public class EmployeeContactDto {

    private Integer empContactId;
	private Contact contactType;
	private Long contactNumber;
}
