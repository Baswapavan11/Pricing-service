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

import com.pricing.model.FlatPricing;
import com.pricing.service.FlatPricingService;

@RestController
@RequestMapping("/api/flat-pricing")
public class FlatPricingController {

	@Autowired
	private FlatPricingService flatPricingService;
	
	  // Create new Flat pricing entry
    @PostMapping
    public ResponseEntity<FlatPricing> createFlatPrice(@RequestBody FlatPricing flatPricing) {
        FlatPricing createdFlatPrice = flatPricingService.createFlatPrice(flatPricing);
        return new ResponseEntity<>(createdFlatPrice, HttpStatus.CREATED);
    }
	
    // Get all Flat prices entries
    @GetMapping
    public ResponseEntity<List<FlatPricing>> getAllFlatPrices() {
        List<FlatPricing> flatPrices = flatPricingService.getAllFlatPrices();
        return new ResponseEntity<>(flatPrices, HttpStatus.OK);
    }

    // Get a single Flat price entry by ID
    @GetMapping("/{id}")
    public ResponseEntity<FlatPricing> getFlatPriceById(@PathVariable Long id) {
    	FlatPricing flatPrice = flatPricingService.getFlatPriceById(id);
        return new ResponseEntity<>(flatPrice, HttpStatus.OK);
    }


    // Update an existing Flat price entry by ID
    @PutMapping("/{id}")
    public ResponseEntity<FlatPricing> updateFLatPrice(@PathVariable Long id, @RequestBody FlatPricing  flatPricing) {
    	FlatPricing updatedFLatPrice = flatPricingService.updateFLatPrice(id, flatPricing);
        return new ResponseEntity<>(updatedFLatPrice, HttpStatus.OK);
    }
    
 // Delete a Flat Price entry by ID
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteFlatPriceById(@PathVariable Long id) {
        flatPricingService.deleteFlatPriceById(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
