package com.pricing.service;

import com.pricing.model.WaitingCharges;
import com.pricing.repository.WaitingChargesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class WaitingChargesService {

    @Autowired
    private WaitingChargesRepository waitingChargesRepository;

    // Create new WaitingCharges
    public WaitingCharges createWaitingCharges(WaitingCharges waitingCharges) {
        return waitingChargesRepository.save(waitingCharges);
    }

    // Get all WaitingCharges entries
    public List<WaitingCharges> getAllWaitingCharges() {
        return waitingChargesRepository.findAll();
    }

    // Get a single WaitingCharges by ID
    public WaitingCharges getWaitingChargesById(Long id) {
        Optional<WaitingCharges> waitingCharges = waitingChargesRepository.findById(id);
        return waitingCharges.orElseThrow(() -> new RuntimeException("WaitingCharges not found with id " + id));
    }

    // Update WaitingCharges
    public WaitingCharges updateWaitingCharges(Long id, WaitingCharges waitingChargesDetails) {
        WaitingCharges waitingCharges = getWaitingChargesById(id);
        waitingCharges.setFreeWaitingTimeMinutes(waitingChargesDetails.getFreeWaitingTimeMinutes());
        waitingCharges.setChargePerMinute(waitingChargesDetails.getChargePerMinute());
        waitingCharges.setTenantId(waitingChargesDetails.getTenantId());
        waitingCharges.setUpdatedAt(waitingChargesDetails.getUpdatedAt());
        waitingCharges.setUpdatedBy(waitingChargesDetails.getUpdatedBy());
        waitingCharges.setCreatedAt(waitingChargesDetails.getCreatedAt());
        waitingCharges.setCreatedBy(waitingChargesDetails.getCreatedBy());
        return waitingChargesRepository.save(waitingCharges);
    }

    // Delete WaitingCharges
    public void deleteWaitingCharges(Long id) {
        waitingChargesRepository.deleteById(id);
    }
}
