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

import com.pricing.model.PricingApproval;
import com.pricing.service.PricingApprovalService;

@RestController
@RequestMapping("/api/pricing-Approval")
public class PricingApprovalController {

	@Autowired
	private PricingApprovalService pricingApprovalService;

	// Create a new PriceApproval entry
	@PostMapping
	public ResponseEntity<PricingApproval> createPricingApproval(@RequestBody PricingApproval pricingApproval) {
		PricingApproval createdPricingApproval = pricingApprovalService.createParcelSizes(pricingApproval);
		return new ResponseEntity<>(createdPricingApproval, HttpStatus.CREATED);
	}

	// Get all PriceApprovals entries
	@GetMapping
	public ResponseEntity<List<PricingApproval>> getAllPriceApprovals() {
		List<PricingApproval> priceApprovalList = pricingApprovalService.getAllPriceApprovals();
		return new ResponseEntity<>(priceApprovalList, HttpStatus.OK);
	}

	// Get a single ParcelSize entry by ID
	@GetMapping("/{id}")
	public ResponseEntity<PricingApproval> getPricepprovedById(@PathVariable Long id) {
		PricingApproval priceApproved = pricingApprovalService.getPricepprovedById(id);
		return new ResponseEntity<>(priceApproved, HttpStatus.OK);
	}

	// Update an existing PriceApproval entry by ID
	@PutMapping("/{id}")
	public ResponseEntity<PricingApproval> updatePriceApproval(@PathVariable Long id,
			@RequestBody PricingApproval pricingApproval) {
		PricingApproval updatedPriceApproval = pricingApprovalService.updatePriceApproval(id, pricingApproval);
		return new ResponseEntity<>(updatedPriceApproval, HttpStatus.OK);
	}

	// Delete a priceApproval entry by ID
	@DeleteMapping("/{id}")
	public ResponseEntity<Void> deletePriceapproval(@PathVariable Long id) {
		pricingApprovalService.deletePriceapproval(id);
		return new ResponseEntity<>(HttpStatus.NO_CONTENT);
	}

}
