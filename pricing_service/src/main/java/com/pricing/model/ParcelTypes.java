package com.pricing.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "parcel_types")
public class ParcelTypes {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "type_name", nullable = false)
	private String typeName;
	
	@Column(name = "tenant_id", nullable = false)
	private Long tenantId;
	
}
