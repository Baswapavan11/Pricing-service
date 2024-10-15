package com.pricing.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pricing.model.DistanceRange;
import com.pricing.repository.DistanceRangeRepository;

@Service
public class DistanceRangeService {

    @Autowired
    private DistanceRangeRepository distanceRangeRepository;

    // Create new DistancePricing
    public DistanceRange createDistanceRange(DistanceRange distancePricing) {
        return distanceRangeRepository.save(distancePricing);
    }

    // Get all DistancePricing entries
    public List<DistanceRange> getAllDistanceRanges() {
        return distanceRangeRepository.findAll();
    }

    // Get a single DistancePricing by ID
    public DistanceRange getDistanceRangeById(Long id) {
        Optional<DistanceRange> distancePricing = distanceRangeRepository.findById(id);
        return distancePricing.orElseThrow(() -> new RuntimeException("DistancePricing not found with id " + id));
    }

    // Update DistancePricing
    public DistanceRange updateDistanceRangeById(Long id, DistanceRange distanceRange) {
        DistanceRange distance =getDistanceRangeById(id);
        distance.setIsActive(distanceRange.getIsActive());
        distance.setMinKm(distanceRange.getMinKm());
        distance.setMaxKm(distanceRange.getMaxKm());
        distance.setUpdatedAt(distanceRange.getUpdatedAt());
        distance.setIsApproved(distanceRange.getIsApproved());
        distance.setUpdatedBy(distanceRange.getUpdatedBy());
        distance.setCreatedAt(distanceRange.getCreatedAt());
        distance.setCreatedBy(distanceRange.getCreatedBy());
        return distanceRangeRepository.save(distance);
    }

    // Delete DistancePricing
    public void deleteDistanceRangeById(Long id) {
    	distanceRangeRepository.deleteById(id);
    }
}
