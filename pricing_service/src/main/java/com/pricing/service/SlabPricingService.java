package com.pricing.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pricing.model.SlabPricing;
import com.pricing.repository.SlabPricingRepository;

@Service
public class SlabPricingService {

	@Autowired 
	private SlabPricingRepository slabPricingRepository;

	public SlabPricing createSlabPrice(SlabPricing slabPricing) {
		
		return slabPricingRepository.save(slabPricing);
	}

	public List<SlabPricing> getAllSlabPrices() {

		return slabPricingRepository.findAll();
	}

	public SlabPricing getSlabPriceById(Long id) {
		Optional<SlabPricing> slabprice = slabPricingRepository.findById(id);
		return slabprice.orElseThrow(() -> new RuntimeException("slabprice not found with id " + id));
	}

	public SlabPricing updateSlabPrice(Long id, SlabPricing slabPricing) {
		SlabPricing slabprice = getSlabPriceById(id);
		slabprice.setFareStructureId(slabPricing.getFareStructureId());
		slabprice.setDistanceRangeId(slabPricing.getDistanceRangeId());
		slabprice.setPerKmPricing(slabPricing.getPerKmPricing());
		slabprice.setIsApproved(slabPricing.getIsApproved());
		slabprice.setIsActive(slabPricing.getIsActive());
		slabprice.setApprovedAt(slabPricing.getApprovedAt());
		slabprice.setApprovedBy(slabPricing.getApprovedBy());
		slabprice.setCreatedAt(slabPricing.getCreatedAt());
		slabprice.setCreatedBy(slabPricing.getCreatedBy());
		slabprice.setUpdatedAt(slabPricing.getUpdatedAt());
		slabprice.setUpdatedBy(slabPricing.getUpdatedBy());
		return slabPricingRepository.save(slabprice);
	}

	public void deleteSlabPriceById(Long id) {
		
		slabPricingRepository.deleteById(id);
	}
}
