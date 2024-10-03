package com.pricing.controller;



import com.pricing.model.BasePricing;
import com.pricing.service.BasePricingService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/base-pricing")
public class BasePricingController {

    @Autowired
    private BasePricingService basePricingService;

    // Create new BasePricing entry
    @PostMapping
    public ResponseEntity<BasePricing> createBasePricing(@RequestBody BasePricing basePricing) {
        BasePricing createdBasePricing = basePricingService.createBasePricing(basePricing);
        return new ResponseEntity<>(createdBasePricing, HttpStatus.CREATED);
    }

    // Get all BasePricing entries
    @GetMapping
    public ResponseEntity<List<BasePricing>> getAllBasePricings() {
        List<BasePricing> basePricings = basePricingService.getAllBasePricings();
        return new ResponseEntity<>(basePricings, HttpStatus.OK);
    }

    // Get a single BasePricing entry by ID
    @GetMapping("/{id}")
    public ResponseEntity<BasePricing> getBasePricingById(@PathVariable Long id) {
        BasePricing basePricing = basePricingService.getBasePricingById(id);
        return new ResponseEntity<>(basePricing, HttpStatus.OK);
    }

    // Update an existing BasePricing entry by ID
    @PutMapping("/{id}")
    public ResponseEntity<BasePricing> updateBasePricing(@PathVariable Long id, @RequestBody BasePricing basePricing) {
        BasePricing updatedBasePricing = basePricingService.updateBasePricing(id, basePricing);
        return new ResponseEntity<>(updatedBasePricing, HttpStatus.OK);
    }

    // Delete a BasePricing entry by ID
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteBasePricing(@PathVariable Long id) {
        basePricingService.deleteBasePricing(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
