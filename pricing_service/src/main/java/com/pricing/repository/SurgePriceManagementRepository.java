package com.pricing.repository;

import com.pricing.model.SurgePriceManagement;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SurgePriceManagementRepository extends JpaRepository<SurgePriceManagement, Long> {
}
