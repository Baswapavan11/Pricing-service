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

import com.pricing.model.FareType;
import com.pricing.service.FareTypeService;

@RestController
@RequestMapping("/api/fare-type")
public class FareTypeController {

	@Autowired
	private FareTypeService fareTypeService;
	
	  // Create new Fare type entry
    @PostMapping
    public ResponseEntity<FareType> createFareType(@RequestBody FareType fareType) {
    	FareType createdFareType = fareTypeService.createFlatPrice(fareType);
        return new ResponseEntity<>(createdFareType, HttpStatus.CREATED);
    }
	
    // Get all Fare prices entries
    @GetMapping
    public ResponseEntity<List<FareType>> getAllFareTypes() {
        List<FareType> fareTypes = fareTypeService.getAllFareTypes();
        return new ResponseEntity<>(fareTypes, HttpStatus.OK);
    }
    
    // Get a single Fare type entry by ID
    @GetMapping("/{id}")
    public ResponseEntity<FareType> getFareTypeById(@PathVariable Long id) {
    	FareType fareType = fareTypeService.getFlatPriceById(id);
        return new ResponseEntity<>(fareType, HttpStatus.OK);
    }
    


    // Update an existing Fare type entry by ID
    @PutMapping("/{id}")
    public ResponseEntity<FareType> updateFareTypeById(@PathVariable Long id, @RequestBody FareType  fareType) {
    	FareType updatedFareType = fareTypeService.updateFareTypeById(id, fareType);
        return new ResponseEntity<>(updatedFareType, HttpStatus.OK);
    }
    
    // Delete a Fare type entry by ID
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteFareTypeById(@PathVariable Long id) {
    	fareTypeService.deleteFareTypeById(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
    
    
}
