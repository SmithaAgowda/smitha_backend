package com.excel.vbs.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.excel.vbs.dto.PincodeDto;
import com.excel.vbs.entity.Pincode;
import com.excel.vbs.exception.CustomerExistance;
import com.excel.vbs.repository.PincodeRepository;
import com.excel.vbs.utils.CustomerUtils;

@Service
public class PincodeServiceImpl implements PincodeService {

	
	@Autowired
	private PincodeRepository pincodeRepository;
	@Override
	public String savePinInfo(PincodeDto dto) {
		{

			if (!pincodeRepository.findByPincode(dto.getPincode()).isPresent()) {
				Pincode pin = CustomerUtils.dtoToEntity(dto);
				Pincode pin1 = pincodeRepository.save(pin);
				return pin1.getPincode();
			}
			throw new CustomerExistance("Check");
	}

}
}