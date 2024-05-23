package com.example.vehiclebooking.services;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.vehiclebooking.dto.ServiceDetailsDto;
import com.example.vehiclebooking.dto.ServiceDetailsListDto;
import com.example.vehiclebooking.entity.EmployeeRegister;
import com.example.vehiclebooking.entity.ServiceDetails;
import com.example.vehiclebooking.entity.VehicleRegistration;
import com.example.vehiclebooking.exception.EmployeeExistance;
import com.example.vehiclebooking.repository.EmployeeRepository;
import com.example.vehiclebooking.repository.VehicleRepository;
import com.example.vehiclebooking.utils.VehicleUtil;



@Service
public class ServiceDetailServiceImpl implements ServiceDetailsService{
	@Autowired
	private VehicleRepository vehicleRepository;
	@Autowired
	private EmployeeRepository employeeRepository;
	@Override
	public Integer saveServiceInfo(ServiceDetailsDto dto) {
		Optional<EmployeeRegister> custOptional =employeeRepository.findByEmployeeId(dto.getEmployeeId());
			Optional<VehicleRegistration> propOptional =vehicleRepository.findByVehicleRegId(dto.getVehicleRegId());
			if(propOptional.isPresent() && custOptional.isPresent()) {
				EmployeeRegister info = custOptional.get();
				VehicleRegistration prop = propOptional.get();
				ServiceDetails serviceDetails = VehicleUtil.dtoToEntity(dto);
				prop.getServiceDetails().add(serviceDetails);
				info.getServiceDetails().add(serviceDetails);
				serviceDetails.setVehicleRegister(prop);
				serviceDetails.setEmployeeRegister(info);
				return employeeRepository.save(info).getEmployeeId();
			}
			
			return null;
		}
	}
//		Optional<EmployeeRegister> empId = employeeRepository.findByEmployeeId(dto.getEmployeeId());
//		Optional<VehicleRegistration> vehId = vehicleRepository.findByVehicleRegId(dto.getVehicleRegId());
//		
//		if(empId.isPresent() && vehId.isPresent()) {
//			  EmployeeRegister employeeRegister = empId.get();
//			  VehicleRegistration vehicleRegistration = vehId.get();
//			 
//			 List<ServiceDetails> serviceDetails = dto.getServiceDetails().stream()
//					 	.map(e -> ServiceDetails.builder()
//					 			.serviceDescription(e.getServiceDescription())
//					 			.packageName(e.getPackageName())
//					 			.packageCost(e.getPackageCost())
//					 			.nextServiceKms(e.getNextServiceKms())
//					 			.serviceDate(e.getServiceDate())
//					 			.build()).collect(Collectors.toList());
//			 
//			 if(employeeRegister.getServiceDetails()!=null) {
//				 
//				 if(!employeeRegister.getServiceDetails().contains(serviceDetails))
//					 employeeRegister.getServiceDetails().addAll(serviceDetails);
//			 }else { 
//				 
//				 employeeRegister.setServiceDetails(serviceDetails);
//				 
//			 		}if(vehicleRegistration.getServiceDetails()!=null) {
//					 
//					 if(!vehicleRegistration.getServiceDetails().contains(serviceDetails))
//						 vehicleRegistration.getServiceDetails().addAll(serviceDetails);
//
//				 }else {
//					 
//					 vehicleRegistration.setServiceDetails(serviceDetails);
//				 }
//				 
//				 serviceDetails.stream().forEach(e -> e.setEmployeeRegister(employeeRegister));
//				 serviceDetails.stream().forEach(e -> e.setVehicleRegister(vehicleRegistration));
//				 
//				 return employeeRepository.save(employeeRegister).getEmployeeId();
//			 }
//			 
//		throw new EmployeeExistance("Check");
//			 
//			
//		
//		
//	}
//
//}
