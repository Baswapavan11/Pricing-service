package com.pricing.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pricing.model.Discounts;
import com.pricing.repository.DiscountsRepository;

@Service
public class DiscountsService {

	@Autowired
	private DiscountsRepository discountsRepository;

	public Discounts createDiscount(Discounts discounts) {
	
		return discountsRepository.save(discounts);
	}

	public List<Discounts> getAllDiscounts() {
	
		return discountsRepository.findAll();
	}

	public Discounts getDiscountById(Long id) {
		 Optional<Discounts> discount = discountsRepository.findById(id);
	        return discount.orElseThrow(() -> new RuntimeException("DistancePricing not found with id " + id));
	}

	public Discounts updateDiscountById(Long id, Discounts discounts) {
		Discounts discount = getDiscountById(id);
		discount.setDiscountType(discounts.getDiscountType());
		discount.setDiscountValue(discounts.getDiscountValue());
		discount.setValidFrom(discounts.getValidFrom());
		discount.setValidTo(discounts.getValidTo());
		discount.setIsActive(discounts.getIsActive());
		discount.setVehicleTypeId(discounts.getVehicleTypeId());
		discount.setCreatedAt(discounts.getCreatedAt());
		discount.setCreatedBy(discounts.getCreatedBy());
		discount.setUpdatedAt(discounts.getUpdatedAt());
		discount.setUpdatedBy(discounts.getUpdatedBy());
		return discountsRepository.save(discount);
	}

	public void deleteDiscountById(Long id) {
		
		discountsRepository.deleteById(id);
	}
	
}
