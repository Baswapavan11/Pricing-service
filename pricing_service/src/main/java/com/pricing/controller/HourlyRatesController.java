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

import com.pricing.model.HourlyRates;
import com.pricing.service.HourlyRatesService;

@RestController
@RequestMapping("/api/hourly-rates")
public class HourlyRatesController {

	@Autowired
	private HourlyRatesService hourlyRatesService;
	

	// Create new Hourly rate entry
	@PostMapping
	public ResponseEntity<HourlyRates> createHourlyRate(@RequestBody HourlyRates hourlyRates) {
		HourlyRates createdHourlyRate = hourlyRatesService.createHourlyRate(hourlyRates);
      return new ResponseEntity<>(createdHourlyRate, HttpStatus.CREATED);
	}
	
	
    // Get all Hourly rates entries
    @GetMapping
    public ResponseEntity<List<HourlyRates>> getAllHourlyRates() {
        List<HourlyRates> hourlyRates = hourlyRatesService.getAllHourlyRates();
        return new ResponseEntity<>(hourlyRates, HttpStatus.OK);
    }
    // Get a single Hourly rate entry by ID
    @GetMapping("/{id}")
    public ResponseEntity<HourlyRates> getHourlyRateById(@PathVariable Long id) {
    	HourlyRates hourlyRate = hourlyRatesService.getHourlyRateById(id);
        return new ResponseEntity<>(hourlyRate, HttpStatus.OK);
    }


    // Update an existing Flat price entry by ID
    @PutMapping("/{id}")
    public ResponseEntity<HourlyRates> updateHourlyRate(@PathVariable Long id, @RequestBody HourlyRates  hourlyRates) {
    	HourlyRates updatedHourlyRate = hourlyRatesService.updateHourlyRate(id, hourlyRates);
        return new ResponseEntity<>(updatedHourlyRate, HttpStatus.OK);
    }
    
    // Delete a Hourly rate entry by ID
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteHourlyRateById(@PathVariable Long id) {
    	hourlyRatesService.deleteHourlyRateById(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
	
}
