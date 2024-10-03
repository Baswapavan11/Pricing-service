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
    public SurgePriceManagement updateSurgePriceManagement(Long id, SurgePriceManagement surgePriceManagementDetails) {
        SurgePriceManagement surgePriceManagement = getSurgePriceManagementById(id);
        surgePriceManagement.setStartDate(surgePriceManagementDetails.getStartDate());
        surgePriceManagement.setDay(surgePriceManagementDetails.getDay());
        surgePriceManagement.setStartTime(surgePriceManagementDetails.getStartTime());
        surgePriceManagement.setEndTIme(surgePriceManagementDetails.getEndTIme());
        surgePriceManagement.setVehicleTypeId(surgePriceManagementDetails.getVehicleTypeId());
        surgePriceManagement.setEndDate(surgePriceManagementDetails.getEndDate());
        surgePriceManagement.setDayOfWeek(surgePriceManagementDetails.getDayOfWeek());
        surgePriceManagement.setAmount(surgePriceManagementDetails.getAmount());
        surgePriceManagement.setMultiplier(surgePriceManagementDetails.getMultiplier());
        surgePriceManagement.setDistanceWisePrice(surgePriceManagementDetails.getDistanceWisePrice());
        surgePriceManagement.setUpdatedAt(surgePriceManagementDetails.getUpdatedAt());
        surgePriceManagement.setTenantId(surgePriceManagementDetails.getTenantId());
        surgePriceManagement.setIsApproved(surgePriceManagementDetails.getIsApproved());
        surgePriceManagement.setUpdatedBy(surgePriceManagementDetails.getUpdatedBy());
        surgePriceManagement.setCgst(surgePriceManagementDetails.getCgst());
        surgePriceManagement.setSgst(surgePriceManagementDetails.getSgst());
        surgePriceManagement.setServiceType(surgePriceManagementDetails.getServiceType());
        return surgePriceManagementRepository.save(surgePriceManagement);
    }

    // Delete SurgePriceManagement
    public void deleteSurgePriceManagement(Long id) {
        surgePriceManagementRepository.deleteById(id);
    }
}
