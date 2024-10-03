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

import com.pricing.model.ParcelPricing;
import com.pricing.service.ParcelPricingService;

@RestController
@RequestMapping("/api/parcel-pricing")
public class ParcelPricingController {

	 @Autowired
	 private ParcelPricingService parcelPricingService;

	  // Create new ParcelPricing entry
	  @PostMapping
	  public ResponseEntity<ParcelPricing> createParcelPrice(@RequestBody ParcelPricing parcelPricing) {
	      ParcelPricing createdParcelPrice = parcelPricingService.createParcelPrice(parcelPricing);
	      return new ResponseEntity<>(createdParcelPrice, HttpStatus.CREATED);
	  }
	  

	    // Get all ParcelPricing entries
	    @GetMapping
	    public ResponseEntity<List<ParcelPricing>> getAllParcelPrices() {
	        List<ParcelPricing> parcelprice = parcelPricingService.getAllParcelPrices();
	        return new ResponseEntity<>(parcelprice, HttpStatus.OK);
	    }
	    
	 // Get a single ParcelPrice entry by ID
	    @GetMapping("/{id}")
	    public ResponseEntity<ParcelPricing> getParcelPriceById(@PathVariable Long id) {
	        ParcelPricing parcelprice = parcelPricingService.getParcelPriceById(id);
	        return new ResponseEntity<>(parcelprice, HttpStatus.OK);
	    }
	    
	    // Update an existing ParcelPrice entry by ID
	    @PutMapping("/{id}")
	    public ResponseEntity<ParcelPricing> updateParcelPrice(@PathVariable Long id, @RequestBody ParcelPricing parcelPricing) {
	        ParcelPricing updatedParcelPrice = parcelPricingService.updateParcelPrice(id, parcelPricing);
	        return new ResponseEntity<>(updatedParcelPrice, HttpStatus.OK);
	    }
	    
	    // Delete a ParcelPrice entry by ID
	    @DeleteMapping("/{id}")
	    public ResponseEntity<Void> deleteParcelPrice(@PathVariable Long id) {
	        parcelPricingService.deleteParcelPrice(id);
	        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
	    }

	    
}
