package com.pricing.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pricing.model.FlatPricing;
import com.pricing.repository.FlatPricingRepository;

@Service
public class FlatPricingService {

	@Autowired
	private FlatPricingRepository flatPricingRepository;

	public FlatPricing createFlatPrice(FlatPricing flatPricing) {
	
		return flatPricingRepository.save(flatPricing);
	}

	public List<FlatPricing> getAllFlatPrices() {
		
		return flatPricingRepository.findAll();
	}

	public FlatPricing getFlatPriceById(Long id) {
		Optional<FlatPricing> flatPrice = flatPricingRepository.findById(id);
		return flatPrice.orElseThrow(() -> new RuntimeException("Flat price not found with id " + id));
	}

	public FlatPricing updateFLatPrice(Long id, FlatPricing flatPricing) {
		FlatPricing flatPrice = getFlatPriceById(id);
		flatPrice.setFareStructureId(flatPricing.getFareStructureId());
		flatPrice.setDistanceRangeId(flatPricing.getDistanceRangeId());
		flatPrice.setFlatPrice(flatPricing.getFlatPrice());
		flatPrice.setIsActive(flatPricing.getIsActive());
		flatPrice.setCreatedAt(flatPricing.getCreatedAt());
		flatPrice.setCreatedBy(flatPricing.getCreatedBy());
		flatPrice.setIsApproved(flatPricing.getIsApproved());
		flatPrice.setApprovedAt(flatPricing.getApprovedAt());
		flatPrice.setApprovedBy(flatPricing.getApprovedBy());
		flatPrice.setUpdatedAt(flatPricing.getUpdatedAt());
		flatPrice.setUpdatedBy(flatPricing.getUpdatedBy());
		return flatPricingRepository.save(flatPrice);
	}

	public void deleteFlatPriceById(Long id) {
		flatPricingRepository.deleteById(id);
		
	}
	
}
