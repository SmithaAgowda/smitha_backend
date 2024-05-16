package com.excel.demo.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.excel.demo.commonresponse.CommonResponse;

@RestControllerAdvice
public class EmployeeControllerAdvice {

	@ExceptionHandler(EmployeeNotFound.class)
	public ResponseEntity<CommonResponse<String>> employeeExceptionHandler(RuntimeException exe)
	{
		return ResponseEntity.status(HttpStatus.OK)
				.body(CommonResponse.<String>builder().data(null)
						.isError(true).message(exe.getMessage()).build());
	}
}
