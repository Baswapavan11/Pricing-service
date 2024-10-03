package com.pricing.repository;

import com.pricing.model.DistancePricing;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DistancePricingRepository extends JpaRepository<DistancePricing, Long> {
}
