package com.pricing.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pricing.model.AdditionalCharges;

public interface AdditionalChargesRepository extends JpaRepository<AdditionalCharges, Long> {

}
