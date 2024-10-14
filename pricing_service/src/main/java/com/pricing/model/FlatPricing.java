package com.pricing.model;

import jakarta.persistence.*;
import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "flat_pricing", schema = "pricing_schema")
public class FlatPricing {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	@Column(name = "fare_structure_id", nullable = false)
	private Integer fareStructureId;

	@Column(name = "distance_range_id", nullable = false)
	private Integer distanceRangeId;

	@Column(name = "flat_price", nullable = false, columnDefinition = "NUMERIC(10, 2)")
	private BigDecimal flatPrice;

	@Column(name = "is_active", nullable = false)
	private Boolean isActive = true;

	@Column(name = "created_by", nullable = false)
	private Integer createdBy;

	@Column(name = "created_at", nullable = false, columnDefinition = "TIMESTAMPTZ DEFAULT CURRENT_TIMESTAMP")
	private LocalDateTime createdAt;

	@Column(name = "approved_by")
	private Integer approvedBy;

	@Column(name = "approved_at")
	private LocalDateTime approvedAt;

	@Column(name = "is_approved", nullable = false)
	private Integer isApproved;

	@Column(name = "updated_at", nullable = false, columnDefinition = "TIMESTAMPTZ DEFAULT CURRENT_TIMESTAMP")
	private LocalDateTime updatedAt;

	@Column(name = "updated_by", nullable = false)
	private Integer updatedBy;

	@Column(name = "fare_structure_id")
	private FarePricingStructure farePricingStructure;

	@Column(name = "distance_range")
	private int distanceRange;
}
