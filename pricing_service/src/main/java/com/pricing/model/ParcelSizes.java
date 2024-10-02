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
@Table(name = "parcel_sizes")
public class ParcelSizes {
	
	@Id
	 @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "size_name", nullable = false)
	private String sizeName;
	
	@Column(name = "min_dimension", nullable = false)
	private Double minDimension;
	
	@Column(name = "max_dimension", nullable = false)
	private Double maxDimension;
	
	@Column(name = "created_at")
	private LocalDateTime createdAt;
	
	@Column(name = "updated_at")
	private LocalDateTime updatedAt;
	
	@Column(name = "is_active", nullable = false)
	private Long isActive;
	
	@Column(name = "created_by", nullable = false)
	private Long createdBy;
	
	@Column(name = "updated_by", nullable = false)
	private Long updatedBy;

}
