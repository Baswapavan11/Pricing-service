package com.pricing.model;

import java.sql.Date;

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
	
	@Column(name = "vehicle_type", nullable = false)
	private Long vehicleType;
	
	@Column(name = "valid_from", nullable = false)
	private Date validFrom;
	
	@Column(name = "valid_to", nullable = false)
	private Date validTo;
	
}
