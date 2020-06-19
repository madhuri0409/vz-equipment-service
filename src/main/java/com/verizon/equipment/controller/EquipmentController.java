package com.verizon.equipment.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.verizon.equipment.entity.EquipmentDetails;
import com.verizon.equipment.service.EquipmentService;

import brave.Tracer;

@RestController
public class EquipmentController {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(EquipmentController.class);
	
	@Autowired
	private EquipmentService equipmentService;
	
	@Autowired
	private RestTemplate restTemplate;
	
	@Value("${kafka.service.uri}")
	private String kafkaServiceUri;
	
	@Autowired
	Tracer tracer;
	
	@GetMapping("/equipmentsById")
	public List<EquipmentDetails> getEquipmemntsById(@RequestParam(value = "id") Integer id) {
		Long currentTime = System.currentTimeMillis();
		LOGGER.info("Calling Equipment Service for customer id :  {}",id);
		List<EquipmentDetails> equipmentdetails = equipmentService.getEquipmentDetailsByCustomerId(id);
		
		String message = String.format("%d | %s | %s | %s | %s | %s", currentTime, "EquipmentService", tracer.currentSpan().context().spanIdString(), tracer.currentSpan().context().traceIdString(), id, equipmentdetails);
		restTemplate.getForObject(kafkaServiceUri + "=" + message, String.class);
		
		return equipmentdetails;
	}

}
