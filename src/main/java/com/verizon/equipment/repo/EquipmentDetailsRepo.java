package com.verizon.equipment.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.verizon.equipment.entity.EquipmentDetails;

@Repository
public interface EquipmentDetailsRepo extends JpaRepository<EquipmentDetails, Integer> {

	List<EquipmentDetails> findAllByCustomerId(Integer customerId);
}
