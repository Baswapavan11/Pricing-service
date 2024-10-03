package com.pricing.repository;

import com.pricing.model.ParcelWeights;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ParcelWeightsRepository extends JpaRepository<ParcelWeights, Long> {
}
