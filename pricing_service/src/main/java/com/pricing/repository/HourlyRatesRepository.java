package com.pricing.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pricing.model.HourlyRates;

@Repository
public interface HourlyRatesRepository extends JpaRepository<HourlyRates, Long> {

}
