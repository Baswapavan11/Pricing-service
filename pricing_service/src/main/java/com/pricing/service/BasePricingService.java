package com.pricing.service;

import com.pricing.model.BasePricing;
import com.pricing.repository.BasePricingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BasePricingService {

	@Autowired
	private BasePricingRepository basePricingRepository;

	// Create new BasePricing
	public BasePricing createBasePricing(BasePricing basePricing) {
		return basePricingRepository.save(basePricing);
	}

	// Get all BasePricing entries
	public List<BasePricing> getAllBasePricings() {
		return basePricingRepository.findAll();
	}

	// Get a single BasePricing by ID
	public BasePricing getBasePricingById(Long id) {
		Optional<BasePricing> basePricing = basePricingRepository.findById(id);
		return basePricing.orElseThrow(() -> new RuntimeException("BasePricing not found with id " + id));
	}

	// Update BasePricing
	public BasePricing updateBasePricing(Long id, BasePricing basePricingDetails) {
		BasePricing basePricing = getBasePricingById(id);
		basePricing.setVehicleTypeId(basePricingDetails.getVehicleTypeId());
		basePricing.setMinFare(basePricingDetails.getMinFare());
		basePricing.setCostPerAdditionalDistance(basePricingDetails.getCostPerAdditionalDistance());
		basePricing.setUpdatedAt(basePricingDetails.getUpdatedAt());
		basePricing.setTenantId(basePricingDetails.getTenantId());
		basePricing.setBaseKilometers(basePricingDetails.getBaseKilometers());
		basePricing.setIsApproved(basePricingDetails.getIsApproved());
		basePricing.setCgst(basePricingDetails.getCgst());
		basePricing.setSgst(basePricingDetails.getSgst());
		basePricing.setServiceType(basePricingDetails.getServiceType());
		basePricing.setCreatedBy(basePricingDetails.getCreatedBy());
		basePricing.setUpdatedBy(basePricingDetails.getUpdatedBy());
		return basePricingRepository.save(basePricing);
	}

	// Delete BasePricing
	public void deleteBasePricing(Long id) {
		basePricingRepository.deleteById(id);
	}
}
