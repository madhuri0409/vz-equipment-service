package com.verizon.equipment;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication 
@EnableDiscoveryClient
public class VzEquipmentServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(VzEquipmentServiceApplication.class, args);
	}

}
