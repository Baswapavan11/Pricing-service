package com.pricing.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pricing.model.ParcelPricing;

@Repository
public interface ParcelPricingRepository extends JpaRepository<ParcelPricing, Long> {

}
