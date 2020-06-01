package com.verizon.equipment.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.verizon.equipment.entity.EquipmentDetails;
import com.verizon.equipment.repo.EquipmentDetailsRepo;

@Service
public class EquipmentService {

	@Autowired
	private EquipmentDetailsRepo equipmentDetailsRepo;
	
	public List<EquipmentDetails> getEquipmentDetailsByCustomerId(Integer customerId){
		return equipmentDetailsRepo.findAllByCustomerId(customerId);
	}
	
}
