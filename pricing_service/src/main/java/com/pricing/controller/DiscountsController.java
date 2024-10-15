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

import com.pricing.model.Discounts;
import com.pricing.service.DiscountsService;

@RestController
@RequestMapping("/api/discounts")
public class DiscountsController {
	
	@Autowired
	private DiscountsService discountsService;
	
	// Create new Discount entry
    @PostMapping
    public ResponseEntity<Discounts> createDiscount(@RequestBody Discounts discounts) {
    	Discounts createdDiscount = discountsService.createDiscount(discounts);
        return new ResponseEntity<>(createdDiscount, HttpStatus.CREATED);
    }

    // Get all Discounts entries
    @GetMapping
    public ResponseEntity<List<Discounts>> getAllDiscounts() {
        List<Discounts> discounts = discountsService.getAllDiscounts();
        return new ResponseEntity<>(discounts, HttpStatus.OK);
    }
    
    // Get a single Discount entry by ID
    @GetMapping("/{id}")
    public ResponseEntity<Discounts> getDiscountById(@PathVariable Long id) {
    	Discounts discount = discountsService.getDiscountById(id);
        return new ResponseEntity<>(discount, HttpStatus.OK);
    }
    
    // Update an existing Discount entry by ID
    @PutMapping("/{id}")
    public ResponseEntity<Discounts> updateDiscountById(@PathVariable Long id, @RequestBody Discounts  discounts) {
    	Discounts updatedDiscountById = discountsService.updateDiscountById(id, discounts);
        return new ResponseEntity<>(updatedDiscountById, HttpStatus.OK);
    }
    
    // Delete a Discount entry by ID
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteDiscountById(@PathVariable Long id) {
    	discountsService.deleteDiscountById(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
    
    
}
