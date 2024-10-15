package com.pricing.controller;

import com.pricing.model.DistanceRange;
import com.pricing.service.DistanceRangeService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/distance-pricing")
public class DistanceRangeController {

    @Autowired
    private DistanceRangeService distanceRangeService;

    // Create new Distance Range entry
    @PostMapping
    public ResponseEntity<DistanceRange> createDistanceRange(@RequestBody DistanceRange distancePricing) {
        DistanceRange createdDistanceRange = distanceRangeService.createDistanceRange(distancePricing);
        return new ResponseEntity<>(createdDistanceRange, HttpStatus.CREATED);
    }

    // Get all DistancePricing entries
    @GetMapping
    public ResponseEntity<List<DistanceRange>> getAllDistanceRanges() {
        List<DistanceRange> distanceRanges = distanceRangeService.getAllDistanceRanges();
        return new ResponseEntity<>(distanceRanges, HttpStatus.OK);
    }

    // Get a single DistancePricing entry by ID
    @GetMapping("/{id}")
    public ResponseEntity<DistanceRange> getDistanceRangeById(@PathVariable Long id) {
        DistanceRange distanceRange = distanceRangeService.getDistanceRangeById(id);
        return new ResponseEntity<>(distanceRange, HttpStatus.OK);
    }

    // Update an existing DistancePricing entry by ID
    @PutMapping("/{id}")
    public ResponseEntity<DistanceRange> updateDistanceRangeById(@PathVariable Long id, @RequestBody DistanceRange distancePricing) {
        DistanceRange updatedDistanceRange = distanceRangeService.updateDistanceRangeById(id, distancePricing);
        return new ResponseEntity<>(updatedDistanceRange, HttpStatus.OK);
    }

    // Delete a DistancePricing entry by ID
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteDistanceRangeById(@PathVariable Long id) {
    	distanceRangeService.deleteDistanceRangeById(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
