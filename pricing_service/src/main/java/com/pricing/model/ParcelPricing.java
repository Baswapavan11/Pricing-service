package com.pricing.model;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "parcel_pricing")
public class ParcelPricing {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Column(name = "parcel_type_id", nullable = false)
    private Long parcelTypeId;
	
    @Column(name = "parcel_size_id", nullable = false)
    private Long parcelSizeId;
    
    @Column(name = "parcel_weight_id", nullable = false)
    private Long parcelWeightId;
    
    @Column(name = "price", nullable = false)
    private double price;
    
    @Column(name = "created_at")
    private LocalDateTime createdAt;
    
    @Column(name = "updated_at")
    private LocalDateTime updatedAt;
    
    @Column(name = "created_by", nullable = false)
    private Long createdBy;
    
    @Column(name = "updated_by", nullable = false)
    private Long updatedBy;
}
