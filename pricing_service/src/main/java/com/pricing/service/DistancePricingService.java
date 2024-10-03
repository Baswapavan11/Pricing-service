package com.pricing.service;

import com.pricing.model.DistancePricing;
import com.pricing.repository.DistancePricingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DistancePricingService {

    @Autowired
    private DistancePricingRepository distancePricingRepository;

    // Create new DistancePricing
    public DistancePricing createDistancePricing(DistancePricing distancePricing) {
        return distancePricingRepository.save(distancePricing);
    }

    // Get all DistancePricing entries
    public List<DistancePricing> getAllDistancePricings() {
        return distancePricingRepository.findAll();
    }

    // Get a single DistancePricing by ID
    public DistancePricing getDistancePricingById(Long id) {
        Optional<DistancePricing> distancePricing = distancePricingRepository.findById(id);
        return distancePricing.orElseThrow(() -> new RuntimeException("DistancePricing not found with id " + id));
    }

    // Update DistancePricing
    public DistancePricing updateDistancePricing(Long id, DistancePricing distancePricingDetails) {
        DistancePricing distancePricing = getDistancePricingById(id);
        distancePricing.setDistanceStart(distancePricingDetails.getDistanceStart());
        distancePricing.setDistanceEnd(distancePricingDetails.getDistanceEnd());
        distancePricing.setPricePerKm(distancePricingDetails.getPricePerKm());
        distancePricing.setUpdatedAt(distancePricingDetails.getUpdatedAt());
        distancePricing.setTenantId(distancePricingDetails.getTenantId());
        distancePricing.setIsApproved(distancePricingDetails.getIsApproved());
        distancePricing.setUpdatedBy(distancePricingDetails.getUpdatedBy());
        distancePricing.setCreatedAt(distancePricingDetails.getCreatedAt());
        distancePricing.setCreatedBy(distancePricingDetails.getCreatedBy());
        return distancePricingRepository.save(distancePricing);
    }

    // Delete DistancePricing
    public void deleteDistancePricing(Long id) {
        distancePricingRepository.deleteById(id);
    }
}
