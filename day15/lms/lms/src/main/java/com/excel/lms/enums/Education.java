package com.excel.lms.enums;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Getter
public enum Education {
	
	POSTGRADUATION("POSTGRADUATION"),GRADUATION("GRADUATION"),DEGREE("DEGREE");
	
	private final String education;
}
