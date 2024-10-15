package com.pricing.service;

import com.pricing.model.SurgePriceManagement;
import com.pricing.repository.SurgePriceManagementRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SurgePriceManagementService {

    @Autowired
    private SurgePriceManagementRepository surgePriceManagementRepository;

    // Create new SurgePriceManagement
    public SurgePriceManagement createSurgePriceManagement(SurgePriceManagement surgePriceManagement) {
        return surgePriceManagementRepository.save(surgePriceManagement);
    }

    // Get all SurgePriceManagement entries
    public List<SurgePriceManagement> getAllSurgePriceManagements() {
        return surgePriceManagementRepository.findAll();
    }

    // Get a single SurgePriceManagement by ID
    public SurgePriceManagement getSurgePriceManagementById(Long id) {
        Optional<SurgePriceManagement> surgePriceManagement = surgePriceManagementRepository.findById(id);
        return surgePriceManagement.orElseThrow(() -> new RuntimeException("SurgePriceManagement not found with id " + id));
    }

    // Update SurgePriceManagement
    public SurgePriceManagement updateSurgePriceManagementById(Long id, SurgePriceManagement surgePriceManagementDetails) {
        SurgePriceManagement surgePriceManagement = getSurgePriceManagementById(id);
        surgePriceManagement.setFareStructureId(surgePriceManagementDetails.getFareStructureId());
        surgePriceManagement.setStartDate(surgePriceManagementDetails.getStartDate());
        surgePriceManagement.setStartTime(surgePriceManagementDetails.getStartTime());
        surgePriceManagement.setEndTIme(surgePriceManagementDetails.getEndTIme());
        surgePriceManagement.setEndDate(surgePriceManagementDetails.getEndDate());
        surgePriceManagement.setAmount(surgePriceManagementDetails.getAmount());
        surgePriceManagement.setMultiplier(surgePriceManagementDetails.getMultiplier());
        surgePriceManagement.setDistanceWisePrice(surgePriceManagementDetails.getDistanceWisePrice());
        surgePriceManagement.setUpdatedAt(surgePriceManagementDetails.getUpdatedAt());
        surgePriceManagement.setIsApproved(surgePriceManagementDetails.getIsApproved());
        surgePriceManagement.setUpdatedBy(surgePriceManagementDetails.getUpdatedBy());
        surgePriceManagement.setIsActive(surgePriceManagementDetails.getIsActive());
        surgePriceManagement.setCreatedAt(surgePriceManagementDetails.getCreatedAt());
        surgePriceManagement.setCreatedBy(surgePriceManagementDetails.getCreatedBy());
        surgePriceManagement.setApprovedAt(surgePriceManagementDetails.getApprovedAt());
        surgePriceManagement.setApprovedBy(surgePriceManagementDetails.getApprovedBy());
        return surgePriceManagementRepository.save(surgePriceManagement);
    }

    // Delete SurgePriceManagement
    public void deleteSurgePriceManagement(Long id) {
        surgePriceManagementRepository.deleteById(id);
    }
}
