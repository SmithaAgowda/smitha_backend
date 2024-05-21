package com.excel.vbs.exception;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ExceptionHandler {
	
	public ResponseEntity<String> CustomernotFound(RuntimeException exp){
		return ResponseEntity.ok(exp.getMessage());
	}

}
