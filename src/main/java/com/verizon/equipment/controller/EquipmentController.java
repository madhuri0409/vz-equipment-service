package com.verizon.equipment.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.verizon.equipment.entity.EquipmentDetails;
import com.verizon.equipment.service.EquipmentService;

@RestController
public class EquipmentController {
	
	@Autowired
	private EquipmentService equipmentService;
	
	@GetMapping("/equipmentsById")
	public List<EquipmentDetails> getEquipmemntsById(@RequestParam(value = "id") Integer id) {
		return equipmentService.getEquipmentDetailsByCustomerId(id);
	}

}
