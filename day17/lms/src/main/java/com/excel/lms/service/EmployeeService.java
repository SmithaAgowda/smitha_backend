package com.excel.lms.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.excel.lms.dto.AddressListDto;
import com.excel.lms.dto.ContactInfoListDto;
import com.excel.lms.dto.EducationListDto;
import com.excel.lms.dto.EmployeeAddressDetailsDto;
import com.excel.lms.dto.EmployeeBankDetailsDto;
import com.excel.lms.dto.EmployeePrimaryInfoDto;
import com.excel.lms.dto.EmployeeSecondaryInfoDto;
import com.excel.lms.dto.ExperienceListDto;
import com.excel.lms.dto.SkillListDto;
import com.excel.lms.entity.EmployeeAddressDetails;
import com.excel.lms.entity.EmployeeBankDetails;
import com.excel.lms.entity.EmployeeContact;
import com.excel.lms.entity.EmployeeEducationDetails;
import com.excel.lms.entity.EmployeeExperience;
import com.excel.lms.entity.EmployeePrimaryInfo;
import com.excel.lms.entity.EmployeeSecondaryInfo;
import com.excel.lms.entity.EmployeeTechnicalSkill;
import com.excel.lms.exception.EmployeeExistance;
import com.excel.lms.repository.EmployeeAddressRepository;
import com.excel.lms.repository.EmployeeBankRepository;
import com.excel.lms.repository.EmployeeRepository;
import com.excel.lms.repository.EmployeeSecondaryRepository;
import com.excel.lms.repository.EmployeeSkillRepository;
import com.excel.lms.repository.EmpoyeeEducationRepository;
import com.excel.lms.utils.EmployeeUtil;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class EmployeeService {

	@Autowired
	private EmployeeRepository employeeRepository;
	@Autowired
	private EmployeeSecondaryRepository employeeSecRepository;
	@Autowired
	private EmployeeBankRepository employeeBankRepository;
	@Autowired
	private EmpoyeeEducationRepository empoyeeEducationRepository;
	@Autowired
	private EmployeeAddressRepository employeeAddressRepository;
	@Autowired
	private EmployeeSkillRepository employeeSkillRepository;

	public String savePrimaryInfo(EmployeePrimaryInfoDto dto) {

		if (!employeeRepository.findByEmployeeId(dto.getEmployeeId()).isPresent()) {
			EmployeePrimaryInfo emp = EmployeeUtil.dtoToEntity(dto);
			EmployeePrimaryInfo emp1 = employeeRepository.save(emp);
			return emp1.getEmployeeId();
		}
		throw new EmployeeExistance("Check");

	}

	public String saveSecondaryInfo(EmployeeSecondaryInfoDto dto) {
		Optional<EmployeePrimaryInfo> optional = employeeRepository.findByEmployeeId(dto.getEmployeeId());

		if (optional.isPresent()) {

			EmployeePrimaryInfo employee = optional.get();
			if (employee.getSecondaryInfo() == null) {
				EmployeeSecondaryInfo employeeSecondaryInfo = EmployeeUtil.dtoToEntity(dto);

				employee.setSecondaryInfo(employeeSecondaryInfo);
				employeeSecondaryInfo.setEmployee(employee);

				return employeeRepository.save(employee).getEmployeeId();
//				employeeSecRepository.save(employeeSecondaryInfo).getEmployee().getEmployeeId();
			} else {
				EmployeeSecondaryInfo secondaryInfo = employee.getSecondaryInfo();

				secondaryInfo.setPanNo(dto.getPanNo());
				secondaryInfo.setAadharNo(dto.getAadharNo());
				secondaryInfo.setFatherName(dto.getFatherName());
				secondaryInfo.setMotherName(dto.getMotherName());
				secondaryInfo.setMaritalStatus(dto.getMaritalStatus());
				secondaryInfo.setPassportNo(dto.getPassportNo());
				secondaryInfo.setSpouseName(dto.getSpouseName());

				return employeeRepository.save(employee).getEmployeeId();
			}
//			return emp1.getEmpSecondaryId();
		}

		throw new EmployeeExistance("Check");

	}

	public String saveBankInfo(EmployeeBankDetailsDto dto) {

		Optional<EmployeePrimaryInfo> optional = employeeRepository.findByEmployeeId(dto.getEmployeeId());
		if (optional.isPresent()) {
			EmployeePrimaryInfo employee = optional.get();
			if (employee.getBankInfo() == null) {
				EmployeeBankDetails employeeBankDetails = EmployeeUtil.dtoToEntity(dto);

				employee.setBankInfo(employeeBankDetails);
				employeeBankDetails.setEmployee(employee);

				return employeeRepository.save(employee).getEmployeeId();
			} else {
				EmployeeBankDetails bankDetails = employee.getBankInfo();
				bankDetails.setAccountNo(dto.getAccountNo());
				bankDetails.setBankName(dto.getBankName());
				bankDetails.setAccountType(dto.getAccountType());
				bankDetails.setIfscCode(dto.getIfscCode());
				bankDetails.setBranch(dto.getBranch());
				bankDetails.setState(dto.getState());

				return employeeRepository.save(employee).getEmployeeId();
			}
		}

		throw new EmployeeExistance("Check");
	}

	public String addEducations(EducationListDto dto) {
		Optional<EmployeePrimaryInfo> optional = employeeRepository.findByEmployeeId(dto.getEmployeeId());
		
		if(optional.isPresent()) {
			EmployeePrimaryInfo employee = optional.get();
			List<EmployeeEducationDetails> educations = dto.getEducations().stream()
					.map(edu->EmployeeEducationDetails.builder()
							.educationType(edu.getEducationType())
							.yearOfPass(edu.getYearOfPass())
							.percentage(edu.getPercentage())
							.universityName(edu.getUniversityName())
							.instituteName(edu.getInstituteName())
							.specialization(edu.getSpecialization())
							.state(edu.getState())
							.build()).collect(Collectors.toList());
			
			
			if (employee.getEmployeeEducationDetails() != null) {
				employee.getEmployeeEducationDetails().stream().forEach(empoyeeEducationRepository::delete);
				employee.setEmployeeEducationDetails(null);
				
			}
			employee.setEmployeeEducationDetails(new ArrayList<>(educations));
			educations.stream().forEach(edu->edu.setEmployee(employee));
		
			
		   return 	employeeRepository.save(employee).getEmployeeId();
		}
		throw new EmployeeExistance("Check");
	}

	public String addAddress(AddressListDto dto) {
		
       Optional<EmployeePrimaryInfo> optional = employeeRepository.findByEmployeeId(dto.getEmployeeId());
		
		if(optional.isPresent()) {
			EmployeePrimaryInfo employee = optional.get();
			List<EmployeeAddressDetails> addressDetails = dto.getAddressDetails().stream()
					.map(ad->EmployeeAddressDetails.builder()
							.addressType(ad.getAddressType())
							.doorNo(ad.getDoorNo())
							.street(ad.getStreet())
							.locality(ad.getLocality())
							.city(ad.getCity())
							.state(ad.getState())
							.pincode(ad.getPincode())
							.landMark(ad.getLandMark())
							.build()).collect(Collectors.toList());
			
			employee.setEmployeeAddress(addressDetails);
			addressDetails.stream().forEach(ad->ad.setEmployee(employee));
			
			return employeeRepository.save(employee).getEmployeeId();
			
		}
		throw new EmployeeExistance("Check");
	}

	public String addExperience(ExperienceListDto dto) {
		
		  Optional<EmployeePrimaryInfo> optional = employeeRepository.findByEmployeeId(dto.getEmployeeId());
			
			if(optional.isPresent()) {
				EmployeePrimaryInfo employee = optional.get();
				List<EmployeeExperience> experiencedetails = dto.getExperience().stream()
						.map(exp->EmployeeExperience.builder()
								.companyName(exp.getCompanyName())
								.yearOfExperience(exp.getYearOfExperience())
								.dateOfJoining(exp.getDateOfJoining())
								.dateOfRelieving(exp.getDateOfRelieving())
								.designation(exp.getDesignation())
								.location(exp.getLocation())
								.build()).collect(Collectors.toList());
				
				employee.setEmployeeExperience(experiencedetails);
				experiencedetails.stream().forEach(exp->exp.setEmployee(employee));
			
				return employeeRepository.save(employee).getEmployeeId();
				
			}
			throw new EmployeeExistance("Check");
		}

	public String addContactInfo(ContactInfoListDto dto) {
		  Optional<EmployeePrimaryInfo> optional = employeeRepository.findByEmployeeId(dto.getEmployeeId());
			
			if(optional.isPresent()) {
				EmployeePrimaryInfo employee = optional.get();
				List<EmployeeContact> contact = dto.getContacts().stream()
						.map(con->EmployeeContact.builder()
								.contactType(con.getContactType())
								.contactNumber(con.getContactNumber())
							.build()).collect(Collectors.toList());
				
				employee.setContactInfo(contact);
				contact.stream().forEach(con->con.setEmployee(employee));
			
				return employeeRepository.save(employee).getEmployeeId();
				
			}
			throw new EmployeeExistance("Check");
		}

//	public String addSkills(SkillListDto dto) {
		
//		Optional<EmployeePrimaryInfo> optional = employeeRepository.findByEmployeeId(dto.getEmployeeId());
//		
//		if(optional.isPresent()) {
//			EmployeePrimaryInfo employee = optional.get();
//			List<EmployeeTechnicalSkill> skills = dto.getSkills().stream()
//					.map(skl->EmployeeTechnicalSkill.builder()
//					.skillType(skl.getSkillType())
//					.skillRating(skl.getSkillRating())
//					.yearOfExp(skl.getYearOfExp())
//					.employee(new Arraylist<>())
//					.build()).collect(Collectors.toList());
//				
//					employee.setEmployeeSkill(skills);
//					
//					skills.stream().forEach(skl->skl.getEmployee().add(employee));
//					return employeeRepository.save(employee).getEmployeeId();
//		}
//		
//		throw new EmployeeExistance("Check");
		
	public String addSkills(SkillListDto dto) {
		Optional<EmployeePrimaryInfo> emoptional = employeeRepository.findByEmployeeId(dto.getEmployeeId());
		if(emoptional.isPresent()) {
			EmployeePrimaryInfo employee = emoptional.get();
			List<EmployeeTechnicalSkill> skills = dto.getSkills().stream().map(skill ->{
				Optional<EmployeeTechnicalSkill> optional =employeeSkillRepository.findBySkillTypeAndSkillRatingAndYearOfExp(
						skill.getSkillType(),skill.getSkillRating(),skill.getYearOfExp());
				
				return optional.isPresent() ? optional.get():EmployeeUtil.dtoToEntity(skill);
			}).collect(Collectors.toList());
			
			if(employee.getEmployeeSkill()!=null) {
				employee.getEmployeeSkill().clear();
			}
			
			skills.stream().forEach(x->{
				if(!x.getEmployee().contains(employee))
					x.getEmployee().add(employee);
			});
			employee.setEmployeeSkill(skills);
			employeeRepository.save(employee);
			return employee.getEmployeeId();
		}
		throw new EmployeeExistance("Check");
		
	}
	
}
