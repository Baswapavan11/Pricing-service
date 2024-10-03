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
	
	@Column(name = "day", nullable = false)
	private String day;
	
	@Column(name = "start_time", nullable = false)
	private Time startTime;
	
	@Column(name = "end_time", nullable = false)
	private Time endTIme;
	
	@Column(name = "vehicle_type_id", nullable = false)
	private Long vehicleTypeId;
	
	@Column(name = "end_date", nullable = false)
	private Date endDate;
	
	@Column(name = "day_of_week", nullable = false)
	private String dayOfWeek;
	
	@Column(name = "created_at")
	private LocalDateTime createdAt;
	
	@Column(name = "updated_at")
	private LocalDateTime updatedAt;
	
	@Column(name = "tenant_id", nullable = false)
	private Long tenantId;
	
	@Column(name = "amount", nullable = false)
	private Double amount;
	
	@Column(name = "is_approved", nullable = false)
	private Boolean isApproved;
	
	@Column(name = "distance_wise_price", nullable = false)
	private Long distanceWisePrice;
	
	@Column(name = "multiplier", nullable = false)
	private Float multiplier;
	
	@Column(name = "created_by", nullable = false)
	private Long createdBy;
	
	@Column(name = "updated_by", nullable = false)
	private Long updatedBy;
	
	@Column(name = "cgst", nullable = false)
	private Float cgst;
	
	@Column(name = "sgst", nullable = false)
	private Float sgst;
	
	@Column(name = "service_type", nullable = false)
	private Long serviceType;
}
