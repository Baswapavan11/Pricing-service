package com.pricing.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pricing.model.FareType;

@Repository
public interface FareTypeRepository extends JpaRepository<FareType, Long> {

}
