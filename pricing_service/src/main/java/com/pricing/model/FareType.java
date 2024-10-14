package com.pricing.model;

import jakarta.persistence.*;
import lombok.Data;
import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "fare_type", schema = "pricing_schema")
public class FareType {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(name = "fare_type", nullable = false)
	private String fareType;

	@Column(name = "created_by", nullable = false)
	private Integer createdBy;

	@Column(name = "updated_by")
	private Integer updatedBy;

	@Column(name = "is_active", nullable = false)
	private Boolean isActive = true;

	@Column(name = "created_at", nullable = false, columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
	private LocalDateTime createdAt;

	@Column(name = "updated_at")
	private LocalDateTime updatedAt;

}
