package com.pricing.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pricing.model.BookingFareType;

@Repository
public interface BookingFareTypeRepository extends JpaRepository<BookingFareType, Long> {

}
