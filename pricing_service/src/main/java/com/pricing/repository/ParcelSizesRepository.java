package com.pricing.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pricing.model.ParcelSizes;

@Repository
public interface ParcelSizesRepository extends JpaRepository<ParcelSizes, Long> {

	
	
}
