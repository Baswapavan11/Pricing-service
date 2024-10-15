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

import com.pricing.model.FarePricingStructure;
import com.pricing.service.FarePricingStructureService;

@RestController
@RequestMapping("/api/fare-pricing-structure")
public class FarePricingStructureController {

	@Autowired
	private FarePricingStructureService farePricingStructureService;
	
	// Create new Fare pricing structure entry
    @PostMapping
    public ResponseEntity<FarePricingStructure> createFarePricingStructure(@RequestBody FarePricingStructure farePricingStructure) {
    	FarePricingStructure createdFarePricingStructure = farePricingStructureService.createFarePricingStructure(farePricingStructure);
        return new ResponseEntity<>(createdFarePricingStructure, HttpStatus.CREATED);
    }

    // Get all Fare price structures entries
    @GetMapping
    public ResponseEntity<List<FarePricingStructure>> getAllFarePriceStructure() {
        List<FarePricingStructure> farePricingStructure = farePricingStructureService.getAllFarePriceStructure();
        return new ResponseEntity<>(farePricingStructure, HttpStatus.OK);
    }
    
    // Get a single Fare price structure entry by ID
    @GetMapping("/{id}")
    public ResponseEntity<FarePricingStructure> getFarePriceStructureById(@PathVariable Long id) {
    	FarePricingStructure farePricingStructure = farePricingStructureService.getFarePriceStructureById(id);
        return new ResponseEntity<>(farePricingStructure, HttpStatus.OK);
    }
	

    // Update an existing Fare price structure entry by ID
    @PutMapping("/{id}")
    public ResponseEntity<FarePricingStructure> updateFarePricingStructureById(@PathVariable Long id, @RequestBody FarePricingStructure  farePricingStructure) {
    	FarePricingStructure updatedFarePricingStructureById = farePricingStructureService.updateFarePricingStructureById(id, farePricingStructure);
        return new ResponseEntity<>(updatedFarePricingStructureById, HttpStatus.OK);
    }
    
    // Delete a Fare type entry by ID
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteFarePricingStructureById(@PathVariable Long id) {
    	farePricingStructureService.deleteFarePricingStructureById(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
    
    
}
