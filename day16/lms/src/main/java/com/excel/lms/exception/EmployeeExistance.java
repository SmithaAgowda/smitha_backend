package com.excel.lms.exception;

public class EmployeeExistance extends RuntimeException{


	private static final long serialVersionUID = 1L;
	
	public EmployeeExistance(String message)
	{
		super(message);
	}

}
