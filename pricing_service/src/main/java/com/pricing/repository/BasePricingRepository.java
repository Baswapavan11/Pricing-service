package com.pricing.repository;

import com.pricing.model.BasePricing;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BasePricingRepository extends JpaRepository<BasePricing, Long> {
}
