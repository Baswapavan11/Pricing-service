package com.pricing.model;

import java.math.BigDecimal;
import java.time.LocalDate;
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
@Table(name = "additional_charges")
public class AdditionalCharges {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "charge_type", nullable = false)
	private String chargeType;
	
	@Column(name = "per_minute_charge", nullable = false)
	private BigDecimal perMinuteCharge;
	
	@Column(name = "conditions", nullable = false)
	private String conditions;
	
	@Column(name = "fare_structure_id", nullable = false)
	private Long fareStructureId;
	
	@Column(name = "vehicle_type_id", nullable = false)
	private LocalDateTime createdAt;
	
	@Column(name = "user_id")
	private Long userId;
	
	@Column(name = "updated_at")
	private LocalDateTime updatedAt;
	
	@Column(name = "vehicle_type_id", nullable = false)
	private Long createdBy;
	
	@Column(name = "updated_by", nullable = false)
	private Long updatedBy;
	
	@Column(name = "per_kilometer_charge", nullable = false)
	private BigDecimal perKilometerCharge;
	
	@Column(name = "is_approved", nullable = false)
	private Long isApproved;
	
	@Column(name = "is_active", nullable = false)
	private Boolean isActive;
	
	@Column(name = "approved_at", nullable = false)
	private LocalDate approvedAT;
	
	@Column(name = "approved_by", nullable = false)
	private Long approvedBy;
	
}
