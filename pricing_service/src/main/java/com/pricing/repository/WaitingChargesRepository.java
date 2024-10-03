package com.pricing.repository;

import com.pricing.model.WaitingCharges;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WaitingChargesRepository extends JpaRepository<WaitingCharges, Long> {
}
