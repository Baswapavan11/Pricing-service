package com.pricing.service;

import com.pricing.model.VehicleType;
import com.pricing.repository.VehicleTypeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class VehicleTypeService {

    @Autowired
    private VehicleTypeRepository vehicleTypeRepository;

    // Create new VehicleType
    public VehicleType createVehicleType(VehicleType vehicleType) {
        return vehicleTypeRepository.save(vehicleType);
    }

    // Get all VehicleType entries
    public List<VehicleType> getAllVehicleTypes() {
        return vehicleTypeRepository.findAll();
    }

    // Get a single VehicleType by ID
    public VehicleType getVehicleTypeById(Long id) {
        Optional<VehicleType> vehicleType = vehicleTypeRepository.findById(id);
        return vehicleType.orElseThrow(() -> new RuntimeException("VehicleType not found with id " + id));
    }

    // Update VehicleType
    public VehicleType updateVehicleType(Long id, VehicleType vehicleTypeDetails) {
        VehicleType vehicleType = getVehicleTypeById(id);
        vehicleType.setName(vehicleTypeDetails.getName());
        vehicleType.setUpdatedAt(vehicleTypeDetails.getUpdatedAt());
        vehicleType.setTenantId(vehicleTypeDetails.getTenantId());
        vehicleType.setIsActive(vehicleTypeDetails.getIsActive());
        vehicleType.setUpdatedBy(vehicleTypeDetails.getUpdatedBy());
        vehicleType.setCreatedAt(vehicleTypeDetails.getCreatedAt());
        vehicleType.setCreatedBy(vehicleTypeDetails.getCreatedBy());
        return vehicleTypeRepository.save(vehicleType);
    }

    // Delete VehicleType
    public void deleteVehicleType(Long id) {
        vehicleTypeRepository.deleteById(id);
    }
}
