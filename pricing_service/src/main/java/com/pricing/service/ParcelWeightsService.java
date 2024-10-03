package com.pricing.service;

import com.pricing.model.ParcelWeights;
import com.pricing.repository.ParcelWeightsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ParcelWeightsService {

    @Autowired
    private ParcelWeightsRepository parcelWeightsRepository;

    // Create new ParcelWeights
    public ParcelWeights createParcelWeights(ParcelWeights parcelWeights) {
        return parcelWeightsRepository.save(parcelWeights);
    }

    // Get all ParcelWeights entries
    public List<ParcelWeights> getAllParcelWeights() {
        return parcelWeightsRepository.findAll();
    }

    // Get a single ParcelWeights by ID
    public ParcelWeights getParcelWeightsById(Long id) {
        Optional<ParcelWeights> parcelWeights = parcelWeightsRepository.findById(id);
        return parcelWeights.orElseThrow(() -> new RuntimeException("ParcelWeights not found with id " + id));
    }

    // Update ParcelWeights
    public ParcelWeights updateParcelWeights(Long id, ParcelWeights parcelWeightsDetails) {
        ParcelWeights parcelWeights = getParcelWeightsById(id);
        parcelWeights.setWeigthRange(parcelWeightsDetails.getWeigthRange());
        parcelWeights.setMinWeight(parcelWeightsDetails.getMinWeight());
        parcelWeights.setMaxWeight(parcelWeightsDetails.getMaxWeight());
        parcelWeights.setIsActive(parcelWeightsDetails.getIsActive());
        parcelWeights.setUpdatdeAt(parcelWeightsDetails.getUpdatdeAt());
        parcelWeights.setUpdatedBy(parcelWeightsDetails.getUpdatedBy());
        parcelWeights.setCreatedAt(parcelWeightsDetails.getCreatedAt());
        parcelWeights.setCreatedBy(parcelWeightsDetails.getCreatedBy());
        return parcelWeightsRepository.save(parcelWeights);
    }

    // Delete ParcelWeights
    public void deleteParcelWeights(Long id) {
        parcelWeightsRepository.deleteById(id);
    }
}
