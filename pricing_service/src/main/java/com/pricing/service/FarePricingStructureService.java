package com.pricing.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pricing.model.FarePricingStructure;
import com.pricing.repository.FarePricingStructureRepository;

@Service
public class FarePricingStructureService {

	@Autowired
	private FarePricingStructureRepository farePricingStructureRepository;

	public FarePricingStructure createFarePricingStructure(FarePricingStructure farePricingStructure) {
		
		return farePricingStructureRepository.save(farePricingStructure);
	}

	public List<FarePricingStructure> getAllFarePriceStructure() {
		
		return farePricingStructureRepository.findAll();
	}

	public FarePricingStructure getFarePriceStructureById(Long id) {
		Optional<FarePricingStructure> farePricingStructure = farePricingStructureRepository.findById(id);
		return farePricingStructure.orElseThrow(() -> new RuntimeException("BasePricing not found with id " + id));
	}

	public FarePricingStructure updateFarePricingStructureById(Long id, FarePricingStructure farePricingStructure) {
		FarePricingStructure fareStructure = getFarePriceStructureById(id);
		fareStructure.setVehicleTypeId(farePricingStructure.getVehicleTypeId());
		fareStructure.setMinFare(farePricingStructure.getMinFare());
		fareStructure.setTenantId(farePricingStructure.getTenantId());
		fareStructure.setBaseKilometers(farePricingStructure.getBaseKilometers());
		fareStructure.setIsApproved(farePricingStructure.getIsApproved());
		fareStructure.setIsActive(farePricingStructure.getIsActive());
		fareStructure.setPickUpCharges(farePricingStructure.getPickUpCharges());
		fareStructure.setBookingFareTypeId(farePricingStructure.getBookingFareTypeId());
		fareStructure.setBookingFee(farePricingStructure.getBookingFee());
		fareStructure.setLableName(farePricingStructure.getLableName());
		fareStructure.setCreatedAt(farePricingStructure.getCreatedAt());
		fareStructure.setCreatedBy(farePricingStructure.getCreatedBy());
		fareStructure.setUpdatedAt(farePricingStructure.getUpdatedAt());
		fareStructure.setUpdatedBy(farePricingStructure.getUpdatedBy());
		return farePricingStructureRepository.save(fareStructure);
	}

	public void deleteFarePricingStructureById(Long id) {
		farePricingStructureRepository.deleteById(id);
		
	}
	
	
}
