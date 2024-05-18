package com.excel.lms.enums;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Getter
public enum Contact {

HOME("HOME"),PHONE("PHONE");
	
	private final String contact;
}
