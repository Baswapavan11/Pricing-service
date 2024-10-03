package com.pricing.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pricing.model.ParcelSizes;
import com.pricing.repository.ParcelSizesRepository;

@Service
public class ParcelSizesService {

	@Autowired
	private ParcelSizesRepository parcelSizesRepository;

	public ParcelSizes createParcelSizes(ParcelSizes parcelSizes) {
		return parcelSizesRepository.save(parcelSizes);
	}

	public List<ParcelSizes> getAllParcelSizes() {
		return parcelSizesRepository.findAll();
	}

	public ParcelSizes getParcelSizeById(Long id) {
		  Optional<ParcelSizes> parcelSize = parcelSizesRepository.findById(id);
	        return parcelSize.orElseThrow(() -> new RuntimeException("parcel size not found with id " + id));
	}

	public ParcelSizes updateParcelSizes(Long id, ParcelSizes parcelSizes) {
		ParcelSizes parcelSize = getParcelSizeById(id);
		parcelSize.setSizeName(parcelSizes.getSizeName());
		parcelSize.setMinDimension(parcelSizes.getMinDimension());
		parcelSize.setMaxDimension(parcelSizes.getMaxDimension());
		parcelSize.setCreatedAt(parcelSizes.getCreatedAt());
		parcelSize.setCreatedBy(parcelSizes.getCreatedBy());
		parcelSize.setIsActive(parcelSizes.getIsActive());
		parcelSize.setUpdatedAt(parcelSizes.getUpdatedAt());
		parcelSize.setUpdatedBy(parcelSizes.getUpdatedBy());
		return parcelSizesRepository.save(parcelSize);
	}

	public void deleteParcelSize(Long id) {
		parcelSizesRepository.deleteById(id);
		
	}
	
}
