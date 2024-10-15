package com.pricing.model;

import java.sql.Date;
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
@Table(name = "discounts")
public class Discounts {


	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "discount_type", nullable = false)
	private String discountType;
	
	
	@Column(name = "discount_value", nullable = false)
	private Double discountValue;
	
	@Column(name = "vehicle_type_id", nullable = false)
	private Long vehicleTypeId;
	
	@Column(name = "valid_from", nullable = false)
	private Date validFrom;
	
	@Column(name = "valid_to", nullable = false)
	private Date validTo;
	
	@Column(name = "created_at")
	private LocalDateTime createdAt;
	
	@Column(name = "updated_at")
	private LocalDateTime updatedAt;
	
	@Column(name = "created_by", nullable = false)
	private Long createdBy;
	
	@Column(name = "updated_by", nullable = false)
	private Long updatedBy;
	
	@Column(name = "is_active", nullable = false)
	private Boolean isActive;
	
}
