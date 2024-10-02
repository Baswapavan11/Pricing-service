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
@Table(name="parcel_weights")
public class ParcelWeights {

	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "weight_range", nullable = false)
	private String weigthRange;
	
	@Column(name = "min_weight", nullable = false)
	private Double minWeight;
	
	@Column(name = "max_weight", nullable = false)
	private Double maxWeight;
	
	@Column(name = "created_at")
	private LocalDateTime createdAt;
	
	@Column(name = "updated_at")
	private LocalDateTime updatdeAt;
	
	@Column(name = "is_active", nullable = false)
	private Long isActive;
	
	@Column(name = "created_by", nullable = false)
	private Long createdBy;
	
	@Column(name = "updated_by", nullable = false)
	private Long updatedBy;
	
}
