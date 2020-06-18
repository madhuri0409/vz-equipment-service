package com.verizon.equipment.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.verizon.equipment.entity.EquipmentDetails;
import com.verizon.equipment.service.EquipmentService;

@RestController
public class EquipmentController {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(EquipmentController.class);
	
	@Autowired
	private EquipmentService equipmentService;
	
	
	
	@GetMapping("/equipmentsById")
	public List<EquipmentDetails> getEquipmemntsById(@RequestParam(value = "id") Integer id) {
		LOGGER.info("Calling Equipment Service for customer id :  {}",id);
		return equipmentService.getEquipmentDetailsByCustomerId(id);
	}

}
