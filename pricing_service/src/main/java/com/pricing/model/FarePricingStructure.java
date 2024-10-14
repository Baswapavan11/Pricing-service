package com.pricing.model;

import jakarta.persistence.*;
import lombok.Data;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "fare_pricing_structure", schema = "pricing_schema")
public class FarePricingStructure {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(name = "vehicle_type_id", nullable = false)
	private Long vehicleTypeId;

	@Column(name = "min_fare", nullable = false)
	private Double minFare;

	@Column(name = "created_at", nullable = false, columnDefinition = "TIMESTAMPTZ DEFAULT CURRENT_TIMESTAMP")
	private LocalDateTime createdAt;

	@Column(name = "updated_at", nullable = false, columnDefinition = "TIMESTAMPTZ DEFAULT CURRENT_TIMESTAMP")
	private LocalDateTime updatedAt;

	@Column(name = "tenant_id", nullable = false)
	private Long tenantId;

	@Column(name = "base_kilometers")
	private Integer baseKilometers;

	@Column(name = "is_approved", nullable = false)
	private Boolean isApproved = false;

	@Column(name = "created_by")
	private Long createdBy;

	@Column(name = "updated_by")
	private Long updatedBy;

	@Column(name = "pick_up_charges", columnDefinition = "NUMERIC(10, 2) DEFAULT 0.00")
	private BigDecimal pickUpCharges;

	@Column(name = "booking_fare_type_id")
	private Integer bookingFareTypeId;

	@Column(name = "booking_fee", columnDefinition = "NUMERIC(10, 2) DEFAULT 0.00")
	private BigDecimal bookingFee;

	@Column(name = "is_active")
	private Boolean isActive;

	@Column(name = "approved_at")
	private LocalDateTime approvedAt;

	@Column(name = "approved_by")
	private Integer approvedBy;

	@Column(name = "lable_name")
	private String lableName;

	@Column(name = "vehicle_type_id")
	private int vehicleType;

	@Column(name = "booking_fare_type_id")
	private BookingFareType bookingFareType;
}
