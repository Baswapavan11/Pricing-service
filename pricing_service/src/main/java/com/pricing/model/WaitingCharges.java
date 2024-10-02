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
@Table(name = "waiting_charges")
public class WaitingCharges {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "free_waiting_time_minutes", nullable = false)
	private Long freeWaitingTimeMinutes;
	
	@Column(name = "charge_per_minute", nullable = false)
	private Double chargePerMinute;
	
	@Column(name = "tenant_id", nullable = false)
	private Long tenantId;
	
	@Column(name = "created_at")
	private LocalDateTime createdAt;
	
	@Column(name = "updated_at")
	private LocalDateTime updatedAt;
	
	@Column(name = "created_by", nullable = false)
	private Long createdBy;
	
	@Column(name = "updated_by", nullable = false)
	private Long updatedBy;
	
}
