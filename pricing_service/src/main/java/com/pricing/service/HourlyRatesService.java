package com.pricing.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pricing.model.HourlyRates;
import com.pricing.repository.HourlyRatesRepository;

@Service
public class HourlyRatesService {

	@Autowired
	private HourlyRatesRepository hourlyRatesRepository;

	public HourlyRates createHourlyRate(HourlyRates hourlyRates) {
		
		return hourlyRatesRepository.save(hourlyRates);
	}

	public List<HourlyRates> getAllHourlyRates() {
		
		return hourlyRatesRepository.findAll();
	}

	public HourlyRates getHourlyRateById(Long id) {
		Optional<HourlyRates> hourlyRate = hourlyRatesRepository.findById(id);
        return hourlyRate.orElseThrow(() -> new RuntimeException("Hourly rate not found with id " + id));
	}

	public HourlyRates updateHourlyRate(Long id, HourlyRates hourlyRates) {
		HourlyRates hourlyRate = getHourlyRateById(id);
		hourlyRate.setFareStructureId(hourlyRates.getFareStructureId());
		hourlyRate.setHours(hourlyRates.getHours());
		hourlyRate.setKilometers(hourlyRates.getKilometers());
		hourlyRate.setIsApproved(hourlyRates.getIsApproved());
		hourlyRate.setIsActive(hourlyRates.getIsActive());
		hourlyRate.setPrice(hourlyRates.getPrice());
		hourlyRate.setCreatedAt(hourlyRates.getCreatedAt());
		hourlyRate.setCreatedBy(hourlyRates.getCreatedBy());
		hourlyRate.setUpdatedAt(hourlyRates.getUpdatedAt());
		hourlyRate.setUpdatedBy(hourlyRates.getUpdatedBy());
		return hourlyRatesRepository.save(hourlyRate);
	}

	public void deleteHourlyRateById(Long id) {
		hourlyRatesRepository.deleteById(id);
		
	}
	
	
	
}
