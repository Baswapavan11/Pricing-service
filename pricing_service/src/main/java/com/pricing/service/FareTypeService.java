package com.pricing.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pricing.model.FareType;
import com.pricing.repository.FareTypeRepository;

@Service
public class FareTypeService {

	@Autowired
	private FareTypeRepository fareTypeRepository;

	public FareType createFlatPrice(FareType fareType) {
		
		return fareTypeRepository.save(fareType);
	}

	public List<FareType> getAllFareTypes() {
		
		return fareTypeRepository.findAll();
	}

	public FareType getFlatPriceById(Long id) {
        Optional<FareType> fareType = fareTypeRepository.findById(id);
        return fareType.orElseThrow(() -> new RuntimeException("Fare type not found with id " + id));
	}

	public FareType updateFareTypeById(Long id, FareType fareType) {
		FareType fareTypes = getFlatPriceById(id);
		fareTypes.setFareType(fareTypes.getFareType());
		fareType.setIsActive(fareTypes.getIsActive());
		fareType.setCreatedAt(fareTypes.getCreatedAt());
		fareType.setCreatedBy(fareTypes.getCreatedBy());
		fareType.setUpdatedAt(fareTypes.getUpdatedAt());
		fareType.setUpdatedBy(fareTypes.getUpdatedBy());
		return fareTypeRepository.save(fareType);
	}

	public void deleteFareTypeById(Long id) {
		fareTypeRepository.deleteById(id);
		
	}
	
}
