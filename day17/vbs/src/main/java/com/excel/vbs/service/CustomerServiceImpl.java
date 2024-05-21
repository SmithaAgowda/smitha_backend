//package com.excel.vbs.service;
//
//import java.util.Optional;
//
//import org.springframework.beans.factory.annotation.Autowired;
//
//import com.excel.vbs.dto.CustomerRegDto;
//import com.excel.vbs.entity.Pincode;
//import com.excel.vbs.repository.PincodeRepository;
//
//public class CustomerServiceImpl implements CustomerService {
//
//	@Autowired
//	private PincodeRepository pincodeRepository;
//	@Override
//	public String saveCustInfo(CustomerRegDto dto) {
//		
//		Optional<Pincode> optional = pincodeRepository.findBy(dto.getEmployeeId());
//
//		if (optional.isPresent()) {
//
//			EmployeePrimaryInfo employee = optional.get();
//			if (employee.getSecondaryInfo() == null) {
//				EmployeeSecondaryInfo employeeSecondaryInfo = EmployeeUtil.dtoToEntity(dto);
//
//				employee.setSecondaryInfo(employeeSecondaryInfo);
//				employeeSecondaryInfo.setEmployee(employee);
//
//				return employeeRepository.save(employee).getEmployeeId();
//		
//			} else {
//				EmployeeSecondaryInfo secondaryInfo = employee.getSecondaryInfo();
//
//				secondaryInfo.setPanNo(dto.getPanNo());
//				secondaryInfo.setAadharNo(dto.getAadharNo());
//				secondaryInfo.setFatherName(dto.getFatherName());
//				secondaryInfo.setMotherName(dto.getMotherName());
//				secondaryInfo.setMaritalStatus(dto.getMaritalStatus());
//				secondaryInfo.setPassportNo(dto.getPassportNo());
//				secondaryInfo.setSpouseName(dto.getSpouseName());
//
//				return employeeRepository.save(employee).getEmployeeId();
//			}
//
//		}
//
//		throw new EmployeeExistance("Check");
//
//
//}
