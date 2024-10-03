package com.pricing.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pricing.model.ParcelPricing;
import com.pricing.repository.ParcelPricingRepository;

@Service
public class ParcelPricingService {

	@Autowired
	private ParcelPricingRepository parcelPricingRepository;
	
	public ParcelPricing createParcelPrice(ParcelPricing parcelPricing) {
		return parcelPricingRepository.save(parcelPricing);
	}

	public List<ParcelPricing> getAllParcelPrices() {
		return parcelPricingRepository.findAll();
	}

	public ParcelPricing getParcelPriceById(Long id) {
		   Optional<ParcelPricing> parcelPrice = parcelPricingRepository.findById(id);
	        return parcelPrice.orElseThrow(() -> new RuntimeException("parcel price not found with id " + id));
	}

	public ParcelPricing updateParcelPrice(Long id, ParcelPricing parcelPricing) {
		ParcelPricing parcelPrice = getParcelPriceById(id);
		parcelPrice.setParcelTypeId(parcelPricing.getParcelTypeId());
		parcelPrice.setParcelSizeId(parcelPricing.getParcelSizeId());
		parcelPrice.setParcelWeightId(parcelPricing.getParcelWeightId());
		parcelPrice.setPrice(parcelPricing.getPrice());
		parcelPrice.setCreatedAt(parcelPricing.getCreatedAt());
		parcelPrice.setCreatedBy(parcelPricing.getCreatedBy());
		parcelPrice.setUpdatedAt(parcelPricing.getUpdatedAt());
		parcelPrice.setUpdatedBy(parcelPricing.getUpdatedBy());
		return parcelPricingRepository.save(parcelPrice);
	}

	public void deleteParcelPrice(Long id) {
		parcelPricingRepository.deleteById(id);
		
	}

}
