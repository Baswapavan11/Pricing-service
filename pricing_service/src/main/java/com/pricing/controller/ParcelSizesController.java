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

import com.pricing.model.ParcelSizes;
import com.pricing.service.ParcelSizesService;

@RestController
@RequestMapping("/api/parcel-sizes")
public class ParcelSizesController {

	@Autowired
	private ParcelSizesService parcelSizesService;
	
	 // Create a new ParcelSize entry
    @PostMapping
    public ResponseEntity<ParcelSizes> createParcelSizes(@RequestBody ParcelSizes parcelSizes) {
        ParcelSizes createdParcelSizes = parcelSizesService.createParcelSizes(parcelSizes);
        return new ResponseEntity<>(createdParcelSizes, HttpStatus.CREATED);
    }
	
    // Get all ParcelSizes entries
    @GetMapping
    public ResponseEntity<List<ParcelSizes>> getAllParcelSizes() {
        List<ParcelSizes> parcelSizesList = parcelSizesService.getAllParcelSizes();
        return new ResponseEntity<>(parcelSizesList, HttpStatus.OK);
    }
    
 // Get a single ParcelSize entry by ID
    @GetMapping("/{id}")
    public ResponseEntity<ParcelSizes> getParcelSizeById(@PathVariable Long id) {
        ParcelSizes parcelSize= parcelSizesService.getParcelSizeById(id);
        return new ResponseEntity<>(parcelSize, HttpStatus.OK);
    }
    
    // Update an existing ParcelSizes entry by ID
    @PutMapping("/{id}")
    public ResponseEntity<ParcelSizes> updateParcelSizes(@PathVariable Long id, @RequestBody ParcelSizes parcelSizes) {
        ParcelSizes updatedParcelSizes = parcelSizesService.updateParcelSizes(id, parcelSizes);
        return new ResponseEntity<>(updatedParcelSizes, HttpStatus.OK);
    }

    // Delete a ParcelSize entry by ID
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteParcelSize(@PathVariable Long id) {
        parcelSizesService.deleteParcelSize(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
