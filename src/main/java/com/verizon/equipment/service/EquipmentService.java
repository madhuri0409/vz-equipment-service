package com.verizon.equipment.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.verizon.equipment.entity.EquipmentDetails;
import com.verizon.equipment.repo.EquipmentDetailsRepo;

@Service
public class EquipmentService {

	Logger LOGGER = LoggerFactory.getLogger(EquipmentService.class);
	
	@Autowired
	private EquipmentDetailsRepo equipmentDetailsRepo;
	
	public List<EquipmentDetails> getEquipmentDetailsByCustomerId(Integer customerId){
		LOGGER.info("In Equipment Service : Fetching Equipment Details  for Customer Id {}", customerId);
		return equipmentDetailsRepo.findAllByCustomerId(customerId);
	}
	
}
