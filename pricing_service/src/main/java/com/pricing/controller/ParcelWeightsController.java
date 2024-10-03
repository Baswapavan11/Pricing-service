package com.pricing.controller;

import com.pricing.model.ParcelWeights;
import com.pricing.service.ParcelWeightsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/parcel-weights")
public class ParcelWeightsController {

    @Autowired
    private ParcelWeightsService parcelWeightsService;

    // Create a new ParcelWeights entry
    @PostMapping
    public ResponseEntity<ParcelWeights> createParcelWeights(@RequestBody ParcelWeights parcelWeights) {
        ParcelWeights createdParcelWeights = parcelWeightsService.createParcelWeights(parcelWeights);
        return new ResponseEntity<>(createdParcelWeights, HttpStatus.CREATED);
    }

    // Get all ParcelWeights entries
    @GetMapping
    public ResponseEntity<List<ParcelWeights>> getAllParcelWeights() {
        List<ParcelWeights> parcelWeightsList = parcelWeightsService.getAllParcelWeights();
        return new ResponseEntity<>(parcelWeightsList, HttpStatus.OK);
    }

    // Get a single ParcelWeights entry by ID
    @GetMapping("/{id}")
    public ResponseEntity<ParcelWeights> getParcelWeightsById(@PathVariable Long id) {
        ParcelWeights parcelWeights = parcelWeightsService.getParcelWeightsById(id);
        return new ResponseEntity<>(parcelWeights, HttpStatus.OK);
    }

    // Update an existing ParcelWeights entry by ID
    @PutMapping("/{id}")
    public ResponseEntity<ParcelWeights> updateParcelWeights(@PathVariable Long id, @RequestBody ParcelWeights parcelWeights) {
        ParcelWeights updatedParcelWeights = parcelWeightsService.updateParcelWeights(id, parcelWeights);
        return new ResponseEntity<>(updatedParcelWeights, HttpStatus.OK);
    }

    // Delete a ParcelWeights entry by ID
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteParcelWeights(@PathVariable Long id) {
        parcelWeightsService.deleteParcelWeights(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
