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

import com.pricing.model.SlabPricing;
import com.pricing.service.SlabPricingService;

@RestController
@RequestMapping("/api/slab-pricing")
public class SlabPricingController {

	@Autowired
	private SlabPricingService slabPricingService;
	
	// Create a new slab price entry
    @PostMapping
    public ResponseEntity<SlabPricing> createSlabPrice(@RequestBody SlabPricing slabPricing) {
    	SlabPricing createdSlabPrice = slabPricingService.createSlabPrice(slabPricing);
        return new ResponseEntity<>(createdSlabPrice, HttpStatus.CREATED);
    }
    
    // Get all slab prices entries
    @GetMapping
    public ResponseEntity<List<SlabPricing>> getAllSlabPrices() {
        List<SlabPricing> slabPrices = slabPricingService.getAllSlabPrices();
        return new ResponseEntity<>(slabPrices, HttpStatus.OK);
    }
    
    // Get a single slab price entry by ID
    @GetMapping("/{id}")
    public ResponseEntity<SlabPricing> getSlabPriceById(@PathVariable Long id) {
        SlabPricing slabPrice = slabPricingService.getSlabPriceById(id);
        return new ResponseEntity<>(slabPrice, HttpStatus.OK);
    }
    
    // Update an existing Slab price entry by ID
    @PutMapping("/{id}")
    public ResponseEntity<SlabPricing> updateSlabPrice(@PathVariable Long id, @RequestBody SlabPricing slabPricing) {
        SlabPricing updateSlabPrice = slabPricingService.updateSlabPrice(id, slabPricing);
        return new ResponseEntity<>(updateSlabPrice, HttpStatus.OK);
    }

    // Delete a slab price entry by ID
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteSlabPriceById(@PathVariable Long id) {
        slabPricingService.deleteSlabPriceById(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
	
}
