package com.example.vehiclebooking.services;

import java.util.List;

import com.example.vehiclebooking.dto.CustomerRegistrationDto;



public interface CustomerService {

	public Integer saveCustInfo(CustomerRegistrationDto dto);
	public List<CustomerRegistrationDto> geAllCustomer();
	public CustomerRegistrationDto getCustomer(Integer id);
	public void deleteCustomer(Integer id);
	public void loginCustomer(String emailid, String password);
	public CustomerRegistrationDto updateCustomer(CustomerRegistrationDto customerDetails);

	
}
