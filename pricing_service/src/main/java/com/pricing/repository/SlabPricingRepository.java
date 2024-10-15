package com.pricing.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pricing.model.SlabPricing;

@Repository
public interface SlabPricingRepository extends JpaRepository<SlabPricing, Long> {

}
