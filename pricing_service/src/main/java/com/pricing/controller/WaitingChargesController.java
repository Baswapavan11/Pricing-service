package com.pricing.controller;

import com.pricing.model.WaitingCharges;
import com.pricing.service.WaitingChargesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/waiting-charges")
public class WaitingChargesController {

    @Autowired
    private WaitingChargesService waitingChargesService;

    // Create a new WaitingCharges entry
    @PostMapping
    public ResponseEntity<WaitingCharges> createWaitingCharges(@RequestBody WaitingCharges waitingCharges) {
        WaitingCharges createdWaitingCharges = waitingChargesService.createWaitingCharges(waitingCharges);
        return new ResponseEntity<>(createdWaitingCharges, HttpStatus.CREATED);
    }

    // Get all WaitingCharges entries
    @GetMapping
    public ResponseEntity<List<WaitingCharges>> getAllWaitingCharges() {
        List<WaitingCharges> waitingChargesList = waitingChargesService.getAllWaitingCharges();
        return new ResponseEntity<>(waitingChargesList, HttpStatus.OK);
    }

    // Get a single WaitingCharges entry by ID
    @GetMapping("/{id}")
    public ResponseEntity<WaitingCharges> getWaitingChargesById(@PathVariable Long id) {
        WaitingCharges waitingCharges = waitingChargesService.getWaitingChargesById(id);
        return new ResponseEntity<>(waitingCharges, HttpStatus.OK);
    }

    // Update an existing WaitingCharges entry by ID
    @PutMapping("/{id}")
    public ResponseEntity<WaitingCharges> updateWaitingCharges(@PathVariable Long id, @RequestBody WaitingCharges waitingCharges) {
        WaitingCharges updatedWaitingCharges = waitingChargesService.updateWaitingCharges(id, waitingCharges);
        return new ResponseEntity<>(updatedWaitingCharges, HttpStatus.OK);
    }

    // Delete a WaitingCharges entry by ID
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteWaitingCharges(@PathVariable Long id) {
        waitingChargesService.deleteWaitingCharges(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
