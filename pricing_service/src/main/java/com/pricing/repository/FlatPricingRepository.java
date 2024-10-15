package com.pricing.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pricing.model.FlatPricing;

@Repository
public interface FlatPricingRepository extends JpaRepository<FlatPricing, Long> {

}
