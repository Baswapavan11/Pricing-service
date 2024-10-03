

package com.pricing.controller;

import com.pricing.model.VehicleType;
import com.pricing.service.VehicleTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/vehicle-types")
public class VehicleTypeController {

    @Autowired
    private VehicleTypeService vehicleTypeService;

    // Create new VehicleType entry
    @PostMapping
    public ResponseEntity<VehicleType> createVehicleType(@RequestBody VehicleType vehicleType) {
        VehicleType createdVehicleType = vehicleTypeService.createVehicleType(vehicleType);
        return new ResponseEntity<>(createdVehicleType, HttpStatus.CREATED);
    }

    // Get all VehicleType entries
    @GetMapping
    public ResponseEntity<List<VehicleType>> getAllVehicleTypes() {
        List<VehicleType> vehicleTypes = vehicleTypeService.getAllVehicleTypes();
        return new ResponseEntity<>(vehicleTypes, HttpStatus.OK);
    }

    // Get a single VehicleType entry by ID
    @GetMapping("/{id}")
    public ResponseEntity<VehicleType> getVehicleTypeById(@PathVariable Long id) {
        VehicleType vehicleType = vehicleTypeService.getVehicleTypeById(id);
        return new ResponseEntity<>(vehicleType, HttpStatus.OK);
    }

    // Update an existing VehicleType entry by ID
    @PutMapping("/{id}")
    public ResponseEntity<VehicleType> updateVehicleType(@PathVariable Long id, @RequestBody VehicleType vehicleType) {
        VehicleType updatedVehicleType = vehicleTypeService.updateVehicleType(id, vehicleType);
        return new ResponseEntity<>(updatedVehicleType, HttpStatus.OK);
    }

    // Delete a VehicleType entry by ID
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteVehicleType(@PathVariable Long id) {
        vehicleTypeService.deleteVehicleType(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
