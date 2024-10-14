package com.pricing.model;

import jakarta.persistence.*;
import lombok.Data;
import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "booking_fare_type", schema = "pricing_schema")
public class BookingFareType {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(name = "service_offerings_id", nullable = false)
	private Integer serviceOfferingsId;

	@Column(name = "fare_type_id", nullable = false)
	private Integer fareTypeId;

	@Column(name = "created_by")
	private Integer createdBy;

	@Column(name = "updated_by")
	private Integer updatedBy;

	@Column(name = "is_active", nullable = false)
	private Boolean isActive = true;

	@Column(name = "created_at", nullable = false, columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
	private LocalDateTime createdAt;

	@Column(name = "updated_at")
	private LocalDateTime updatedAt;

	@Column(name = "service_offerings_id")
	private int serviceOfferings;

	@Column(name = "fare_type_id")
	private int fareType;
}
