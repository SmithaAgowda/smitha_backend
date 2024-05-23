package com.example.vehiclebooking.exception;

public class EmployeeExistance extends RuntimeException {

	private static final long serialVersionUID = 1L;
	public EmployeeExistance(String message) {
		super(message);
	}
}
