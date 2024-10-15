package com.pricing.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pricing.model.Discounts;

@Repository
public interface DiscountsRepository extends JpaRepository<Discounts, Long> {

}
