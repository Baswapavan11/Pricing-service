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
@Table(name = "distance_pricing")
public class DistancePricing {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "distance_start", nullable = false)
	private Double distanceStart;
	
	@Column(name = "distance_end", nullable = false)
	private Double distanceEnd;
	
	@Column(name = "price_per_km", nullable = false)
	private Double pricePerKm;
	
	@Column(name = "created_at")
	private LocalDateTime createdAt;
	
	@Column(name = "updated_at")
	private LocalDateTime updatedAt;
	
	@Column(name = "tenant_id", nullable = false)
	private Long tenantId;
	
	@Column(name = "is_approved", nullable = false)
	private Boolean isApproved;
	
	@Column(name = "created_by", nullable = false)
	private Long createdBy;
	
	@Column(name = "updated_by", nullable = false)
	private Long updatedBy;
	
}
