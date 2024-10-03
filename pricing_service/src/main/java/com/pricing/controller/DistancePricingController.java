package com.pricing.controller;

import com.pricing.model.DistancePricing;
import com.pricing.service.DistancePricingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/distance-pricing")
public class DistancePricingController {

    @Autowired
    private DistancePricingService distancePricingService;

    // Create new DistancePricing entry
    @PostMapping
    public ResponseEntity<DistancePricing> createDistancePricing(@RequestBody DistancePricing distancePricing) {
        DistancePricing createdDistancePricing = distancePricingService.createDistancePricing(distancePricing);
        return new ResponseEntity<>(createdDistancePricing, HttpStatus.CREATED);
    }

    // Get all DistancePricing entries
    @GetMapping
    public ResponseEntity<List<DistancePricing>> getAllDistancePricings() {
        List<DistancePricing> distancePricings = distancePricingService.getAllDistancePricings();
        return new ResponseEntity<>(distancePricings, HttpStatus.OK);
    }

    // Get a single DistancePricing entry by ID
    @GetMapping("/{id}")
    public ResponseEntity<DistancePricing> getDistancePricingById(@PathVariable Long id) {
        DistancePricing distancePricing = distancePricingService.getDistancePricingById(id);
        return new ResponseEntity<>(distancePricing, HttpStatus.OK);
    }

    // Update an existing DistancePricing entry by ID
    @PutMapping("/{id}")
    public ResponseEntity<DistancePricing> updateDistancePricing(@PathVariable Long id, @RequestBody DistancePricing distancePricing) {
        DistancePricing updatedDistancePricing = distancePricingService.updateDistancePricing(id, distancePricing);
        return new ResponseEntity<>(updatedDistancePricing, HttpStatus.OK);
    }

    // Delete a DistancePricing entry by ID
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteDistancePricing(@PathVariable Long id) {
        distancePricingService.deleteDistancePricing(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
