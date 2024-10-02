package com.pricing.model;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;
@Data
@Entity
@Table(name = "base_pricing")
public class BasePricing {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "vehicle_type_id", nullable = false)
    private Long vehicleTypeId;

    @Column(name = "min_fare", nullable = false)
    private Double minFare;

    @Column(name = "cost_per_additional_distance", nullable = false)
    private Double costPerAdditionalDistance;

    @Column(name = "created_at", nullable = false)
    private LocalDateTime createdAt;

    @Column(name = "updated_at")
    private LocalDateTime updatedAt;

    @Column(name = "tenant_id", nullable = false)
    private Long tenantId;

    @Column(name = "base_kilometers", nullable = false)
    private Integer baseKilometers;

    @Column(name = "is_approved", nullable = false)
    private Boolean isApproved;

    @Column(name = "cgst", nullable = false)
    private Double cgst;

    @Column(name = "sgst", nullable = false)
    private Double sgst;

    @Column(name = "service_type", nullable = false)
    private Long serviceType;

}
