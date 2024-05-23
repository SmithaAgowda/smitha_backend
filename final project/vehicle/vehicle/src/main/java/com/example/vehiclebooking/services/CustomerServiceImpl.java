package com.example.vehiclebooking.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.vehiclebooking.constants.Vehicleconstants;
import com.example.vehiclebooking.dto.CustomerRegistrationDto;
import com.example.vehiclebooking.dto.EmployeeRegisterDto;
import com.example.vehiclebooking.entity.CustomerRegistration;
import com.example.vehiclebooking.entity.EmployeeRegister;
import com.example.vehiclebooking.exception.EmployeeExistance;
import com.example.vehiclebooking.repository.CustomerRepository;
import com.example.vehiclebooking.repository.EmployeeRepository;
import com.example.vehiclebooking.utils.VehicleUtil;

@Service
public class CustomerServiceImpl implements CustomerService{
	@Autowired
	private CustomerRepository customerRepository;

	@Override
	public Integer saveCustInfo(CustomerRegistrationDto dto) {
		if (!customerRepository.findByCustomerRegId(dto.getCustomerRegId()).isPresent()) {
			CustomerRegistration cust = VehicleUtil.dtoToEntity(dto);
			CustomerRegistration cust1 = customerRepository.save(cust);
			return cust1.getCustomerRegId();
		}
		throw new EmployeeExistance("Check");
	}

	@Override
	public List<CustomerRegistrationDto> geAllCustomer() {
		return customerRepository.findAll().stream()
				.map(e->CustomerRegistrationDto.builder().customerRegId(e.getCustomerRegId()).customerName(e.getCustomerName())
						.customerPassword(e.getCustomerPassword()).customerEmail(e.getCustomerEmail())
						.customerPhoneNumber(e.getCustomerPhoneNumber()).customerAddress(e.getCustomerAddress())
						.customerCity(e.getCustomerCity())
						.build()).toList();
			
	}

	@Override
	public CustomerRegistrationDto getCustomer(Integer id) {
		try {
			Optional<CustomerRegistration> optional = customerRepository.findById(id);
			if (optional.isPresent()) {
				CustomerRegistration cust = optional.get();
				return VehicleUtil.entityToDto(cust);
			}
			throw new EmployeeExistance("Employee Not Found with ID:" + id);
		} catch (EmployeeExistance e) {
			throw e;
		} catch (Exception e) {
			throw new EmployeeExistance("invali id");
		}
	}

	@Override
	public void deleteCustomer(Integer id) {
		Optional<CustomerRegistration> optional = customerRepository.findById(id);

		if (optional.isPresent()) {
			customerRepository.delete(optional.get());
			
		} else {
			throw new EmployeeExistance(Vehicleconstants.PinNOT_FOUND);
		}
	}
		
	

	@Override
	public CustomerRegistrationDto updateCustomer(CustomerRegistrationDto customerDetails) {
		Optional<CustomerRegistration> optional = customerRepository.findByCustomerRegId(customerDetails.getCustomerRegId());
		if (optional.isPresent()) {
			CustomerRegistration customerOptional = optional.get();
		
			customerOptional.setCustomerRegId(customerDetails.getCustomerRegId());  
	        
			CustomerRegistration save = customerRepository.save(customerOptional);
			
			return CustomerRegistrationDto.builder()
					.customerName(save.getCustomerName())
					.customerPassword(save.getCustomerPassword())
					.customerEmail(save.getCustomerEmail())
					.customerCity(save.getCustomerCity())
					.customerPhoneNumber(save.getCustomerPhoneNumber())
					.customerAddress(save.getCustomerAddress())
					.build();
		}
		throw new EmployeeExistance(Vehicleconstants.PinNOT_FOUND);
	}

	@Override
	public void loginCustomer(String emailid, String password) {
		// TODO Auto-generated method stub
		
	}

}
