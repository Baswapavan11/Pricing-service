package com.pricing.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pricing.model.BookingFareType;
import com.pricing.service.BookingFareTypeService;

@RestController
@RequestMapping("/api/booking-fare-type")
public class BookingFareTypeController {

	@Autowired
	private BookingFareTypeService bookingFareTypeService;
	

	// Create new Booking Fare type entry
    @PostMapping
    public ResponseEntity<BookingFareType> createBookingFareType(@RequestBody BookingFareType bookingFareType) {
    	BookingFareType createdBookingFareType = bookingFareTypeService.createBookingFareType(bookingFareType);
        return new ResponseEntity<>(createdBookingFareType, HttpStatus.CREATED);
    }
	
    // Get all Booking fare types entries
    @GetMapping
    public ResponseEntity<List<BookingFareType>> getAllBookingFareTypes() {
        List<BookingFareType> bookingFare = bookingFareTypeService.getAllBookingFareTypes();
        return new ResponseEntity<>(bookingFare, HttpStatus.OK);
    }
    
    // Get a single Booking Fare type entry by ID
    @GetMapping("/{id}")
    public ResponseEntity<BookingFareType> getBookingFareTypeById(@PathVariable Long id) {
    	BookingFareType bookingFare = bookingFareTypeService.getBookingFareTypeById(id);
        return new ResponseEntity<>(bookingFare, HttpStatus.OK);
    }
    
    // Update an existing Booking Fare type entry by ID
    @PutMapping("/{id}")
    public ResponseEntity<BookingFareType> updateBookingFareTypeById(@PathVariable Long id, @RequestBody BookingFareType  bookingFareType) {
    	BookingFareType updatedBookingFareType = bookingFareTypeService.updateBookingFareTypeById(id, bookingFareType);
        return new ResponseEntity<>(updatedBookingFareType, HttpStatus.OK);
    }
    
    // Delete a Booking Fare type entry by ID
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteBookingFareTypeById(@PathVariable Long id) {
    	bookingFareTypeService.deleteBookingFareTypeById(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
    
}
