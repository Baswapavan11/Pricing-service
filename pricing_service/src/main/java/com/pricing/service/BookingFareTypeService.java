package com.pricing.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pricing.model.BookingFareType;
import com.pricing.repository.BookingFareTypeRepository;

@Service
public class BookingFareTypeService {

	@Autowired
	private BookingFareTypeRepository bookingFareTypeRepository;

	public BookingFareType createBookingFareType(BookingFareType bookingFareType) {
		
		return bookingFareTypeRepository.save(bookingFareType);
	}

	public List<BookingFareType> getAllBookingFareTypes() {
		
		return bookingFareTypeRepository.findAll();
	}

	public BookingFareType getBookingFareTypeById(Long id) {
		Optional<BookingFareType> bookingFare = bookingFareTypeRepository.findById(id);
		return bookingFare.orElseThrow(() -> new RuntimeException("Booking fare type not found with id " + id));
	}

	public BookingFareType updateBookingFareTypeById(Long id, BookingFareType bookingFareType) {
		BookingFareType bookingFare = getBookingFareTypeById(id);
		bookingFare.setServiceOfferingsId(bookingFareType.getServiceOfferingsId());
		bookingFare.setFareTypeId(bookingFareType.getFareTypeId());
		bookingFare.setIsActive(bookingFareType.getIsActive());
		bookingFare.setCreatedAt(bookingFareType.getCreatedAt());
		bookingFare.setCreatedBy(bookingFareType.getCreatedBy());
		bookingFare.setUpdatedAt(bookingFareType.getUpdatedAt());
		bookingFare.setUpdatedBy(bookingFareType.getUpdatedBy());
		return bookingFareTypeRepository.save(bookingFare);
	}

	public void deleteBookingFareTypeById(Long id) {
		bookingFareTypeRepository.deleteById(id);
	}
	
}
