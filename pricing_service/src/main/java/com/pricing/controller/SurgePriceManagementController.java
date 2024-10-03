package com.pricing.controller;

import com.pricing.model.SurgePriceManagement;
import com.pricing.service.SurgePriceManagementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/surge-price-management")
public class SurgePriceManagementController {

    @Autowired
    private SurgePriceManagementService surgePriceManagementService;

    // Create a new SurgePriceManagement entry
    @PostMapping
    public ResponseEntity<SurgePriceManagement> createSurgePriceManagement(@RequestBody SurgePriceManagement surgePriceManagement) {
        SurgePriceManagement createdSurgePriceManagement = surgePriceManagementService.createSurgePriceManagement(surgePriceManagement);
        return new ResponseEntity<>(createdSurgePriceManagement, HttpStatus.CREATED);
    }

    // Get all SurgePriceManagement entries
    @GetMapping
    public ResponseEntity<List<SurgePriceManagement>> getAllSurgePriceManagements() {
        List<SurgePriceManagement> surgePriceManagements = surgePriceManagementService.getAllSurgePriceManagements();
        return new ResponseEntity<>(surgePriceManagements, HttpStatus.OK);
    }

    // Get a single SurgePriceManagement entry by ID
    @GetMapping("/{id}")
    public ResponseEntity<SurgePriceManagement> getSurgePriceManagementById(@PathVariable Long id) {
        SurgePriceManagement surgePriceManagement = surgePriceManagementService.getSurgePriceManagementById(id);
        return new ResponseEntity<>(surgePriceManagement, HttpStatus.OK);
    }

    // Update an existing SurgePriceManagement entry by ID
    @PutMapping("/{id}")
    public ResponseEntity<SurgePriceManagement> updateSurgePriceManagement(@PathVariable Long id, @RequestBody SurgePriceManagement surgePriceManagement) {
        SurgePriceManagement updatedSurgePriceManagement = surgePriceManagementService.updateSurgePriceManagement(id, surgePriceManagement);
        return new ResponseEntity<>(updatedSurgePriceManagement, HttpStatus.OK);
    }

    // Delete a SurgePriceManagement entry by ID
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteSurgePriceManagement(@PathVariable Long id) {
        surgePriceManagementService.deleteSurgePriceManagement(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
