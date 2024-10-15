package com.pricing.model;

import java.sql.Date;
import java.sql.Time;
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
@Table(name = "surge_price_management")
public class SurgePriceManagement {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "start_date", nullable = false)
	private Date startDate;
	
	@Column(name = "start_time", nullable = false)
	private Time startTime;
	
	@Column(name = "end_time", nullable = false)
	private Time endTIme;
	
	@Column(name = "fare_structure_id", nullable = false)
	private Long fareStructureId;
	
	@Column(name = "end_date", nullable = false)
	private Date endDate;
	
	@Column(name = "created_at")
	private LocalDateTime createdAt;
	
	@Column(name = "updated_at")
	private LocalDateTime updatedAt;
	
	@Column(name = "amount", nullable = false)
	private Double amount;
	
	@Column(name = "is_approved", nullable = false)
	private Boolean isApproved;
	
	@Column(name = "is_active", nullable = false)
	private Boolean isActive;
	
	@Column(name = "distance_wise_price", nullable = false)
	private Long distanceWisePrice;
	
	@Column(name = "multiplier", nullable = false)
	private Float multiplier;
	
	@Column(name = "created_by", nullable = false)
	private Long createdBy;
	
	@Column(name = "updated_by", nullable = false)
	private Long updatedBy;
	
	@Column(name = "approved_at")
	private LocalDateTime approvedAt;
	
	@Column(name = "approved_by", nullable = false)
	private Long approvedBy;

}
