package com.example.vehiclebooking.services;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.vehiclebooking.constants.Vehicleconstants;
import com.example.vehiclebooking.dto.CustomerRegistrationDto;
import com.example.vehiclebooking.dto.VehicleListDto;
import com.example.vehiclebooking.dto.VehicleRegistrationDto;
import com.example.vehiclebooking.entity.CustomerRegistration;
import com.example.vehiclebooking.entity.VehicleRegistration;
import com.example.vehiclebooking.exception.EmployeeExistance;
import com.example.vehiclebooking.repository.CustomerRepository;
import com.example.vehiclebooking.repository.VehicleRepository;
import com.example.vehiclebooking.utils.VehicleUtil;



@Service
public class VehicleServiceImpl implements VehicleService {
	@Autowired
	private CustomerRepository customerRepository;
	
	@Autowired
	private VehicleRepository vehicleRepository;

	@Override
	public String saveVehicleInfo(VehicleListDto dto) {
		 Optional<CustomerRegistration> optional = customerRepository.findByCustomerRegId(dto.getCustomerRegId());
			

			if(optional.isPresent()) {
				CustomerRegistration customer = optional.get();
				List<VehicleRegistration> vehicles = dto.getVehicleRegister().stream()
						.map(e->VehicleRegistration.builder().vehicleModel(e.getVehicleModel())
								.vehicleNo(e.getVehicleNo()).build()).collect(Collectors.toList());
				
				customer.setVehicleRegister(vehicles);
				vehicles.stream().forEach(e->e.setCustomerRegister(customer));
				
				
				customerRepository.save(customer);
				return dto.getCustomerRegId().toString();
				
				
			}
			throw new EmployeeExistance("Check");


		}

	@Override
	public List<VehicleRegistrationDto> getAllVehicles() {
		return vehicleRepository.findAll().stream()
				.map(e->VehicleRegistrationDto.builder().vehicleRegId(e.getVehicleRegId()).vehicleModel(e.getVehicleModel())
						.vehicleNo(e.getVehicleNo())
						.build()).toList();
	}

	@Override
	public VehicleRegistrationDto getVehicles(Integer id) {
		try {
			Optional<VehicleRegistration> optional = vehicleRepository.findById(id);
			if (optional.isPresent()) {
				VehicleRegistration veh = optional.get();
				return VehicleUtil.entityToDto(veh);
			}
			throw new EmployeeExistance("Employee Not Found with ID:" + id);
		} catch (EmployeeExistance e) {
			throw e;
		} catch (Exception e) {
			throw new EmployeeExistance("invali id");
		}
	}

	@Override
	public void deleteVehicle(VehicleListDto dto) {
		Optional<VehicleRegistration> optional = vehicleRepository.findById(dto.getCustomerRegId());

		if (optional.isPresent()) {
			vehicleRepository.delete(optional.get());
		} else {
			throw new EmployeeExistance(Vehicleconstants.PinNOT_FOUND);
		}
	}

	@Override
	public VehicleListDto updateVehicle(VehicleListDto employee) {
		// TODO Auto-generated method stub
		return null;
	}
		
	

//	@Override
//	public VehicleListDto updateVehicle(VehicleListDto employee) {
//		Optional<VehicleRegistration> optional = vehicleRepository.findByVehicleRegId(vehicleDetails.getCustomerRegId());
//		if (optional.isPresent()) {
//			VehicleRegistration customerOptional = optional.get();
//		
//			customerOptional.setCustomerRegId(vehicleDetails.getCustomerRegId());  
//	        
//			CustomerRegistration save = customerRepository.save(customerOptional);
//			
//			return CustomerRegistrationDto.builder()
//					.customerName(save.getCustomerName())
//					.customerPassword(save.getCustomerPassword())
//					.customerEmail(save.getCustomerEmail())
//					.customerCity(save.getCustomerCity())
//					.customerPhoneNumber(save.getCustomerPhoneNumber())
//					.customerAddress(save.getCustomerAddress())
//					.build();
//		}
//		throw new EmployeeExistance(Vehicleconstants.PinNOT_FOUND);
//	}
	}

	

	

	
	


