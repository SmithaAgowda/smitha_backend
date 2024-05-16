package com.excel.lms.enums;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Getter
public enum Marital {
	
	MARRIED("MARRIED"),UNMARRIED("UNMARRIED"),DIVORCED("DIVORCED");
	private final String education;

}
