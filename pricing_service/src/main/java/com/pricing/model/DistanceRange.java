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
public class DistanceRange {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(name = "distance_start")
	private Double minKm;

	@Column(name = "distance_end")
	private Double maxKm;

	@Column(name = "is_active", nullable = false)
	private Boolean isActive;
	
	@Column(name = "created_at")
	private LocalDateTime createdAt;

	@Column(name = "updated_at")
	private LocalDateTime updatedAt;


	@Column(name = "is_approved", nullable = false)
	private Boolean isApproved;

	@Column(name = "created_by", nullable = false)
	private Long createdBy;

	@Column(name = "updated_by", nullable = false)
	private Long updatedBy;

}
