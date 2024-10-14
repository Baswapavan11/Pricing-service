package com.pricing.model;

import jakarta.persistence.*;
import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "hourly_rates", schema = "pricing_schema")
public class HourlyRates {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	@Column(name = "fare_structure_id", nullable = false)
	private Integer fareStructureId;

	@Column(name = "hours", nullable = false)
	private Integer hours;

	@Column(name = "kilometers", nullable = false)
	private Integer kilometers;

	@Column(name = "updated_at")
	private LocalDateTime updatedAt;

	@Column(name = "updated_by")
	private Integer updatedBy;

	@Column(name = "is_approved", nullable = false)
	private Integer isApproved;

	@Column(name = "is_active", nullable = false)
	private Boolean isActive = true;

	@Column(name = "price", nullable = false, columnDefinition = "NUMERIC(10, 2)")
	private BigDecimal price;

	@Column(name = "created_at")
	private LocalDateTime createdAt;

	@Column(name = "created_by")
	private Integer createdBy;

	@Column(name = "fare_pricing_structure")
	private int farePricingStructure;
}
