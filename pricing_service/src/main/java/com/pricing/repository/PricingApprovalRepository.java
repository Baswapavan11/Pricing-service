package com.pricing.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pricing.model.PricingApproval;

@Repository
public interface PricingApprovalRepository extends JpaRepository<PricingApproval, Long> {

}
