package com.pricing.model;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "pricing_approval")
public class PricingApproval {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "pricing_id", nullable = false)
    private Long pricingId;

    @Column(name = "pricing_type", nullable = false)
    private String pricingType;

    @Column(name = "submitted_by", nullable = false)
    private Long submittedBy;

    @Column(name = "submitted_at", nullable = false)
    private LocalDateTime submittedAt;

    @Column(name = "status", nullable = false)
    private String status;

    @Column(name = "approver_id")
    private Long approverId;

    @Column(name = "approved_at")
    private LocalDateTime approvedAt;

    @Column(name = "feedback")
    private String feedback;

    @Column(name = "base_price_id", nullable = false)
    private Long basePriceId;
}
